package pricing;


import java.math.BigDecimal;

public interface IEnergyPricingService {
	void setDataAccess(IDataAccess dataAccess);

	BigDecimal getPrice(String id) throws ProductNotFoundException;
}
