
public class Services {
	public void printDoorIsOpen() {
		System.out.println("Door is open");
	}
	
	public void printBakingWasPaused() {
		System.out.println("Baking was paused !");
	}
	
	public int bake(int seconds){
		int remaining = seconds;
		System.out.println("Baking...");
		while (remaining > 0) {
			System.out.println(remaining);
			remaining--;
			try { Thread.sleep(1000); }
			catch (InterruptedException e) { break; }
		}
		return remaining;
	}
}
