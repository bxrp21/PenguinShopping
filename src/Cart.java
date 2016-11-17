import java.util.*;

public class Cart {
	private ArrayList<Product> items = new ArrayList<Product>();
	private double total;

	public void addItem(Product p){
		items.add(p);
		total = total + p.cost;
	}
	public void remove(Product p){

		total = total - p.cost;
	}
	public double getTotal(){
		return total;
	}
}
