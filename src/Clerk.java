
public class Clerk {
	/**
	 * Checks if country of customer is valid
	 * @param customerCountry Country of customer
	 * @return true if valid country, false otherwise.
	 */
	private boolean checkCountry(String customerCountry){
		switch(customerCountry){
		case "Antartic":
			return true;
		case "Canada":
			return true;
		case "France":
			return true;
		case "Australia":
			return true;
		default:
			System.out.println("We can't ship to your country!");
			return false;
		}
		
	}
	/**
	 * Check if customer has enough money to pay for products
	 * @param custMoney The money the customer has
	 * @param cartMoney The money the customer needs
	 * @return True if they had enough money, false otherwise.
	 */
	private boolean checkCost(double custMoney, double cartMoney){
		if(custMoney < cartMoney){
			System.out.println("You do not have enough money!");
			return false;
		}
		return true;
	}
	/**
	 * calls the above three methods to see whether the transaction is successful or not.
	 * @param cust The customer that wants to buy products
	 * @return true if transaction successful, false otherwise
	 */
	public boolean checkCustCart(Customer cust){
		if(checkCountry(cust.askCountry()) && checkCost(cust.getMoney(), cust.getCart().getTotal())){
			System.out.println("Thank you for your patronage!");
			return true;
		}
		return false;
	}
}
