import mypkg.StudentProtect;
import java.util.Scanner;
public class StudentProtectMain{
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		String name,id;
		int age,rno;
		double m1,m2,m3;
		
		System.out.println ("Enter name of student: ");
		name=input.nextLine();
		System.out.println ("Enter ID of student: ");
		id=input.nextLine();
		System.out.println ("Enter Roll No: of student");
		rno=input.nextInt();
		System.out.println ("Enter age of student: ");
		age=input.nextInt();
		System.out.println ("Enter marks of student: ");
		m1=input.nextDouble();
		m2=input.nextDouble();
		m3=input.nextDouble();

		StudentProtectInher i = new StudentProtectInher (name,id,rno,age,m1,m2,m3);
		i.Calculate();
		i.display();
	}

}
