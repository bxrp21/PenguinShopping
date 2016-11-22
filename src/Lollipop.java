
public interface Lollipop{
	public String getFlavor();
}

class NemoLollipop extends Product implements Lollipop{
	
	private String flavour = "Nemo";
	
	public NemoLollipop(){
		this.setName("Nemo Fish Lollipop");
		this.setDescription("A delicious lollipop that will taste just like Nemo!");
		this.setCost(5.00);
	}
	
	public String getFlavor(){
		return flavour;
	}
	
}

class BlinkyLollipop extends Product implements Lollipop{
	private String flavour = "Blinky";
	
	public BlinkyLollipop(){
		this.setName("Blinky Fish Lollipop");
		this.setDescription("A delicious lollipop that will taste just like Blinky!");
		this.setCost(3.00);
	}
	
	public String getFlavor(){
		return flavour;
	}
}

class CleoLollipop extends Product implements Lollipop{
	private String flavour = "Cleo";
	
	public CleoLollipop(){
		this.setName("Cleo Fish Lollipop");
		this.setDescription("A delicious lollipop that will taste just like Cleo!");
		this.setCost(4.00);
	}
	
	public String getFlavor(){
		return flavour;
	}
}

