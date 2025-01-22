package pricing;
 
 
 import java.math.BigDecimal;
 
 public interface IDataAccess {
     BigDecimal getPriceByID(String ID);
 }
