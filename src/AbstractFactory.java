/**
 * The abstract factory for all the Products.
 * 
 * @author Patrick Coyle and Blake Lawrence
 *
 */
public class AbstractFactory{
	
	static final AbstractFactory getProductFactory(String productType){	
		switch (productType)
		{
		case "Lollipop":
			return LollipopFactory.getInstance();
		case "Slippers":
			return SlippersFactory.getInstance();
		}
		String error = "Illegal Product!";
		throw new IllegalArgumentException(error);
	}
	
	
}