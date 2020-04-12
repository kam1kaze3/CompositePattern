
public class SongListGenerator {

	public static void main(String[] args) {
		SongComponent industrialMusic = 
				new SongGroup("Industrial", 
						"is a style of experimental music that draws on transgressive and provocative themes ");
		SongComponent heavyMetalMusic =
				new SongGroup("Heavy metal","is a genre of rock that was developed in the late 1980s,largely in the UK and the US");
		SongComponent dubstepMusic =
			new SongGroup ("Dubstep","is a genre of electronic dance music that originated in south London, England");
	
		SongComponent everySong = new SongGroup("Song list", "Every song Available");
		
		everySong.add(industrialMusic);
		
		industrialMusic.add(new Song("Head like a Hole", " NIN", 1990));
		industrialMusic.add(new Song("Headhunter", " Front 242", 1988));
		
		industrialMusic.add(dubstepMusic);
		
		dubstepMusic.add(new Song("Centipede"," Knife party", 2012));
		dubstepMusic.add(new Song("Tetris"," Doctor P", 2011));
		
		everySong.add(heavyMetalMusic);
		
		heavyMetalMusic.add(new Song("War Pigs", " Black Sabath", 1970));
		heavyMetalMusic.add(new Song("Ace of Spades", " Motorhead", 1980));
		
		Discjockey crazyLarry = new Discjockey(everySong);
		
		crazyLarry.getSongList();
	}

}
