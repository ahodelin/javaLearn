public class CounterTest{
  private static int counter;
  
  public CounterTest(){
    counter++;
  }

  public static void main(String[] args){
    new CounterTest();
    new CounterTest();
    new CounterTest();
  
    System.out.println(CounterTest.counter);
  }
}
