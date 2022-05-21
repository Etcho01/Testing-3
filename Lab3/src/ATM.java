public class ATM {
    public double CurrentBalance = 0;
    public boolean Legit = false;
    public boolean ValidCard = true;
    public boolean ValidPassword = true;

    public String EnterCard(){
        if(ValidCard){
        return "Validated card";
    }
    else{
        return "Card not validated";
    }
    }
    public String EnterPassword(){
        if(ValidCard){
        System.out.println("Enter Password");
        if(ValidPassword){
            Legit = true;
            return "Successful login";
        }
        else{
            return "Wrong password";
        }
    }
    else{
        return "Something went wrong, enter your card";
    }
    }
    public String MakeDeposit(double Amount){
        if(Legit){
        if(Amount >= 20 && Amount <=10000){
            CurrentBalance += Amount;
            return "Successful deposit";
        }
        else{
            return "Enter valid amount";
        }
    }
    else{
        return "Not allowed";
    }
    }
    public String MakeWithdraw(double Amount){
        if(Legit){
        if(Amount <= CurrentBalance){ CurrentBalance -= Amount;
            return "Successful withdraw";
        }
        else{
            return "Not enough balance";
        }
    }
    else{
        return "Not allowed";
    }
    }
    public String RemoveCard(){
        if(ValidCard){
        return "Card removed";
    }
    else{
        return "Not allowed";
    }
    }
}
