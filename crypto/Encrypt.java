public class Encrypt{
  private int toEncrypt;

  public Encrypt(int toEncrypt){
    if(toEncrypt > 999 && toEncrypt < 10000)
      this.toEncrypt = toEncrypt;
  }

  public void setToEncrypt(int toEncrypt){
    if(toEncrypt > 999 && toEncrypt < 10000)
      this.toEncrypt = toEncrypt;
  }

  public int getToEncrypt(){
    return this.toEncrypt;
  }

  public String encrypt(int toEncrypt){
    int first = 0;
    int second = 0;
    int third = 0;
    int fourth = 0;
    for(int i = 0; i < 4; i++){
       switch(i){
         case 0: third = (toEncrypt % 10 + 7 ) % 10;
           break;
         case 1: fourth = (toEncrypt % 10 + 7 ) % 10;
           break;
         case 2: first = (toEncrypt % 10 + 7 ) % 10;
           break;
         case 3: second = (toEncrypt % 10 + 7 ) % 10;
       }
    
      toEncrypt = toEncrypt / 10;
    }
    return "" + fourth + third + second + first;
  }
}
