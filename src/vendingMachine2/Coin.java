package vendingMachine2;

public enum Coin {

    //represent coins supported by vending machine
    PENNY(1), NICKLE(5), DIME(10),QUARTER(25);

    private int denomination;
    private Coin(int denomination){
        this.denomination = denomination;
    }
    public int getDenomination(){
        return denomination;
    }
}
