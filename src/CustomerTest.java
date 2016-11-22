import org.junit.Assert.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.*;

public class CustomerTest{
	@Test public void test(){
		Customer c = new Customer("Canada",1000.0);
		Customer c2 = new Customer("Canada",0.0);
		Customer c3 = new Customer("Mexico",9000.1);
		TestProduct t1 = new TestProduct("Test#1","test product #1",12.25);
		TestProduct t2 = new TestProduct("Test#2","test product #2",2.75);
		TestProduct t3 = new TestProduct("Test#3","test product #3",10.00);
		ArrayList<Product> t = new ArrayList<Product>();
		c.addToCart(t1);
		c.addToCart(t2);
		c.addToCart(t3);
		t.add(t1);
		t.add(t2);
		t.add(t3);
		assertEquals(c.getCart().getCartContents(),t);
		c2.addToCart(t1);
		c2.addToCart(t2);
		c2.addToCart(t3);
		c3.addToCart(t1);
		c3.addToCart(t2);
		c3.addToCart(t3);
		assertEquals(c.checkOut(),true);
		assertEquals(c2.checkOut(),false);
		assertEquals(c3.checkOut(),false);
	}
}