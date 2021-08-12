package InterfejsyAbstrakcjeDziedziczeniePolimorfizm.Zadanie4;

/*Proszę dodać metodę add() do klasy Dollar oraz klasy Franc.
Metoda ta powinna dodawać pieniądze tej samej waluty do siebie. Np.

Dollar dollar = new Dollar(5);
System.out.println(dollar.getAmount());
dollar.add(new Dollar(6));
System.out.println(dollar.getAmount()); */


public class Franc extends Dollar{

    public Franc(int amount) {
        super(amount);
    }

    public static void main(String[] args) {
        Dollar dollar = new Dollar(5);
        System.out.println(dollar.getAmount());
        //dollar.add(new Dollar(6));
        Dollar dollar2 = new Dollar(5);
        dollar.add(dollar2);
        System.out.println(dollar.getAmount());
    }
}
