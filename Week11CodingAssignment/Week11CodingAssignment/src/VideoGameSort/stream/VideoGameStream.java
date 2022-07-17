package VideoGameSort.stream;

import java.util.stream.Collectors;

import VideoGameSort.dao.VideoGameDao;

public class VideoGameStream {
	
	public static void main(String[] args) {
		System.out.println("Stream Sort:");
		String streamGames = VideoGameDao.videoGames
				.stream()
				.map(game -> game.toString())
				.sorted()
				.collect(Collectors.joining(", "));
		System.out.println(streamGames);
	}
	
}
