
public interface MusicSlippers {
	/**
	 * Returns the song name.
	 * @return String The song's name.
	 */
	public String getSongName();
	/**
	 * Returns a (portion) of the lyrics.
	 * @return String The lyrics associated with the song.
	 */
	public String getLyrics();
	/**
	 * Returns the artist of the song in the slippers.
	 * @return String The name of the artist.
	 */
	public String getArtist();
}

class BoogieSlippers extends Product implements MusicSlippers{	
	private String songName = "Boogie Wonder Land";
	private String lyrics = "Dance, boogie wonderland";
	private String artist = "Earth, Wind & Fire";
	
	
	@Override
	public String getSongName(){
		return songName;
	}
	@Override
	public String getLyrics() {
		return lyrics;
	}
	@Override
	public String getArtist() {
		return artist;
	}
}

//Because this is better than the Justin Bieber version :)
class LoveSlippers extends Product implements MusicSlippers{
	private String songName = "Somebody to love";
	private String lyrics = "Can anybody find me somebody to love";
	private String artist = "Queen";
	
	@Override 
	public String getSongName(){
		return songName;
	}
	@Override
	public String getLyrics() {
		return lyrics;
	}
	@Override
	public String getArtist() {
		return artist;
	}
}