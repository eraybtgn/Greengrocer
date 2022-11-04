import java.util.Scanner;

public class FruitVeg {
    public double apple;
    public double pear;
    public double tomatoes;
    public double banana;
    public double aubergine;
    public int weigh;

    public FruitVeg() {

    }


        public double howMuch() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Kaç kilo elma aldınız.");
            weigh = scan.nextInt();
            apple=3.67*weigh;
            System.out.println("Kaç kilo armut aldınız.");
            weigh = scan.nextInt();
            pear=2.14*weigh;
            System.out.println("Kaç kilo domates aldınız.");
            weigh=scan.nextInt();
            tomatoes=1.11*weigh;
            System.out.println("Kaç kilo muz aldnız.");
            weigh=scan.nextInt();
            banana=0.95*weigh;
            System.out.println("Kaç kilo patlıcan aldınız.");
            weigh=scan.nextInt();
            aubergine=5.00*weigh;


            return weigh;

        }

    @Override
    public String toString() {

        return "Liste :" +
                "Elma='" + apple + '\'' +
                ", Armut='" + pear + '\'' +
                ", Domates=" + tomatoes +
                ", Muz=" + banana +
                ", Patlıcan=" + aubergine +
                '}';
    }
}
