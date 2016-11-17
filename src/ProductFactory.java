
public class ProductFactory {
	
	public static Product getNemoLollipop(){
		return new NemoLollipop();
	}
	
	public static Product getBlinkyLollipop(){
		return new BlinkyLollipop();
	}
	
	public static Product getCleoLollipop(){
		return new CleoLollipop();
	}
	
	public static Product getBoogieSlippers(){
		return new BoogieSlippers();
	}
	
	public static Product getLoveSlippers(){
		return new LoveSlippers();
	}
	
}
