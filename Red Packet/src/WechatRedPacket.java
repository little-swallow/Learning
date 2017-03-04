import java.util.ArrayList;
import java.util.List;

public class WechatRedPacket { 
	private static final float MINMONEY= 0.01f;
	private static final float MAXMONEY= 200f;
	private static final float K = 2f;
	//判断红包金额是不是比0.01小，或者比200大，如果是，则红包无效。
	private boolean isRight(float money,int people) {
		float avg = money/people;
		if(avg < MINMONEY)
			return false;
		else if(avg>MAXMONEY)
			return false;
		else
			return true;
	}
	
	private float randomRedPacket(float money,int people,float minx,float maxx) {
		//如果只有一个人，就返回红包
		if(people == 1) {
			return (float)(Math.round(money*100))/100;
		}
		//如果最小金额等于最大金额，返回最小金额
		if(minx == maxx) {
			return minx;
		}
		//如果最大值比money高，则取money
		float max = maxx>money?money:maxx;
		//Math.random()是令系统随机选取大于等于 0.0 且小于 1.0 的伪随机 double值
		//a=Math.random()*2+1，设置一个随机1到3(取不到3)的变量
		//此处产生一个随机的红包
		float apacket = ((float)Math.random()*(max-minx)+minx);
		//round() 方法可把一个数字舍入为最接近的整数
		apacket = (float)(Math.round(apacket*100))/100;
		float remain = money-apacket;
		//检验剩余红包有效性，如果本次红包使得剩余红包分配出现问题，则应该重新分配红包
		if(isRight(remain,people-1)) {
			return apacket;
		}else {
			float avg = remain/(people-1);
			//如果这一次分配红包导致剩余红包平均值小于0.01，则这次红包分配值过大，重新分配，将最大值设置为此次红包值
			if(avg < MINMONEY) {
			//递归调用
				return randomRedPacket(money,people,minx,apacket);
			}else if(avg > MAXMONEY) {
			//如果分配后导致剩余红包平均值大于200，则此次红包分配值过小，重新分配，区间为此次红包值~红包最大值
				return randomRedPacket(money,people,apacket,maxx);
			}
		}
		return apacket;
	}
	
	public List<Float>distribute(float money,int people) {
		//红包是否有效
		if(!isRight(money,people)) {
			return null;
		}
		//定义一个list来存放每个红包的金额
		List<Float> list = new ArrayList<Float>();
		//红包分配原则，每个人的红包金额=剩余红包总金额/剩余人数（剩余红包金额平均数）*系数K（此处选择K=2）
		//即，若一个100元的红包，前三个人抢走了40，第四个人能抢的金额最多=（100-40）/7*2, 0.01~17.14之间，反复调用这个算法
		float max = (float)(money/people*K);
		max = max>MAXMONEY?MAXMONEY:max;
		//分配红包
		for(int i = 0;i< people;i++) {
			float apacket=randomRedPacket(money,people-i,MINMONEY,max);
			list.add(apacket);
			money = money-apacket;
		}
		return list;
	}
	public static void main(String[] args) {
		WechatRedPacket rp = new WechatRedPacket();
		System.out.println(rp.distribute(5,8));
	}
}
