import java.util.*;
	class main{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("choose any one");
	System.out.println("choose-----1");
	System.out.println("choose-----0");
	int choise;
	int num;
	do{
		System.out.println("enter the choise number");
		choise=sc.nextInt();
		if (choise==1){
			System.out.println("enter student name :");
			char name=sc.next().charAt(0);
			System.out.println("enter the marks");
			num=sc.nextInt();
		if (num>=90 && num <=100){
			System.out.println("this is good");
			}
		else if (num>=60 && num<=89){
			System.out.println("this is also good");
			}
		else if (num<=59){
			System.out.println("good as well as");
			}
		else {
			System.out.println("please enter the correct marks");
			}
		}
		
	}while(choise != 0);
	System.out.println("programm is stopped");
	sc.close();
	}
		}