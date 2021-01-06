package inheritanceEX;

public class Main {
	
	
	
	public static void main(String[] args) {
		Rifle rifle = new Rifle();
		
		Bullet bullet = new LightBullet();
		
		rifle.fire(bullet);
	}
	
	
	
}
