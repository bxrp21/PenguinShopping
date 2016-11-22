import java.util.*;

public class Cart {
	private ArrayList<Product> products = new ArrayList<Product>();
	private double total;

	public void addItem(Product p){
		products.add(p);
		total = total + p.getCost();
	}
	public void remove(Product p){
<<<<<<< HEAD
		products.remove(p);
		total = total - p.cost;
=======
		total = total - p.getCost();
>>>>>>> origin/master
	}
	public double getTotal(){
		return total;
	}
	
	public ArrayList<Product> getCartContents(){
		return products;
	}
}
