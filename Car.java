/**
 * @author ��11601 ����
 * @time  9��23
 *
 */

import java.util.Scanner;	//����java.untl�����Scanner��
public class Car{
	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);		//�������������û����ݵ�Scanner��Ķ���reader
		Car car[];	//����Car��������car
		int n;	//���ĸ���
		System.out.println("�����복����Ϣ");
		n=reader.nextInt();	//������������浽����n��
		if(n<1)
			System.out.println("��������");
		else{
			car=new Car[n];	//����car���飬����n��Ԫ��
			for(int i=1;i<=n;i++)
			{
			 car[i]=new Car();	//��ÿ������Ԫ�ش�������
			 System.out.println("��"+i+"���������ͺ�");
			 String model=reader.next();	//�����ַ����浽������
			 System.out.println("��"+i+"���������������");
			 double tank=reader.nextDouble();
			 System.out.println("��"+i+"������ÿСʱ������");
			 double oilConsumption=reader.nextDouble();
			 car[i].setItem(modle,tank,oilConsumption);
			}
			for(int i=1;i<=n;i++)	//ѭ����ÿ������Ԫ����Ϣ�������
				car[i].printInfo();
		

		    }
		}
		public double run{
			return(tank/oilConsumption);
		}
         }
class Cars{
	String modle;
	double tank;
	double oilConsumption;	
 void setItem(String m,double t,double o){
	modle=m;
	tank=t;
	oilConsumption=o;
       }
 void printInfo(){
       System.out.println("�ͺ���"+modle+"������������"+tank+"��ÿСʱ��������"+oilConsumption);
	}
}
