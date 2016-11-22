import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SlippersFactoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		SlippersFactory slipFact = SlippersFactory.getInstance();
		//Boogie Slipper Tests
		//artist test
		assertEquals(slipFact.getBoogieSlippers().getArtist(), "Earth, Wind & Fire");
		//lyrics test
		assertEquals(slipFact.getBoogieSlippers().getLyrics(), "Dance, boogie wonderland");
		//songname test
		assertEquals(slipFact.getBoogieSlippers().getSongName(), "Boogie Wonder Land");
		
		Product boogieSlippers = (Product) slipFact.getBoogieSlippers();
		//Name test
		assertEquals(boogieSlippers.getName(), "Boogie Wonderland Slippers");
		//Description test
		assertEquals(boogieSlippers.getDescription(), "Wonderful slippers that will play boogie wonderland for you!");
		//cost test
		assertEquals(boogieSlippers.getCost(), 25.50, 0);
		//Love Slippers
		//artist test
		assertEquals(slipFact.getLoveSlippers().getArtist(), "Queen");
		//lyrics test
		assertEquals(slipFact.getLoveSlippers().getLyrics(), "Can anybody find me somebody to love");
		//songname test
		assertEquals(slipFact.getLoveSlippers().getSongName(), "Somebody to love");
		
		Product loveSlippers = (Product) slipFact.getLoveSlippers();
		//Name test
		assertEquals(loveSlippers.getName(), "Somebody to Love Slippers");
		//Description test
		assertEquals(loveSlippers.getDescription(), "Limited edition slippers that play Somebody to Love from Queen!");
		//cost test
		assertEquals(loveSlippers.getCost(), 75.99, 0);
	}

}
