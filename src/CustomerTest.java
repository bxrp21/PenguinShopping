import org.junit.Assert.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.*;

public class CustomerTest{
	@Test public void transactionTests(){
		Customer c = new Customer("Canada",1000.0);
		Customer c2 = new Customer("Canada",0.0);
		Customer c3 = new Customer("Mexico",9000.1);
		Customer c4 = new Customer("Neverland", -1000);
		TestProduct t1 = new TestProduct("Test#1","test product #1",12.25);
		TestProduct t2 = new TestProduct("Test#2","test product #2",2.75);
		TestProduct t3 = new TestProduct("Test#3","test product #3",10.00);
		//Testing whether the two lists belonging to customer and external one are the same.
		ArrayList<Product> t = new ArrayList<Product>();
		c.addToCart(t1);
		c.addToCart(t2);
		c.addToCart(t3);
		t.add(t1);
		t.add(t2);
		t.add(t3);
		assertEquals(c.getCart().getCartContents(),t);
		//end test of two lists
		c2.addToCart(t1);
		c2.addToCart(t2);
		c2.addToCart(t3);
		c3.addToCart(t1);
		c3.addToCart(t2);
		c3.addToCart(t3);
		c4.addToCart(t1);
		c4.addToCart(t2);
		c4.addToCart(t3);
		//Test normal transaction: When customer has enough money and is shipping to right country
		assertEquals(c.checkOut(),true);
		//test transaction when customer does not have enough money for transaction, but lives in right country
		assertEquals(c2.checkOut(),false);
		//test transaction when customer does not live in right country, but has enough money
		assertEquals(c3.checkOut(),false);
		//test transaction when customer does not live in right country, and does not have enough money.
		assertEquals(c4.checkOut(), false);
	}
}