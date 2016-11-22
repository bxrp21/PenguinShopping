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
	
	public Customer(String country, double money){
		myCountry = country;
		myMoney = money;
		myCart = new Cart();
	}
	
	public void addToCart(Product addedProd){
		myCart.addItem(addedProd);
	}
	
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
