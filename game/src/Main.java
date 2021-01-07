import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.game.ui.BaseUI;
import org.game.ui.MainUI;
import org.game.ui.QuizUI;
import org.game.ui.RSPGameUI;
import org.game.ui.LuckGameUI;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Map<String, BaseUI> map = new HashMap<>();
		map.put("BBB", new LuckGameUI(scanner));
		map.put("RSP", new RSPGameUI(scanner));
		map.put("QUIZ", new QuizUI(scanner));

		MainUI mainUI = new MainUI(scanner, map);

		mainUI.playGame();
	}

}
