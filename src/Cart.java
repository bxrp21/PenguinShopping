import java.util.*;

public class Cart {
	private ArrayList<Product> products = new ArrayList<Product>();
	private double total;

	public void addItem(Product p){
		products.add(p);
		total = total + p.cost;
	}
	public void remove(Product p){
		total = total - p.cost;
	}
	public double getTotal(){
		return total;
	}
	
	public ArrayList<Product> getCartContents(){
		return products;
	}
}
