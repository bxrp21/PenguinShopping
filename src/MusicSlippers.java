
public interface MusicSlippers {
	public String getLyrics();
	public String getComposer();
	public void setLyrics(String lyrics);
	public void setComposer(String composer); 
}

class BoogieSlippers implements MusicSlippers{	
	String lyrics = "";
	String composer = "";
	@Override
	public String getLyrics() {
		return lyrics;
	}
	@Override
	public String getComposer() {
		return composer;
	}
	@Override
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
		
	}
	@Override
	public void setComposer(String composer) {
		this.composer = composer;
		
	}
}

class LoveSlippers implements MusicSlippers{
	String lyrics = "";
	String composer = "";
	@Override
	public String getLyrics() {
		return lyrics;
	}
	@Override
	public String getComposer() {
		return composer;
	}
	@Override
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
		
	}
	@Override
	public void setComposer(String composer) {
		this.composer = composer;
		
	}
}