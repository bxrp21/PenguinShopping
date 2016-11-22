import org.junit.Assert.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.*;

public class CartTest{
	@Test public void test(){
		Cart c = new Cart();
		TestProduct t1 = new TestProduct("Test#1","test product #1",12.25);
		TestProduct t2 = new TestProduct("Test#2","test product #2",2.75);
		TestProduct t3 = new TestProduct("Test#3","test product #3",10.00);
		ArrayList<Product> t = new ArrayList<Product>();
		c.addItem(t1);
		assertEquals(c.getTotal(),t1.getCost(),0.001);
		c.addItem(t2);
		c.addItem(t3);
		assertEquals(c.getTotal(),t1.getCost()+t2.getCost()+t3.getCost(),0.001);
		c.remove(t3);
		assertEquals(c.getTotal(),t1.getCost()+t2.getCost(),0.001);
		c.remove(t2);
		c.remove(t1);
		assertEquals(c.getTotal(),0.0,0.001);
		assertEquals(c.getCartContents(),new ArrayList<Product>());
		c.addItem(t1);
		c.addItem(t2);
		c.addItem(t3);
		t.add(t1);
		t.add(t2);
		t.add(t3);
		assertEquals(c.getCartContents(),t);
	}
}