//��1603 �Ի��� 20163547
package ketangceshi;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class student
{
	Scanner input=new Scanner(System.in 
			
);
	private String stunumber;//�������
	private String name;
	private int age;
	private boolean sex;
	private double score;
	
	public void setid()//��ֵ
	{
		String i=input.next();
		stunumber=i;
	}
	
	public void setname()//��ֵ
	{
		String i=input.next();
		name=i;
	}
	
	public void setage()//��ֵ
	{
		int i=input.nextInt();
		age=i;
	}
	
	public void setscore()//��ֵ
	{
		double i=input.nextInt();
		score=i;
	}
	
	public void setsex()//��ֵ
	{
		boolean a=input.nextBoolean();
		sex=a;
	}
	
	public String getid()//��ȡ����
	{
		return stunumber;
		
	}
	
	public String getname()//��ȡ����
	{
		return name;
		
	}
	
	public int getage()//��ȡ����
	{
		
		return age;
	}
	
	public double getscore()//��ȡ����
	{
		
		return score;
	}
	
	public boolean getsex()//��ȡ����
	{
		
		return sex;
	}
}

public class StudentManager extends student
{
	public static void showstudent(List<StudentManager>list)//ִ����ʾ������Ϣ
	{
		for(int i=0;i<list.size();i++)//ѭ�����
		{
			System.out.println(list.get(i).getid());
			System.out.println(list.get(i).getname());
			System.out.println(list.get(i).getage());
			System.out.println(list.get(i).getsex());
			System.out.println(list.get(i).getscore());
		}
		
	}
	
	public static void addstudent(List<StudentManager>list)//ִ�����������Ϣ
	{
		Scanner input=new Scanner(System.in 

);
		System.out.println("������Ҫ��ӵ�������Ϣ��");
		StudentManager c=new StudentManager();
		c.setid();
		c.setname();
		c.setage();
		c.setsex();
		c.setscore();
		list.add(0,c);
		System.out.println("�ɹ�");
	}
	
	public static void deletestudent(List<StudentManager>list)//ִ��ɾ��������Ϣ
	{
		Scanner input=new Scanner(System.in 

);//����
		System.out.println("������Ҫɾ����������Ϣ��ţ�");
		String m=input.next();
		for(int i=0;i<list.size();i++)//ѭ������
		{
			if(m==list.get(i).getid())//�ж�����
			
			{
				
				list.remove(i);	
			}
		}
		System.out.println("�ɹ�");
	}
	public static void updatestudent(List<StudentManager>list)
	{
		Scanner input=new Scanner(System.in 

);//����
		System.out.println("������Ҫ�޸ĵ�������Ϣ��ţ�");
		String p=input.next();
		for(int i=0;i<list.size();i++)//ѭ������
		{
			if(p==list.get(i).getid())//�ж�����
			{
				System.out.println("�������޸ĺ��������Ϣ��");
				list.get(i).setsex();
				System.out.println("�ɹ�");
			}
			
		}
		
		
	}
	public static void selectstudent(List<StudentManager>list)
	{
		Scanner input=new Scanner(System.in 

);//����
		System.out.println("�������ţ�");
		String k=input.next();
		for(int i=0;i<list.size();i++)//ѭ������
		{
			if(k==list.get(i).getid())//�ж�����
			{
				
				System.out.println(list.get(i).getid());
				System.out.println(list.get(i).getname());
				
				System.out.println(list.get(i).getage());
				System.out.println(list.get(i).getsex());
				System.out.println(list.get(i).getscore());
			}
		}

		
		
	}
	public static void main(String[]args)//�����뼸����Ϣ������
	{
		Scanner input=new Scanner(System.in 

);
		System.out.println("������������");
		int n=input.nextInt();//��������
		StudentManager[]a=new StudentManager[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=new StudentManager();
			a[i].setid();
			a[i].setname();
			a[i].setage();
			a[i].setsex();
			a[i].setscore();
			
			
		}
		List<StudentManager>list=new ArrayList<StudentManager>();//��list�еĶ�����ΪNewsManager����
		for(int i=0;i<n;i++)
		{
			list.add(a[i]);//��������Ϣ��˳�򴢴���list��
			
		}
	
	do{
		System.out.println("******************************************");//������ʾ		
		System.out.println("       ʯ��ׯ������ѧ��Ϣ��ѧ�뼼��ѧԺ            ");		
		System.out.println("            ѧ����Ϣ����ϵͳv2.0              ");//������ʾ
		System.out.println("             1.�������ѧ����Ϣ                            ");
		System.out.println("             2.��ѧ����Ϣ¼��                        ");
		System.out.println("             3.ɾ��ѧ����Ϣ                             ");
		System.out.println("             4.�޸�ѧ����Ϣ                              ");
		System.out.println("             5.��ѯѧ����Ϣ                              ");
		System.out.println("             6.�˳�                                            ");
		System.out.println("******************************************");//������ʾ
		System.out.println("������ѡ�");
		int num=input.nextInt();//����ѡ��
		if(num==1)//�ж�����
			showstudent(list);
		if(num==2)//�ж�����	
			addstudent(list);
		if(num==3)	//�ж�����
			deletestudent(list);
		if(num==4)//�ж�����
			updatestudent(list);
		
		if(num==5)//�ж�����
			selectstudent(list);
		if(num==6)//�ж�����
		{
			
			return;
		}
		
	   }while(true);//ѭ���������



	}



}

