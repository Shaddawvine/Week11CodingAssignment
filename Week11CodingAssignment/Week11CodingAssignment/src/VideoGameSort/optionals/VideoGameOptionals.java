package VideoGameSort.optionals;

import java.util.NoSuchElementException;
import java.util.Optional;

import VideoGameSort.entity.VideoGames;

public class VideoGameOptionals {

	public static void main(String[] args) {
		
		VideoGames gameType = gamingMethod(Optional.of(new VideoGames("Educational")));
		System.out.println("a type of game is: " + gameType);
		
		try {
				Optional<VideoGames> empty = Optional.empty();
				gamingMethod(empty);
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}
		private static VideoGames gamingMethod(Optional<VideoGames> optionalGame) {
			return optionalGame.orElseThrow(() -> new NoSuchElementException("Gaming type not found!"));
		
	}

}
