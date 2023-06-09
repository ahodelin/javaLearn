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

  public String getPartNumber(){
    return this.partNumber;
  }

  public String getPartDescription(){
    return this.partDescription;
  }

  public void setQuantity(int quantity){
    if(quantity < 0)
      throw new IllegalArgumentException("Quantity mus be >= 0");

    this.quantity = quantity;
  }

  public int getQuantity(){
    return this.quantity;
  }

  public double getPricePerItem(){
    return this.pricePerItem;
  }

  @Override
  public String toString(){
    return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
      "invoice", "part number", this.getPartNumber(), this.getPartDescription(),
      "quantity", this.getQuantity(), "price per item", this.getPricePerItem()
    );
  }

  @Override
  public double getPaymentAmount(){
    return this.getQuantity() * this.getPricePerItem();
  }
}
