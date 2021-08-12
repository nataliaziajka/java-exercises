package InterfejsyAbstrakcjeDziedziczeniePolimorfizm.Zadanie3;

public class Dollar extends Money{


    public Dollar (double amount){
        this.amount = amount;

    }
    public boolean equals(Object obj) {
        if( this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        Money money = (Money)obj;
        return money.amount==this.amount;
    }
    protected void add( Dollar dollarToAdd){
        this.amount+=dollarToAdd.amount;
    }
    public double getAmount() {
        return this.amount;
    }

    public static void main(String[] args) {
        Dollar dollar = new Dollar(5);
        System.out.println(dollar.getAmount());
        dollar.add(new Dollar(6));
        System.out.println(dollar.getAmount());
    }




}
