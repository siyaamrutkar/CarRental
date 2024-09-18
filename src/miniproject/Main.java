package miniproject;

import java.util.*;
class Car
{
	Scanner sc= new Scanner(System.in);
	String ptime;
	int days,rate;
	float Deposit;
	int initialrate;
	Car()
	{
	}
	void accept()
	{
		System.out.println("\nEnter your time of pick-up : ");
		ptime = sc.nextLine();
	}
	void input()
	{
		System.out.println("\nEnter your Name : ");
		String name=sc.nextLine();
		System.out.println("\nEnter your Driving License Number : ");
		int num=sc.nextInt();
		sc.nextLine();
		System.out.println("\nEnter your Address : ");
		String add=sc.nextLine();
		System.out.println("\nEnter your Phone number : ");
		String PNO = sc.nextLine();

	}
}

class FourSeat extends Car
{
	void accept()
	{
		super.input();
		super.accept();
		initialrate=500;
		System.out.println("\nThe Principal amount is " +initialrate);
		System.out.println("Rate per km is : 25Rs \nSecurity Deposit per day = 1000Rs");
		System.out.println("\nEnter the duration(Days): ");
		days = sc.nextInt();
		Deposit = days*1000;
		System.out.println("\nYou’ve to deposit : " +Deposit+ " Rs");
	}
	void calc()
	{
		System.out.println("\n*****BILLING*****");
		System.out.println("\nEnter the distance travelled in Km");
		int dist = sc.nextInt();
		int amount = (dist*25+initialrate);
		System.out.println("\nTotal bill is: "+amount+ " Rs");
	}
}

class SevenSeat extends Car
{
	void accept()
	{
		super.input();

		super.accept();
		initialrate=600;
		System.out.println("\nThe Principal amount is " +initialrate);
		System.out.println("Rate per km is : 30Rs \nSecurity Deposit per day = 1200Rs");
		System.out.println("\nEnter the duration(Days): ");
		days = sc.nextInt();
		Deposit = days*1200;
		System.out.println("\nYou’ve to deposit : " +Deposit+ " Rs");
	}
	void calc()
	{
		System.out.println("\n*****BILLING*****");
		System.out.println("\nEnter the distance travelled in Km");
		int dist = sc.nextInt();
		int amount = (dist*30+initialrate);
		System.out.println("\nTotal bill is: "+amount+ " Rs");
	}
}

class Jeep extends Car
{
	void accept()
	{
		super.input();
		super.accept();
		initialrate=700;
		System.out.println("\nThe Principal amount is " +initialrate);
		System.out.println("Rate per km is : 35Rs \nSecurity Deposit per day = 1500Rs");
		System.out.println("\nEnter the duration(Days): ");
		days = sc.nextInt();
		Deposit = days*1500;
		System.out.println("\nYou’ve to deposit : " +Deposit+ " Rs");
	}

	void calc()
	{
		System.out.println("\n*****BILLING*****");
		System.out.println("\nEnter the distance travelled in Km");
		int dist = sc.nextInt();
		int amount = (dist*35+initialrate);
		System.out.println("\nTotal bill is: "+amount+ " Rs");
	}
}

class Van extends Car
{
	void accept()
	{
		super.input();
		super.accept();
		initialrate=800;
		System.out.println("\nThe Principal amount is " +initialrate);
		System.out.println("Rate per km is : 40Rs \nSecurity Deposit per day = 2000Rs");
		System.out.println("\nEnter the duration(Days): ");
		days = sc.nextInt();
		Deposit = days*2000;
		System.out.println("\nYou’ve to deposit : " +Deposit+ " Rs");
	}
	void calc()
	{
		System.out.println("\n*****BILLING*****");
		System.out.println("\nEnter the distance travelled in Km");
		int dist = sc.nextInt();
		int amount = (dist*40+initialrate);
		System.out.println("\nTotal bill is: "+amount+ " Rs");

	}
}

public class Main
{
	public static void main(String[] args)
	{
		Scanner o = new Scanner(System.in);
		System.out.println("-----Welcome to FindMyCar-----\n");

		ArrayList <String> Place = new ArrayList<>();
		Place.add("Mumbai");
		Place.add("Pune");
		Place.add("Bangalore");
		Place.add("Hyderabad");
		Place.add("Delhi");
		Place.add("Surat");
		Place.add("Indore");
		System.out.println("Our outlets are in: "+Place);
		String plocation;
		System.out.println("\nEnter your pick-up location: ");
		plocation = o.nextLine();
		String ans=" ";
		int flag =0;
		for(int j=0;j<7;j++)
		{
			String pick =Place.get(j);
			if(plocation.equalsIgnoreCase(pick))
			{
				System.out.println("\nOK! You may proceed.");
				flag=1;
				break;
			}
		}

		if(flag==0)
		{
			System.out.println("\nSorry we don't have an outlet in " +plocation+ ", please select from the mentioned outlets.\n" +Place);
		}
		System.out.println("\nEnter your age: ");
		int age = o.nextInt();
		if(age>=18)
		{
			System.out.println("\nEnter the category of car required : ");
			ArrayList <String> Types = new ArrayList<>();
			Types.add("1.FourSeater");
			Types.add("2.SevenSeater");
			Types.add("3.Jeep");
			Types.add("4.Van");
			System.out.println(Types);
			int n = o.nextInt();
			switch(n)
			{
			case 1 :
				System.out.println("\n--Four-seater car has been chosen--");
				FourSeat FS = new FourSeat();
				FS.accept();
				FS.calc();
				break;
			case 2 :
				System.out.println("\n--Seven-seater car has been chosen--");
				SevenSeat SS = new SevenSeat();
				SS.accept();
				SS.calc();
				break;
			case 3 :
				System.out.println("\n--Jeep car has been chosen--");

				Jeep J = new Jeep();
				J.accept();
				J.calc();
				break;
			case 4 :
				System.out.println("\n--Van has been chosen--");
				Van V = new Van();
				V.accept();
				V.calc();
				break;
			}
			System.out.println("\nPlease give your valuable feedback on our site - findmycar.com");
			System.out.println("THANK YOU :)");
		}
		else
		{
			System.out.println("\nYou can't rent any vehicle as you are underage.");
		}
	}
}