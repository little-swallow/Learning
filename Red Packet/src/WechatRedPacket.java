import java.util.ArrayList;
import java.util.List;

public class WechatRedPacket { 
	private static final float MINMONEY= 0.01f;
	private static final float MAXMONEY= 200f;
	private static final float K = 2f;
	//�жϺ������ǲ��Ǳ�0.01С�����߱�200������ǣ�������Ч��
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
		//���ֻ��һ���ˣ��ͷ��غ��
		if(people == 1) {
			return (float)(Math.round(money*100))/100;
		}
		//�����С����������������С���
		if(minx == maxx) {
			return minx;
		}
		//������ֵ��money�ߣ���ȡmoney
		float max = maxx>money?money:maxx;
		//Math.random()����ϵͳ���ѡȡ���ڵ��� 0.0 ��С�� 1.0 ��α��� doubleֵ
		//a=Math.random()*2+1������һ�����1��3(ȡ����3)�ı���
		//�˴�����һ������ĺ��
		float apacket = ((float)Math.random()*(max-minx)+minx);
		//round() �����ɰ�һ����������Ϊ��ӽ�������
		apacket = (float)(Math.round(apacket*100))/100;
		float remain = money-apacket;
		//����ʣ������Ч�ԣ�������κ��ʹ��ʣ��������������⣬��Ӧ�����·�����
		if(isRight(remain,people-1)) {
			return apacket;
		}else {
			float avg = remain/(people-1);
			//�����һ�η���������ʣ����ƽ��ֵС��0.01������κ������ֵ�������·��䣬�����ֵ����Ϊ�˴κ��ֵ
			if(avg < MINMONEY) {
			//�ݹ����
				return randomRedPacket(money,people,minx,apacket);
			}else if(avg > MAXMONEY) {
			//����������ʣ����ƽ��ֵ����200����˴κ������ֵ��С�����·��䣬����Ϊ�˴κ��ֵ~������ֵ
				return randomRedPacket(money,people,apacket,maxx);
			}
		}
		return apacket;
	}
	
	public List<Float>distribute(float money,int people) {
		//����Ƿ���Ч
		if(!isRight(money,people)) {
			return null;
		}
		//����һ��list�����ÿ������Ľ��
		List<Float> list = new ArrayList<Float>();
		//�������ԭ��ÿ���˵ĺ�����=ʣ�����ܽ��/ʣ��������ʣ�������ƽ������*ϵ��K���˴�ѡ��K=2��
		//������һ��100Ԫ�ĺ����ǰ������������40�����ĸ��������Ľ�����=��100-40��/7*2, 0.01~17.14֮�䣬������������㷨
		float max = (float)(money/people*K);
		max = max>MAXMONEY?MAXMONEY:max;
		//������
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
