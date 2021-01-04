import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileScannerTest {

	@Test
	void test() throws Exception {
		File file = new File("C:\\testDB\\emailList.txt");
		FileScanner scanner = new FileScanner(file);
		String[] test = scanner.readAllLine(100);
		
		for(int i = 0; i < 100; ++i) {
			System.out.println(test[i]);
		}
	}

}
