package pricing;


import java.math.BigDecimal;


public class EnergyPricingService implements IEnergyPricingService {
	private IDataAccess dataAccess;

	public EnergyPricingService() {
		super();
	}

	public EnergyPricingService(IDataAccess dataAccess) {
		super();
		this.dataAccess = dataAccess;
	}

	public void setDataAccess(IDataAccess dataAccess) {
		this.dataAccess = dataAccess;
	}

	public BigDecimal getPrice(String id) throws ProductNotFoundException {
		BigDecimal price = this.dataAccess.getPriceByID(id);
		if (price == null) {
			throw new ProductNotFoundException("ID not found.");
		}
		return price;
	}
}
