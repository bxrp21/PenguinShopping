
public class Clerk {
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
	
	private boolean checkCost(double custMoney, double cartMoney){
		if(custMoney < cartMoney){
			System.out.println("You do not have enough money!");
			return false;
		}
		return true;
	}
	
	public boolean checkCustCart(Customer cust){
		if(checkCountry(cust.askCountry()) && checkCost(cust.getMoney(), cust.getCart().getTotal())){
			System.out.println("Thank you for your patronage!");
			return true;
		}
		return false;
	}
}
