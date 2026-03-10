public class MicrowaveBusiness {
	
	private boolean lightOn = false;
	private boolean doorOpen = false;
	private boolean magnetronOn = false;
	
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
	
	public String toString() {
		return "[Light on: "+lightOn+", magnetron on: "+magnetronOn+", door open: "+doorOpen+"]";
	}
}
