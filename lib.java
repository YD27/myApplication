import java.util.*;
import java.lang.*;
import java.io.*;

class Student
{
	String name;
	int Id,choice;
	static int nb,no=100;
		
		void entry()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your Id and name");
			Id=s.nextInt();	
			name=s.nextLine();
		}

		void option()
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("enter your choice 1.Display 2.Borrow 3.Return");
			choice=s1.nextInt();
		}

		void result()
		{
			switch(choice)
			{
			case 1: System.out.println("Id:"+Id+"\nname:"+name+"\nNo. of books in library:"+no);
			break;
			case 2: System.out.println("Enter no. of books to be borrowed");				
				Scanner s2=new Scanner(System.in);
				nb=s2.nextInt();
				no=no-nb;
				System.out.println("Id:"+Id+"\nname:"+name+"\nNo. of books borrowed:"+nb+"\nNo. of books in library:"+no);
			break;
			case 3: System.out.println("Enter no. of books to be returned");
				Scanner s3=new Scanner(System.in);
				nb=s3.nextInt();
				no=no+nb;
				System.out.println("Id:"+Id+"\nname:"+name+"\nNo. of books returned:"+nb+"\nNo. of books in library:"+no);
			break;
		 	}
		}
}

class Library
{
	public static void main(String args[])
	{
		Student st=new Student();
		st.entry();
		st.option();
		st.result();
	}	
}

					











