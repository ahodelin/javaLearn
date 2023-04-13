public class Decrypt{
  private String toDecrypt;

  public Decrypt (String toDecrypt){
    this.toDecrypt = toDecrypt;
  }

  public void setToDecrypt(String toDecrypt){
    this.toDecrypt = toDecrypt;
  }

  public String getToDecrypt(){
    return this.toDecrypt;
  }

  public int decrypt(String toDecrypt){
    int first = 0;
    int second = 0;
    int third = 0;
    int fourth = 0;

    for(int i = 0; i < toDecrypt.length(); i++){
      int digit = Character.getNumericValue(toDecrypt.charAt(i)) >= 7  ? Character.getNumericValue(toDecrypt.charAt(i)) : Character.getNumericValue(toDecrypt.charAt(i)) + 10;
      
      switch(i){
        case 0: third = (digit - 7) % 10;
          break;
        case 1: fourth = (digit - 7) % 10;
          break;
        case 2: first = (digit - 7) % 10;
          break;
        case 3: second = (digit - 7) % 10;
          break;
      }
    }
    String toDecryptTmp = "" + first + second + third + fourth;
   
    return Integer.parseInt(toDecryptTmp);
  }
}
