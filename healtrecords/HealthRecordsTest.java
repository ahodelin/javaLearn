import java.util.Scanner;

public class HealthRecordsTest {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        
        System.out.print("Firstname: ");
        String firstname = input.nextLine();

        System.out.print("Lastname: ");
        String lastname = input.nextLine();
   	
        System.out.print("Year of birth: ");
        short year = input.nextShort();

        System.out.print("Month of birth: ");
        byte month = input.nextByte();

        System.out.print("Day of birth: ");
        byte day = input.nextByte();

        HealthRecords hr = new HealthRecords(firstname, lastname, year, month, day, "man", 1.76, 65.4);
		
	System.out.println(hr);

	}

}
