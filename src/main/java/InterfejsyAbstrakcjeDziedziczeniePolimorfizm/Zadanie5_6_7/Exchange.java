package InterfejsyAbstrakcjeDziedziczeniePolimorfizm.Zadanie5_6_7;

/*
--5--Proszę utworzyć klasę Exchange (wymiana) zawierającą przeliczniki walut.
Klasa ta powinna zawierać dwie metody: dollarToFrancRatio() oraz francToDollarRatio().
Metody te powinny zwracać przelicznik dla walut. Np.:
Exchange exchange = new Exchange(0.5, 2);
System.out.println(exchange.dollarToFrancRatio());
System.out.println(exchange.francToDollarRatio());
--6--Proszę dodać do klasy Exchange metody dollarToFranc() oraz francToDollars().
Metoda dollarToFranc() powinna przeliczać dolary na franki zgodnie z ustalonym przelicznikiem.
Metoda francToDollar() powinna przeliczać franki na dolary.
Dollar dollar1 = new Dollar(3); Exchange exchange = new Exchange(0.5, 2);
Franc franc = exchange.dollarToFranc(dollar1);
System.out.println(franc.getAmount());
Dollar dollar2 = exchange.francToDollar(franc);
System.out.println(dollar2.getAmount());
--7--Proszę zmodyfikować metody add() w klasie Dollar i Franc tak,
aby podczas dodawania automatycznie dokonywały przewalutowania.
Dollar dollar = new Dollar(3);
Franc franc = new Franc(2);
dollar.add(franc);
System.out.println(dollar);
*/


public class Exchange {

        private double dollarToFrancRatio;
        private double francToDollarRatio;

        public Exchange(double dollarToFrancRatio, double francToDollarRatio) {
            this.dollarToFrancRatio = dollarToFrancRatio;
            this.francToDollarRatio = francToDollarRatio;
        }

        private double dollarToFrancRatio() {
            return dollarToFrancRatio;

        }
        private double francToDollarRatio() {

            return francToDollarRatio;
        }
        Franc dollarToFranc(Dollar dollar) {
            double francAmount = dollar.amount * dollarToFrancRatio;
            return new Franc(francAmount);
        }
        Dollar francToDollar(Franc franc) {
            double dollarAmount = franc.amount * francToDollarRatio;
            return new Dollar(dollarAmount);
        }


        public static void main(String[] args) {
            Exchange exchange = new Exchange(0.5, 2);
            System.out.println(exchange.dollarToFrancRatio());
            System.out.println(exchange.francToDollarRatio());

            Dollar dollar1 = new Dollar(3);
            Franc franc = exchange.dollarToFranc(dollar1);
            System.out.println(franc.getAmount());

            Dollar dollar2 = exchange.francToDollar(franc);
            System.out.println(dollar2.getAmount());

            Dollar dollar3 = new Dollar(3);
            Franc franc1 = new Franc(2);
            dollar3.add(franc1);
            System.out.println(dollar3.getAmount());

        }
    }
