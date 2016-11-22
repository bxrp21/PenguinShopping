import java.util.*;

/**
 * Cart class
 * @author Patrick Coyle
 *
 */

public class Cart {
	private ArrayList<Product> products = new ArrayList<Product>();
	private double total;
	/**
	 * Adds item to cart list
	 * @param p Product to add to list
	 */
	public void addItem(Product p){
		products.add(p);
		total = total + p.getCost();
	}
	/**
	 * Removes item from list
	 * @param p Product to remove from list
	 */
	public void remove(Product p){
		products.remove(p);
		total = total - p.getCost();
	}
	
	/**
	 * Returns the total cost of all products in list
	 * @return The total cost of all products in list
	 */
	public double getTotal(){
		return total;
	}
	
	/**
	 * Returns the list containing the products
	 * @return the arraylist containing the products
	 */
	public ArrayList<Product> getCartContents(){
		return products;
	}
}
