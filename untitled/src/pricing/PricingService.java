package pricing;

public class PricingService {
}
/*
De pricing.PricingService klasse rekent op een DataAccess klasse om gegevens uit een databank op te halen. De pricing.PricingService kan door middel van een uniek ID de prijs van de producten ophalen. De pricing.PricingService klasse maakt gebruik van de DataAccess klasse, maar neemt niet de verantwoordelijkheid op om deze aan te maken. Deze verantwoordelijkheid is terug te vinden in een ander gedeelte van de applicatie.

We voorzien twee interfaces: IPricingService en IDataAccess.

De interface IDataAccess bevat enkel de methode

double getPriceByID(String ID)
De interface IPricingService bestaat uit de volgende methodes:

void setDataAccess(IDataAccess dataAccess)
double getPrice(String id) throws ProductNotFoundException
We voorzien enkel een implementatie van pricing.PricingService. De opgave werd voorzien en kan je hier downloaden Download hier downloaden.

Werk de volgende testcases uit met behulp van Easymock downloaden Download Easymock downloaden.

Testcase 1
We controleren of de pricing.PricingService implementatie een prijs ophaalt via de DataAccess klasse wanneer we een correct ID gebruiken.

Testcase 2
We controleren dat wanneer de DataAccess klasse de prijs op basis van de ID niet terugvindt, de pricing.PricingService implementatie een ProductNotFoundException gooit.

Maak je een ZIP bestand van je oplossing die je hier upload.
 */