package warehouse;

public class WarehouseInventory {
    private final int productId;
    private int stock;
    public WarehouseInventory(int productId, int stock) {
        this.productId = productId;
        this.stock = stock;
    }
    public boolean addStock(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
        if (productId <= 0) {
            throw new IllegalStateException();
        }
        stock += amount;
        return true;
    }
    public boolean removeStock(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
        if (amount > stock) {
            return false; // Niet genoeg voorraad beschikbaar
        }
        stock -= amount;
        return true;
    }
    public int getStock() {
        return stock;
    }


}
/*
Opdracht: Magazijnvoorraadbeheersysteem

Een programmeur kreeg de volgende opdracht:

Ontwikkel een klasse warehouse.WarehouseInventory met een productId en een stock als datamembers.

Voorzie een methode addStock(amount) voor deze klasse met een boolean waarde als return value.

Indien het amount kleiner dan of gelijk aan 0 is, genereert de methode een IllegalArgumentException.
Indien het productId kleiner dan of gelijk aan 0 is, genereert de methode een IllegalStateException.
Indien er geen fouten optreden, zal de methode true teruggeven en het opgegeven bedrag worden toegevoegd aan de stock.

Voorzie een methode removeStock(amount) die een boolean waarde teruggeeft.

Indien het amount kleiner dan of gelijk aan 0 is, genereert de methode een IllegalArgumentException.
Indien het gevraagde aantal groter is dan de beschikbare voorraad, retourneert de methode false zonder de voorraad te wijzigen.
Indien de operatie succesvol is, zal de methode true teruggeven en het opgegeven bedrag van de voorraad aftrekken.
De klasse warehouse.WarehouseInventory Download WarehouseInventorywerd reeds voorzien.
!!!!!Jouw opdracht is om vijf gepaste JUnit-testen te schrijven. Zorg ervoor dat na het uitvoeren van iedere test steeds de removeStock() methode wordt uitgevoerd.!!!!!!!

!!!!!!!!!!!Gelieve je oplossing (enkel de testen) hier te uploaden.!!!!!!!!

 */