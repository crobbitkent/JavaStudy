package org.kent.mail;




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

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
