/**
 * @author 软工11601 王奔
 * @time  9、23
 *
 */

import java.util.Scanner;	//引入java.untl包里的Scanner类
public class Car{
	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);		//创建用来接收用户数据的Scanner类的对象reader
		Car car[];	//声明Car类类型组car
		int n;	//车的个数
		System.out.println("请输入车辆信息");
		n=reader.nextInt();	//接收输入的数存到变量n中
		if(n<1)
			System.out.println("个数错误");
		else{
			car=new Car[n];	//创建car数组，包含n个元素
			for(int i=1;i<=n;i++)
			{
			 car[i]=new Car();	//给每个数组元素创建对象
			 System.out.println("第"+i+"辆汽车的型号");
			 String model=reader.next();	//读入字符串存到姓名中
			 System.out.println("第"+i+"辆车的油箱的容量");
			 double tank=reader.nextDouble();
			 System.out.println("第"+i+"辆车的每小时耗油量");
			 double oilConsumption=reader.nextDouble();
			 car[i].setItem(modle,tank,oilConsumption);
			}
			for(int i=1;i<=n;i++)	//循环对每个数组元素信息进行输出
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
       System.out.println("型号是"+modle+"，油箱容量是"+tank+"，每小时耗油量是"+oilConsumption);
	}
}
