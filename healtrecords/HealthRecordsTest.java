import java.util.Scanner;

public class HealthRecordsTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        	System.out.print("Firstname: ");
	        String firstname = input.nextLine();

        	System.out.print("Lastname: ");
	        String lastname = input.nextLine();
   	
		System.out.print("Gender: ");
                String gender = input.nextLine();

        	System.out.print("Year of birth: ");
        	short year = input.nextShort();

        	System.out.print("Month of birth: ");
        	byte month = input.nextByte();

       		System.out.print("Day of birth: ");
        	byte day = input.nextByte();

		System.out.print("Height: ");
        	double height = input.nextDouble();

		System.out.print("Weight: ");
        	double weight = input.nextDouble();

		System.out.println();
		
		if(gender != "" && firstname != "" && lastname != "" && year > 0 && month > 0 && height > 0 && weight > 0){
			HealthRecords hr = new HealthRecords(firstname, lastname, year, month, day, gender, height, weight);
			System.out.println(hr);
		}
		else
			System.out.println("Input error.");
	}

}
