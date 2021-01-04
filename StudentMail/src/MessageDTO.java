import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// repository class
public class MessageDTO {
	private String to;
	private String title;
	private String content;
	
	public MessageDTO(String to, String title, String content) {
		super();
		this.to = to;
		this.title = title;
		this.content = content;
	}

	@Override
	public String toString() {
		return "MessageDTO [to=" + to + ", title=" + title + ", content=" + content + "]";
	}


	
}
