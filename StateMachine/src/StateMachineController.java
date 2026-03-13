import java.util.Scanner;

import stateMachine.StateMachine;
import stateMachine.util.StateMachineUtils;
import ext.*;

public class StateMachineController {
	
	private static final String PATH = "model/";
	private static final String MODEL = "car.stm";
	
	public static void main(String[] args) {
		MicrowaveBusiness business = new MicrowaveBusiness();
		StateMachineUtils.putExtMap("business", business);
		
		//Stack stack = new Stack();
		//StateMachineUtils.putExtMap("stack", stack);
		
		//Car car = new Car();
		//StateMachineUtils.putExtMap("car", car);
		
		StateMachine stm = StateMachineUtils.loadStateMachineFromStateMachineModel(PATH + MODEL);
		StateMachinePlayer player = new StateMachinePlayer(stm);
		player.init();
		
		//player.printStateMachine(stm);
		
		Scanner sc = new Scanner(System.in);
		String[] input;
		do {
			for (Thread t : player.getRunningThreads()) {
				try { t.join(); }
				catch(InterruptedException ie) { ie.printStackTrace(); }
			}
			System.out.println("--------------------------------------------");
			System.out.println(business.toString());
			//System.out.println(stack.toString());
			//System.out.println(car.toString());
			player.printActiveState();
			System.out.print("Enter event name ('end' to finish): ");
			input = sc.nextLine().split(" ");
			if (input.length > 1) StateMachineUtils.putExtMap("eventValue", input[1]);
			if (!input[0].equals("end")) player.processEvent(input[0]);
		} while(!input[0].equals("end"));
		System.out.println("End of program");
		sc.close();
	}
	
}
