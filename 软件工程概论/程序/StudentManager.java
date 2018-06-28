//信1603 赵会鹏 20163547
package ketangceshi;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class student
{
	Scanner input=new Scanner(System.in 
			
);
	private String stunumber;//定义变量
	private String name;
	private int age;
	private boolean sex;
	private double score;
	
	public void setid()//赋值
	{
		String i=input.next();
		stunumber=i;
	}
	
	public void setname()//赋值
	{
		String i=input.next();
		name=i;
	}
	
	public void setage()//赋值
	{
		int i=input.nextInt();
		age=i;
	}
	
	public void setscore()//赋值
	{
		double i=input.nextInt();
		score=i;
	}
	
	public void setsex()//赋值
	{
		boolean a=input.nextBoolean();
		sex=a;
	}
	
	public String getid()//读取变量
	{
		return stunumber;
		
	}
	
	public String getname()//读取变量
	{
		return name;
		
	}
	
	public int getage()//读取变量
	{
		
		return age;
	}
	
	public double getscore()//读取变量
	{
		
		return score;
	}
	
	public boolean getsex()//读取变量
	{
		
		return sex;
	}
}

public class StudentManager extends student
{
	public static void showstudent(List<StudentManager>list)//执行显示新闻信息
	{
		for(int i=0;i<list.size();i++)//循环输出
		{
			System.out.println(list.get(i).getid());
			System.out.println(list.get(i).getname());
			System.out.println(list.get(i).getage());
			System.out.println(list.get(i).getsex());
			System.out.println(list.get(i).getscore());
		}
		
	}
	
	public static void addstudent(List<StudentManager>list)//执行添加新闻信息
	{
		Scanner input=new Scanner(System.in 

);
		System.out.println("请输入要添加的新闻信息：");
		StudentManager c=new StudentManager();
		c.setid();
		c.setname();
		c.setage();
		c.setsex();
		c.setscore();
		list.add(0,c);
		System.out.println("成功");
	}
	
	public static void deletestudent(List<StudentManager>list)//执行删除新闻信息
	{
		Scanner input=new Scanner(System.in 

);//输入
		System.out.println("请输入要删除的新闻信息编号：");
		String m=input.next();
		for(int i=0;i<list.size();i++)//循环查找
		{
			if(m==list.get(i).getid())//判定条件
			
			{
				
				list.remove(i);	
			}
		}
		System.out.println("成功");
	}
	public static void updatestudent(List<StudentManager>list)
	{
		Scanner input=new Scanner(System.in 

);//输入
		System.out.println("请输入要修改的新闻信息编号：");
		String p=input.next();
		for(int i=0;i<list.size();i++)//循环查找
		{
			if(p==list.get(i).getid())//判定条件
			{
				System.out.println("请输入修改后的新闻信息：");
				list.get(i).setsex();
				System.out.println("成功");
			}
			
		}
		
		
	}
	public static void selectstudent(List<StudentManager>list)
	{
		Scanner input=new Scanner(System.in 

);//输入
		System.out.println("请输入编号：");
		String k=input.next();
		for(int i=0;i<list.size();i++)//循环查找
		{
			if(k==list.get(i).getid())//判定条件
			{
				
				System.out.println(list.get(i).getid());
				System.out.println(list.get(i).getname());
				
				System.out.println(list.get(i).getage());
				System.out.println(list.get(i).getsex());
				System.out.println(list.get(i).getscore());
			}
		}

		
		
	}
	public static void main(String[]args)//先输入几条信息并储存
	{
		Scanner input=new Scanner(System.in 

);
		System.out.println("请输入人数：");
		int n=input.nextInt();//输入人数
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
		List<StudentManager>list=new ArrayList<StudentManager>();//将list中的对象定义为NewsManager类型
		for(int i=0;i<n;i++)
		{
			list.add(a[i]);//将新闻信息按顺序储存在list中
			
		}
	
	do{
		System.out.println("******************************************");//界面显示		
		System.out.println("       石家庄铁道大学信息科学与技术学院            ");		
		System.out.println("            学生信息管理系统v2.0              ");//界面显示
		System.out.println("             1.遍历输出学生信息                            ");
		System.out.println("             2.新学生信息录入                        ");
		System.out.println("             3.删除学生信息                             ");
		System.out.println("             4.修改学生信息                              ");
		System.out.println("             5.查询学生信息                              ");
		System.out.println("             6.退出                                            ");
		System.out.println("******************************************");//界面显示
		System.out.println("请输入选项；");
		int num=input.nextInt();//输入选项
		if(num==1)//判定条件
			showstudent(list);
		if(num==2)//判定条件	
			addstudent(list);
		if(num==3)	//判定条件
			deletestudent(list);
		if(num==4)//判定条件
			updatestudent(list);
		
		if(num==5)//判定条件
			selectstudent(list);
		if(num==6)//判定条件
		{
			
			return;
		}
		
	   }while(true);//循环多次输入



	}



}

