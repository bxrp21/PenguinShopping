

public class LollipopFactory extends AbstractFactory{
	
	private static LollipopFactory lolFact;
	
	protected LollipopFactory(){
		//to prevent instantiation
	}
	
	public static synchronized LollipopFactory getInstance(){
		if(lolFact == null){
			lolFact = new LollipopFactory();
		}
		return lolFact;
	}
	
	public static Lollipop NemoLollipop(){
		return new NemoLollipop();
	}
	
	public static Lollipop BlinkyLollipop(){
		return new BlinkyLollipop();
	}
	
	public static Lollipop CleoLollipop(){
		return new CleoLollipop();
	}
}
