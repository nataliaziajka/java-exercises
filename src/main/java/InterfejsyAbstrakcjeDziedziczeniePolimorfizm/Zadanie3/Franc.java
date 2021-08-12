package InterfejsyAbstrakcjeDziedziczeniePolimorfizm.Zadanie3;

public class Franc {
    double amount;

    public Franc (double amount)
    {
        this.amount = amount;
    }
    protected void add( Franc francToAdd){
        this.amount+=francToAdd.amount;
    }

}
