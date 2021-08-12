package InterfejsyAbstrakcjeDziedziczeniePolimorfizm.Zadanie2;

import java.util.Objects;

public class Money implements IMoney {

        double amount;

        public Money(double amount) {
            this.amount = amount;
        }

    public double getAmount() {
            return this.amount;
        }

        public boolean equals(Object obj) {
        if( this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
        return false;
        Money money = (Money)obj;
        return money.amount==this.amount;
    }
    public int hashCode(){
            return Objects.hash(amount);
    }

    public static void main(String[] args) {
        Money am1 = new Money(5);
        Money am2 = new Money(5);
        Money am3 = new Money(5);
        Money am4 = new Money(6);
        System.out.println(am1.equals(am2));
        System.out.println(am3.equals(am4));

    }


    }
