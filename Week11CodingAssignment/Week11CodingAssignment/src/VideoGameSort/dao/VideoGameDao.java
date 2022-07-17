package VideoGameSort.dao;

import java.util.ArrayList;
import java.util.List;

import VideoGameSort.entity.VideoGames;


public class VideoGameDao {

	public static	List<VideoGames> videoGames = new ArrayList<>(List.of(
			new VideoGames("First Person Shooter"),
			new VideoGames("Role-Playing"),
			new VideoGames("Real-time Strategy"),
			new VideoGames("Massive Multiplayer Online"),
			new VideoGames("Sports"),
			new VideoGames("Japanese Role-Playing"),
			new VideoGames("Simulation"),
			new VideoGames("Fighting"),
			new VideoGames("Music")
			));
	
	
	public List<VideoGames> getGames(){
		return videoGames;
	}
}
