import java.util.Scanner;

public class HeartRatesTest {

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

        HeartRates hr = new HeartRates(firstname, lastname, year, month, day);
		
	System.out.println(hr);

	}

}
