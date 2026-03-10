import java.util.Scanner;

import stateMachine.StateMachine;
import stateMachine.util.StateMachineUtils;

public class StateMachineController {
	
	private static final String PATH = "model/";
	private static final String MODEL = "microwave.stm";
	
	public static void main(String[] args) {
		MicrowaveBusiness business = new MicrowaveBusiness();
		StateMachineUtils.putExtMap("business", business);
		
		StateMachine stm = StateMachineUtils.loadStateMachineFromStateMachineModel(PATH + MODEL);
		StateMachinePlayer player = new StateMachinePlayer(stm);
		player.init();
		
		//player.printStateMachine(stm);
		
		Scanner sc = new Scanner(System.in);
		String event = "";
		do {
			System.out.println("--------------------------------------------");
			System.out.println(business.toString());
			player.printActiveState();
			System.out.print("Enter event name ('end' to finish): ");
			event = sc.nextLine();
			if (!event.equals("end")) player.processEvent(event);
		} while(!event.equals("end"));
		System.out.println("End of program");
		sc.close();
	}
	
}
