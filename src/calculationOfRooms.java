import java.util.Scanner;

public class calculationOfRooms {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		do {
		System.out.print("Enter Lenght: ");
		int l = scan.nextInt();
		System.out.print("Enter Width: ");
		int w = scan.nextInt();
		System.out.println("Area: " + methodsCalculation.area1(l,w));
		System.out.println("Perimeter: "+methodsCalculation.perimeter1(l,w));
		 
		System.out.println("Do you want to continue? y/n");
		scan.nextLine();
		String answ = scan.nextLine();
		if(answ.equalsIgnoreCase("n")) {
			run = false;
		}
		}while(run);
		scan.close();
		
	}

}
