
/**
 * Singleton, factory Class for Slippers
 * 
 * @author Patrick Coyle
 *
 */

public class SlippersFactory extends AbstractFactory {
	
	private static SlippersFactory slipFact;
	
	private SlippersFactory(){
		//to prevent instantiation
	}
	
	public static synchronized SlippersFactory getInstance(){
		if(slipFact == null){
			slipFact = new SlippersFactory();
		}
		return slipFact;
	}
	
	public MusicSlippers getBoogieSlippers(){
		return new BoogieSlippers();
	}
	
	public MusicSlippers getLoveSlippers(){
		return new LoveSlippers();
	}
}
