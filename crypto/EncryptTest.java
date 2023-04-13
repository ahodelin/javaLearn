public class EncryptTest{
  public static void main(String[] args){
    Encrypt e = new Encrypt(4051);
    System.out.println(e.encrypt(e.getToEncrypt()));
  }
}
