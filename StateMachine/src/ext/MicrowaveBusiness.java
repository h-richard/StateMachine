package ext;
public class MicrowaveBusiness {
	
	private boolean lightOn = false;
	private boolean doorOpen = false;
	private boolean magnetronOn = false;
	
	private int a = 1;
	
	public void turnOnlight() {
		lightOn = true;
	}
	
	public void turnOffLight() {
		lightOn = false;
	}
	
	public void openDoor() {
		doorOpen = true;
	}
	
	public void closeDoor() {
		doorOpen = false;
	}
	
	public void turnOnMagnetron() {
		magnetronOn = true;
	}
	
	public void turnOffMagnetron() {
		magnetronOn = false;
	}
	
	public boolean guard1() {
		return true;
	}
	
	public boolean guard2() {
		return false;
	}
	
	public String toString() {
		return "[Light on: "+lightOn+", magnetron on: "+magnetronOn+", door open: "+doorOpen+"]";
	}
}
