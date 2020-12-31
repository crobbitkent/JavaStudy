package d6;

import java.util.Arrays;

// Movie class를 통해서 KNN
public class KNNClass {
	public static void main(String[] args){
		
		Movie[] movies = new Movie[6];
		int length = movies.length;
		
		movies[0] = new Movie("Action", 6, 4);
		movies[1] = new Movie("Action", 7, 2);
		movies[2] = new Movie("Action", 5, 2);
		movies[3] = new Movie("Mello", 4, 5);
		movies[4] = new Movie("Mello", 3, 4);
		movies[5] = new Movie("Mello", 3, 2);
		
		// 확인용 출력
		System.out.println(Arrays.toString(movies));
		
		// 분류할 새 영화
		Movie targetMovie = new Movie("", 4, 4);
		
		/*
		 * for(int i = 0; i < length; ++i) { double distance =
		 * movies[i].calcDistance(targetMovie); System.out.println(distance); }
		 */
		
		Arrays.sort(movies, (a,b) -> 
			Double.compare(a.calcDistance(targetMovie), b.calcDistance(targetMovie))
			);
		
		System.out.println(Arrays.toString(movies));
	}
}
