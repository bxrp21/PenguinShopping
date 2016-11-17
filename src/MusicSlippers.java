
public interface MusicSlippers {
	public String getLyrics();
	public String getComposer();
	public void setLyrics(String lyrics);
	public void setComposer(String composer); 
}

class BoogieSlippers implements MusicSlippers, Product{	
	private String name;
	private int cost;
	private String description;	
}

class LoveSlippers implements MusicSlippers, Product{
	
}