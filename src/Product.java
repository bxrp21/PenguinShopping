public abstract class Product{
	String name;
	String desc;
	Double cost;
	
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
}