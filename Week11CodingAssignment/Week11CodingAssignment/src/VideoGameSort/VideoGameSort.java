package VideoGameSort;

import java.util.Comparator;
import java.util.List;

import VideoGameSort.entity.VideoGames;
import VideoGameSort.service.VideoGameSortType;
import VideoGameSort.service.VideoGameSortService;

public class VideoGameSort implements Comparator<VideoGames>{

	private VideoGameSortService sortService = new VideoGameSortService();
	
	public static void main(String[] args) {
		new VideoGameSort().run();

	}

	private void run() {
		System.out.println("Lambda Sort:");
		List<VideoGames> videoGames = sortService.getGame(VideoGameSortType.Lambda);
		print(videoGames, VideoGameSortType.Lambda);
		
		System.out.println();
		
		System.out.println("Method Reference Sort:");
		List<VideoGames> videoGames1 = sortService.getGame(VideoGameSortType.MethodReference);
		print(videoGames1, VideoGameSortType.MethodReference);
	}

	private void print(List<VideoGames> videoGames, VideoGameSortType type) {
		switch(type) {
		
		case Lambda:
			videoGames.forEach(game -> System.out.println(game.getGame()));
			break;
		case MethodReference:
			videoGames.forEach(System.out::println);
			break;
		default:
			break;
		}
	}

	@Override
	public int compare(VideoGames game1, VideoGames game2) {
		
		return VideoGames.compareGame(game1, game2);
	}

}
