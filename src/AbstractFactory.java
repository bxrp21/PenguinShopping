
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