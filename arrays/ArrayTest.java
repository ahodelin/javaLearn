public class ArrayTest{
    public static void main(String[] args){
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++)
          numbers[i] = (i + 1) * 100;

        for(int i = 0; i < numbers.length; i++)
          System.out.print(numbers[i] + " ");

        System.out.println();

        String[] days = {"Mo", "Tu", "We", "Th", "Fr", "Sa", "Su"};
        for(int i = 0; i < days.length; i++)
          System.out.print(days[i] + " ");
        
        System.out.println();
    }
}