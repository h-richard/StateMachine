package ext;

public class Car {
	
	private int speed = 0;
	private boolean max = false;
	
	public void stop() {
		speed = 0;
		max = false;
	}
	
	public void speedUp() {
		speed += 10;
	}
	
	public void slowDown() {
		speed -= 10;
		max = false;
	}
	
	public void maxReached() {
		speed = 100;
		max = true;
	}
	
	public boolean isSpeed10() {
		return speed == 10;
	}
	
	public boolean isSpeedNot10() {
		return speed != 10;
	}
	
	public boolean isSpeed90() {
		return speed == 90;
	}
	
	public boolean isSpeedNot90() {
		return speed != 90;
	}
	
	public String toString() {
		return "[speed:"+speed+", max:"+max+"]";
	}
}
