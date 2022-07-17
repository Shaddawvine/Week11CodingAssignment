package VideoGameSort.entity;

public class VideoGames {

	private String game;
	
	public VideoGames(String game) {
		this.game = game;
	}
	
	public String toString() {
		return game;
	}
	
	public String getGame() {
		return game + " game";
	}
	
	public static int compareGame(VideoGames game1, VideoGames game2) {
		return game1.game.compareTo(game2.game);
	}
	

	
	
}
