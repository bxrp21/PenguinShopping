
public class SlippersFactory extends AbstractFactory {
	
	private static SlippersFactory slipFact;
	
	protected SlippersFactory(){
		//to prevent instantiation
	}
	
	public static synchronized SlippersFactory getInstance(){
		if(slipFact == null){
			slipFact = new SlippersFactory();
		}
		return slipFact;
	}
	
	public static MusicSlippers getBoogieSlippers(){
		return new BoogieSlippers();
	}
	
	public static MusicSlippers getLoveSlippers(){
		return new LoveSlippers();
	}
}
