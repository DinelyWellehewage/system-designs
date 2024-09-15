package vendingMachine;

import java.util.Scanner;

public class Demo {

    /**
     * The vending machine displays a welcome message with all products and prices
     * The vending machine asks the user to select a product
     * The Vending machine asks the user to enter coins. The coins accepted are 5,10,20,50,100 cents
     * The Vending machine calculates the total money inserted
     * Calculate the change amount
     * Calculate the minimum number of coins to return
     * Display the change amount and coins to the user
     */

//Entities
    //Vending Machine
    //Product
    //Coin
    //Calculator


    //main                      //vending machine interface                 //calculator

//            -display product msg->
//            - select product->
//            -display enter coins msg->
//            -enter coins->
//                                                            -calculate total->
//                                                            <-total cmount-
//
//                                                            -calculate change->
//                                                            -no of coins->
//            -display change message->
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendingMachine vendingMachine = new TextBasedVendingMachine();

        vendingMachine.displayProducts();

        String selectedProduct = scanner.nextLine();
        int selectedProductNumber = Integer.parseInt(selectedProduct);

        vendingMachine.selectProduct(selectedProductNumber);
        vendingMachine.displayEnterCoinsMessage();

        String userEnteredCoins = scanner.nextLine();
        int[] enteredCoins = Coin.parseCoins(userEnteredCoins);

        vendingMachine.enterCoins(enteredCoins);
        vendingMachine.displayChangeMessage();
    }
}
