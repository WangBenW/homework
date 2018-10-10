package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//��дObject �е�toString ���� ʹ�����ܷ���Song��������ʽ 
class Song {
	public String SongName;
	public String Songer;
	public double SongTime;
	public Song() {}
	public Song(String SongName,String Songer,double SongTime) {
		this.SongName=SongName;
		this.Songer=Songer;
		this.SongTime=SongTime;
	}
	public String toString() {
		return "���׸������Ϊ:"+this.SongName+"\t�ݳ�����Ϊ:"+this.Songer+"\tʱ��Ϊ:"+this.SongTime;
	}
}


 
//SongDiver �� ��Ϊ���������� �������ж���һЩMaster��Player�����õ��ķ�����Ȼ����Ϊ���� �����Ǽ̳� �ڵ���
class SongDiver{
         //�޲ι��캯�� ʹ�����ڹ����ʱ�� �����дsuper();
         // super:�������õ�ǰ�����ֱ�Ӹ����еĳ�Ա����������ֱ�Ӹ����б����صĸ����г�Ա���ݻ�����������������������ͬ��Ա����ʱ�磺super.������ super.��Ա����������ʵ�Σ�
	public SongDiver() {
		
	}
	
	/*
	 * ��Ӹ������� ����ΪString ���͵�SongName ��Master��Playerͨ���������������Ӹ�������赥��������Ҫ������������ʵ��;
	 * */
	public boolean addSong(String SongName) {
		int a=0;//�жϱ���
		for(int i=0;i<SongHouse.SongHouse.size();i++) {//��SongHouse���������ľ�̬���� ����ֱ��ʵ���� ֻ��ͨ������+����������,
			if(SongHouse.SongHouse.get(i).SongName.equals(SongName)) {//�����SongName �����еĽ�������Աȣ���ͬ�� ������һ��
				for(int j=0;j<Master.ListSong.size();j++) {//���ѭ�������ų���ӵĸ�����赥�����ظ���
					if(Master.ListSong.get(j).SongName.equals(SongName)) {
						System.out.println("�벻Ҫ�ظ����!");
						a++;//�жϱ�����+
					} 
				}
				if(a==0) {
				System.out.println("������ӳɹ�!");
				Master.ListSong.add(SongHouse.SongHouse.get(i));
				return true;
			    }else {
					return false;
				}
			}
				
			}
		System.out.println("�Բ���!�����û����������׸�!");
		return false;
	}
	/*
	 * ����赥������������� Master��Player�����Ե���
	 * */
	public void show() {
		System.out.println("�赥�ĸ�������:");
		for(int i=0;i<Master.ListSong.size();i++) {
			System.out.println(Master.ListSong.get(i));
		}
	}

	
}

/*
 * Master�� ����������  �̳�SongDiver�� ���Ե���addSong������show����
 * Master ���еķ���ΪPlay���ŷ��� NextSong�и跽�� Stick�����ö�����
 *  ������һ����̬���� �߼�List���͵�ListSong���ڴ�Ÿ赥
 * */


class Master extends SongDiver{
	
	public static List<Song>ListSong=new ArrayList<Song>();
	
	public 	Master() {
		System.out.println("DJ�ϳ�");
	}
	
	public boolean IsEmply() {
		if(Master.ListSong.get(0)==null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	/*�ö����� 
	 * ���Ƚ����ҵ��ö������ڸ赥�е�λ�� ������� ���ڸ赥�Ŀ�ʼ����ø�������ɾ������ԭʼλ�õĸ���������������򷵻� false
	 * */
	public boolean stick(String SongName) {
		int j=0;
		for(int i=0;i<Master.ListSong.size();i++) {
			if(Master.ListSong.get(i).SongName.equals(SongName)) {
						System.out.println("�����ö��ɹ�!");
				        Master.ListSong.add(0, Master.ListSong.get(i));
				        Master.ListSong.remove(i+1);
				        j=j+1;
				        return true;
					}
		}
		if(j==0) {
			System.out.println("�Բ���!�����û����������׸�!");	
		    return false;
		}
		return false;
}
	
	public boolean Play() {
		System.out.println("��ʼ����!");
		System.out.println(Master.ListSong.get(0));
		return true;
	}
	
}

/*
 * �������� ���ڵĲ���ֻ����Ӹ��� ���Է������ǵĸ����У�
 * */

class Player extends SongDiver{
	
	public Player() {
		System.out.println("�����볡");
	}

}

/*����һ����� ����ʼʱ ���г�����еĸ��� �������˺͹����ڸ����ѡ��*/
 class  SongHouse{
	public static List<Song>SongHouse=new ArrayList<Song>();
	public SongHouse() {
		SongHouse=new ArrayList<Song>();
		SongHouse.add(new Song("Զ��","�������",1:47));
		SongHouse.add(new Song("Hacking to the Gate","����ʯ",1:29));
		SongHouse.add(new Song("What are words","Medina",3:07));
		SongHouse.add(new Song("����ȹ���������","����Ѹ",4:18));
		SongHouse.add(new Song("����","������",3:44));
		SongHouse.add(new Song("����","�ű̳�/����γ",3:45));
                SongHouse.add(new Song("���̳���","������è",4:00));



	}
	public void show() {
		System.out.println("��Ӹ���е��");
		for(int i=0;i<SongHouse.size();i++) {
			System.out.println(SongHouse.get(i));
		}
	}
}

public class playSong {
  
	public static void main(String[]args) {
		SongHouse house=new SongHouse();//��ʼ��һ�����ʵ��
		Player player=new Player();//��ʼ��һ������ʵ��
		Master master=new Master();//��ʼ��һ��������ʵ��
		house.show();//չʾ����еĸ���
		Scanner scanner = new Scanner(System.in);
	        master.addSong(scanner.next());//�ֶ� ����һ����������
		master.show();//�����˲鿴�赥
		master.Play();//�����˿�ʼ��������
		player.show();//���ڲ鿴�赥
	}
}