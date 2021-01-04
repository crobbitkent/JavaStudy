package BBB;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Memo {

	private String content;
	
	public Memo(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
}	
