import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AbstractFactoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		//Check if we get Lollipop factory
		assertTrue(AbstractFactory.getProductFactory("Lollipop") instanceof LollipopFactory);
		//check if we get Slipper factory
		assertTrue(AbstractFactory.getProductFactory("Slippers") instanceof SlippersFactory);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testInvalid(){
		AbstractFactory.getProductFactory("null");
	}

}
