package pizza;

public class pizzaMaker {

    public String name;
    public double price;
    public String Topping1;
    public String Topping2;


    public pizzaMaker(String name) {
        this.name = name;
        this.price = 8.0;
    }

    public pizzaMaker(String name, String topping1) {
        this.name = name;
        this.price = 9.5;
        Topping1 = topping1;
    }

    public pizzaMaker(String name, String topping1, String topping2) {
        this.name = name;
        this.price = 11.0;
        this.Topping1 = topping1;
        this.Topping2 = topping2;
    }

}
// factory pattern

/*

Opdracht: Pizzabestelsysteem

Een pizzarestaurant wil een bestelsysteem implementeren waarin klanten een basispizza kunnen kiezen en optioneel
extra toppings kunnen toevoegen, zoals kaas, peperoni of champignons.
De prijs van de pizza wordt dynamisch berekend op basis van de gekozen extra's.
Vereisten:

Implementeer een programma voor het pizzabestelsysteem dat klanten toelaat om een basispizza te bestellen en extra toppings toe te voegen.
Gebruik het geschikte design pattern.
Zorg voor een compacte en goed gestructureerde oplossing en upload het ZIP-bestand met je code.
Voorzie een main-methode om het programma te testen met de volgende output:

Bestelling 1: Margherita pizza
Prijs: €8.00

Bestelling 2: Margherita pizza met extra kaas
Prijs: €9.50

Bestelling 3: Margherita pizza met peperoni en champignons
Prijs: €11.00*

 */