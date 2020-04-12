public class Discjockey {
	SongComponent songList;
	
public Discjockey(SongComponent newSongList) {
	songList = newSongList;
	
}
	
	public void getSongList() {
		
		songList.displaySongInfo();
	}
}
