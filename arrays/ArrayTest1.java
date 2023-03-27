public class ArrayTest1{
    public static void main(String[] args){
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++)
          numbers[i] = (i + 1) * 100;

        for(int n : numbers)
          System.out.print(n + " ");

        System.out.println();

        String[] days = {"Mo", "Tu", "We", "Th", "Fr", "Sa", "Su"};
        for(String d : days)
          System.out.print(d + " ");
        
        System.out.println();
    }
}