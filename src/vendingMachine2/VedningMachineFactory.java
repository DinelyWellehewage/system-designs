package vendingMachine2;

public class VedningMachineFactory {

    //factory class to create different kinds of vending machine
    public static VendingMachine createVendingMachine(){
        return new VendingMachineImpl();
    }
}
