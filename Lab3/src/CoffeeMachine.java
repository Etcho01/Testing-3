public class CoffeeMachine {
    public boolean PowerOn = false;
    public boolean Start = false;
    public boolean InUse = false;
    public double Money;
    private final double Price = 5;
    public int CoffeeQuantity;

    public String StartMachine() {
        if (!PowerOn) {
            PowerOn = true;
            Start = true;
            return " Power on " + "Lights on ";
        } else {
            return " Something went wrong, please check that the power is on ";
        }
    }
    public String AddMoney(double Money) {
        if (PowerOn) {
        this.Money = Money;
        return " Successful transaction ";
    } else {
        return " Something went wrong, please check that the power is on ";
    }
    }
    public String TurnOffMachine() {
        if (PowerOn) {
        Start = false;
        PowerOn = false;
        return " Lights off " + "Power off ";
    } else {
        return " Something went wrong, the machine is already turned off ";
    }
    }
    public String MakeCoffee(int CoffeeQuantity) {
        if (PowerOn) {
        int i = 0;
        if (Money >= Price) {
            while (Money >= Price && CoffeeQuantity > 0) { Money -= Price;
                InUse = true; CoffeeQuantity--; i++;
            }
        }
        else{
            return " Insufficient funds ";
        }
        InUse = false;
        return i + " Grab your coffee ";
    } else {
        return " Something went wrong ,please check that the power is on ";
    }
    }
}
