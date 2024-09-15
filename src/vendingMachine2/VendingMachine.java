package vendingMachine2;

import java.util.List;

public interface VendingMachine {

    //accept coins of 1,5,10,25 cents
    //allow user to select products coke(25), pepsi(35), Soda(45)
    //allow user to take refund by cancelling request
    //return selected product and remaining change id any
    //allow reset operation for vending machine supplier



    //define public API of a vending machine - high level funtionality

     long selectItemAndGetPrice(Item item);
    void insertCoin(Coin coin);
    List<Coin> refund();
    Bucket<Item,List<Coin>> collectItemAndChange();
    void reset();

}
