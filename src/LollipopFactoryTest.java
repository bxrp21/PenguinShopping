import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LollipopFactoryTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void singletonTest() {
		//The next test in comments is invalid, because the constructor is private!
		//assertEquals(LollipopFactory.getInstance(), new LollipopFactory());
		//Testing to see whether getInstance gives same object
		assertEquals(LollipopFactory.getInstance(), LollipopFactory.getInstance());
	}
	@Test
	public void lollipopTests(){
		LollipopFactory lolFact = LollipopFactory.getInstance();
		//Nemo Lollipop tests
		//flavor test
		assertEquals(lolFact.NemoLollipop().getFlavor(), "Nemo");
		Product nemoLollipop = (Product) lolFact.NemoLollipop();
		//Name test
		assertEquals(nemoLollipop.getName(), "Nemo Fish Lollipop");
		//Description test
		assertEquals(nemoLollipop.getDescription(), "A delicious lollipop that will taste just like Nemo!");
		//cost test
		assertEquals(nemoLollipop.getCost(), 5.0, 0);
		//Blinky Lollipop tests
		//flavor test
		assertEquals(lolFact.BlinkyLollipop().getFlavor(), "Blinky");
		Product blinkyLollipop = (Product) lolFact.BlinkyLollipop();
		//Name test
		assertEquals(blinkyLollipop.getName(), "Blinky Fish Lollipop");
		//Description test
		assertEquals(blinkyLollipop.getDescription(), "A delicious lollipop that will taste just like Blinky!");
		//cost test
		assertEquals(blinkyLollipop.getCost(), 3.0, 0);
		//Cleo Lollipop tests
		assertEquals(lolFact.CleoLollipop().getFlavor(), "Cleo");
		Product cleoLollipop = (Product) lolFact.CleoLollipop();
		//Name test
		assertEquals(cleoLollipop.getName(), "Cleo Fish Lollipop");
		//Description test
		assertEquals(cleoLollipop.getDescription(), "A delicious lollipop that will taste just like Cleo!");
		//cost test
		assertEquals(cleoLollipop.getCost(), 4.0, 0);
	}

}
