package OOP;

import java.time.LocalDateTime;

public class AbstrakteKlassen {
    public static void main(String[] args) {

            /*
            Eine Abstrakte Klasse ist nicht instanziierbar (kein new). Sie dient als Elternklasse,
            in der Implementierungen abgelegt werden können, die diese an Kind-Klassen
            vererbt.
            Eine Abstrakte Methode (in einer abstrakten Klasse) besitzt keine
            Implementierung. Es wird nur der Methodenkopf deklariert. Die Kind-Klassen
            müssen die abstrakte Methode implementieren.
            Ein Interface deklariert nur öffentliche Methodenköpfe (keine Implementierung,
            keine Instanziierung). Kind-Klassen, die vom Interface erben, besser: die das
            Interface realisieren, müssen Implementierungen für die Methoden bieten
            */

        PremiumReise premium = new PremiumReise(3399.90, "12.03.2021");
        StornoAlgorithmus stornoAlgorithmus = new KulanterStornoAlgorhithmus();
        stornoAlgorithmus.stornoBerechen(premium);
        double restbetrag = stornoAlgorithmus.stornoBerechen(premium);
        System.out.println(restbetrag);

    }
}

abstract class Reise {

    protected StornoAlgorithmus stornoAlgorithmus;
    protected double grundPreis;
    private String Date;

    public double getGrundPreis() {
        return grundPreis;
    }

    public void setStornoAlgorithmus(StornoAlgorithmus stornoAlgorithmus) {
        this.stornoAlgorithmus = stornoAlgorithmus;
    }

    public double executeStornoBerechnen() {
        return stornoAlgorithmus.stornoBerechen(this);
    }

    public Reise(double grundPreis, String date) {
        this.grundPreis = grundPreis;
        Date = date;
    }
    public int tageBestimment() {
        // Kalendar
        return 15;
    }
    abstract double preisBerechnen();

}

class StandardReise extends Reise {

    public StandardReise(double grundPreis, String date) {
        super(grundPreis, date);
    }

    @Override
    double preisBerechnen() {
        double preis = grundPreis + 59.80;
        return preis;
    }
}

class PremiumReise extends Reise {

    public PremiumReise(double grundPreis, String date) {
        super(grundPreis, date);
    }

    @Override
    double preisBerechnen() {
        return grundPreis + 459.62;
    }
}

interface StornoAlgorithmus {

    double stornoBerechen(Reise reise);
}

class KulanterStornoAlgorhithmus implements StornoAlgorithmus{

    @Override
    public double stornoBerechen(Reise reise) {
        return reise.grundPreis -2000;
    }
}