
/**
 * Singleton Factory class for Lollipops
 * 
 * @author Patrick Coyle
 *
 */

public class LollipopFactory extends AbstractFactory{
	
	private static LollipopFactory lolFact;
	
	private LollipopFactory(){
		//to prevent instantiation
	}
	
	public static synchronized LollipopFactory getInstance(){
		if(lolFact == null){
			lolFact = new LollipopFactory();
		}
		return lolFact;
	}
	
	public Lollipop NemoLollipop(){
		return new NemoLollipop();
	}
	
	public Lollipop BlinkyLollipop(){
		return new BlinkyLollipop();
	}
	
	public Lollipop CleoLollipop(){
		return new CleoLollipop();
	}
}
