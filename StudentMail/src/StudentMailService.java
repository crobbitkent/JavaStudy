import java.io.File;

public class StudentMailService {
	private MessageDTO[] messageList; 
	private StudentDAO dao;
	private MailSender sender;
	
	public void ready(MailConfig config) {
		sender = new MailSender(config);
	
	}
	
	public void sendAll(File file, String title, String content) throws Exception {
		dao = new StudentDAO(file);
		
		Student[] studentList = dao.fileToList(file);
		
		int length = studentList.length;
		messageList = new MessageDTO[length];
		
		for(int i = 0; i < length; ++i) {
			messageList[i] = new MessageDTO(studentList[i].getEmail(), title, content);
		}
		
		sender.sendMails(messageList);
	}	
	
}
