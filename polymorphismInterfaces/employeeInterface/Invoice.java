public class Invoice implements Payable{
  private final String partNumber;
  private final String partDescription;
  private int quantity;
  private double pricePerItem;

  public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem){
    if(quantity < 0)
      throw new IllegalArgumentException("Quantity must be >= 0");

    if(pricePerItem < 0.0)
      throw new IllegalArgumentException("Price per Item mus be >= 0");

    this.quantity = quantity;
    this.partNumber = partNumber;
    this.partDescription = partDescription;
    this.pricePerItem = pricePerItem;
  }

 // public String getPartNumber(){} 
}
