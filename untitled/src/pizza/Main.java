package pizza;

public class Main {
    public static void main(String[] args) {

        pizzaMaker bestelling1 = new pizzaMaker("Margherita");
        pizzaMaker bestelling2 = new pizzaMaker("Margherita", "extra kaas");
        pizzaMaker bestelling3 = new pizzaMaker("Margherita", "pepperoni", "champignons");

        System.out.println("Bestelling:" + bestelling1.name);
        System.out.println("Prijs:" + bestelling1.price);

        System.out.println("Bestelling:" + bestelling2.name + " met " + bestelling2.Topping1);
        System.out.println("Prijs:" + bestelling2.price);

        System.out.println("Bestelling:" + bestelling3.name + " met " + bestelling3.Topping1 + " en " + bestelling3.Topping2);
        System.out.println("Prijs:" + bestelling3.price);

    }
}

/*
facade, command, adapter, controller, decorator, singleton, composite, observer, factory
 */