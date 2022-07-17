package VideoGameSort.service;

import java.util.Comparator;
import java.util.List;

import VideoGameSort.dao.VideoGameDao;
import VideoGameSort.entity.VideoGames;

public class VideoGameSortService {
	private VideoGameDao dao = new VideoGameDao();
	
	public List<VideoGames> getGame(VideoGameSortType type){
		List<VideoGames> videoGames = dao.getGames();
		Comparator<VideoGames> comp = null;
		
		switch(type) {
			
			case Lambda:
			comp = (game1,game2) -> VideoGames.compareGame(game1, game2);
				break;
			case MethodReference:
			comp = VideoGames::compareGame;
				break;
			default:
			throw new RuntimeException("Unhandled sort type: " + type);
		
		}
		
		
		
		
		videoGames.sort(comp);
		return videoGames;
	}
	
	static class VideoGamesSort implements Comparator<VideoGames>{
		@Override
		public int compare(VideoGames game1, VideoGames game2) {
			return VideoGames.compareGame(game1, game2);
		}
}

}