package InterfejsyAbstrakcjeDziedziczeniePolimorfizm.Zadanie1;

/*Proszę napisać klasę Money (pieniądze), która będzie reprezentowała
pewną ilość pieniędzy. Klasa powinna zawierać metodę zwracającą ilość.
Dane te powinny być inicjalizowane w konstruktorze podczas tworzenia obiektu.
Klasa powinna implementować następujący interfejs:
public interface IMoney {  double getAmount(); }
 */
public class Money implements IMoney{
    double am;

    public Money(double am) {
        this.am = am;
    }

    public double getAmount() {
        return this.am;
    }

    public static void main(String[] args) {
        Money a = new Money(3500);
        System.out.println(a.getAmount());
    }
}
