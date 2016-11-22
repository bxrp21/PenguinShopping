/**
 * Abstract class to represent a "product".
 * 
 * @author Lustin
 *
 */

public abstract class Product{
	private String name;
	private String desc;
	private Double cost;
	
	/* GETTERS AND SETTERS */
	public String getName(){
		return name;
	}
	public String getDescription(){
		return desc;
	}
	
	public double getCost(){
		return cost;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setDescription(String description){
		this.desc = description;
	}
	
	public void setCost(double cost){
		this.cost = cost;
	}
	/* END GETTERS AND SETTERS */
}