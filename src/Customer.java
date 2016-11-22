import java.util.*;

public class Customer {
	private String myCountry;
	private Cart myCart;
	private double myMoney;
	private ArrayList<Product> bag = new ArrayList<Product>();
	
	
	/* Getters and setters */
	public double getMoney(){
		return myMoney;
	}
	
	public String askCountry(){
		return myCountry;
	}
	
	public Cart getCart(){
		return myCart;
	}
	
	public void pay(double amountToPay){
		myMoney -= amountToPay;
	}
	/* END GETTERS AND SETTERS */
	/**
	 * Constructor for customer
	 * @param country Country of origin
	 * @param money Money the customer starts with
	 */
	public Customer(String country, double money){
		myCountry = country;
		myMoney = money;
		myCart = new Cart();
	}
	
	/**
	 * Adds item to customers cart
	 * @param addedProd The product to add
	 */
	public void addToCart(Product addedProd){
		myCart.addItem(addedProd);
	}
	
	/**
	 * The checkout with a clerk. If true, adds products to customers bag.
	 * @return True if transaction successful, false otherwise
	 */
	public boolean checkOut(){
		Clerk clerk = new Clerk();
		if(clerk.checkCustCart(this)){
			pay(myCart.getTotal());
			for(int i = 0; i < myCart.getCartContents().size(); i++){
				bag.add(myCart.getCartContents().get(i));
			}
			return true;
		}
		return false;
		
	}
	
	
}
