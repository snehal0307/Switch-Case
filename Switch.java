package mycaptain;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		int choice;
		System.out.println("Pick one : 1.Hii \n2.Hey \n3.Hello");
		Scanner a= new Scanner(System.in);
		choice=a.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Hii");
			break;
			
		case 2:
			System.out.println("Hey");
			break;
			
		case 3:
			System.out.println("Hello");
			break;
			
		default:
			System.out.println("Invalid choice..");
		}
	}

}
