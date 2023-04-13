public class DecryptTest{
  public static void main(String[] args){
    Decrypt e = new Decrypt("2817");
    System.out.println(e.getToDecrypt());
    System.out.println(e.decrypt(e.getToDecrypt()));
  }
}
