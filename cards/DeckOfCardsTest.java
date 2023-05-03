public class DeckOfCardsTest{
  public static void main (String[] args){
    DeckOfCards myDecOfCards = new DeckOfCards();
    myDecOfCards.shuffle();

    for(int i = 1; i <= 52; i ++){
      System.out.printf("%-19s", myDecOfCards.dealCard());

      if(i % 4 == 0)
        System.out.println();
    }
  }
}
