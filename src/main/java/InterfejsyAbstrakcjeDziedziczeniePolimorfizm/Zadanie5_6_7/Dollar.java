package InterfejsyAbstrakcjeDziedziczeniePolimorfizm.Zadanie5_6_7;


public class Dollar extends Money {

    public Dollar(double dollarAmount) {
        this.amount = dollarAmount;
    }

    public double getAmount() {
        return this.amount;
    }

    public void add(Dollar dollarToAdd) {
        this.amount += dollarToAdd.amount;
    }

    public void add(Franc francToAdd) {
        Exchange exchange = new Exchange(0.5,2);
        Dollar dollarToAdd = exchange.francToDollar(francToAdd);
        this.add(dollarToAdd);

    }
}
