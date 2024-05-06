package banking;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import banking_project_database.hibernateutil;

public class Operations {
	static Scanner sc = new Scanner(System.in);

	public static void acc_open() 
	{
		SessionFactory sf = hibernateutil.getssessionFactory();
		Session session = sf.openSession();

		Accdetail ac = new Accdetail();

		System.out.println("Enter Customerid:  ");
		ac.setCustomerid(sc.nextInt());
		sc.nextLine();

		System.out.println("Enter your password: ");
		ac.setPassword(sc.next());

		System.out.println("Enter your name: ");
		ac.setCustomername(sc.nextLine());

		System.out.println("Enter your address: ");
		ac.setAddress(sc.nextLine());

		System.out.println("Enter your mo.no: ");
		ac.setMobno(sc.nextLong());

		while (true)
		{
			System.out.println("Enter deposit amount: ");
			int a = sc.nextInt();

			if (a > 200) 
			{
				ac.setBal(a);
				break;
			}
			System.out.println("Your deposited amount is less than 200.\n Please pay more amount.");
		}
		
		session.save(ac);
		session.beginTransaction().commit();
		System.out.println("Your account is sucessfully created. ");
		session.close();
		sf.close();
		
	}
}
