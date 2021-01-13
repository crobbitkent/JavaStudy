

public class IpData {
	String name;
	String ip;
	String port;
	
	public IpData(String name, String ip, String port) {
		super();
		this.name = name;
		this.ip = ip;
		this.port = port;
	}
	
	public IpData(String name, String ip) {
		super();
		this.name = name;
		this.ip = ip;
		this.port = "8080";
	}
	
	
}
