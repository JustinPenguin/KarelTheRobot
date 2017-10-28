/*
 * Name:Justin Peng
 * Section Leader: Katherine Erdman
 * Karel leaves her home to collect the newspaper and returns to her original position
 */
import acm.program.*;

public class pizza extends ConsoleProgram {
	
private static final int KILL_ME = 0;
	public void run() {
		intro();
		userInput();
	}
	private void intro() {
		println("This program finds the two largest integers in a");
		println("list. Enter values, one per line, using a 0 to");
		println("signal the end of the list.");
	}
	private void userInput() {
		int temperature = readInt("? ");
		int highestTemperature = temperature;
		int secondHighestTemperature = 0;
		while(temperature != KILL_ME) {
		    if(temperature > highestTemperature || temperature == highestTemperature) {
		    	highestTemperature = temperature; 
		    } else if(temperature > secondHighestTemperature) {
		    	secondHighestTemperature = temperature;
		    }
		    temperature = readInt("? ");
					
		}
		println("The largest value is " + highestTemperature);
		println("The second largest is " + secondHighestTemperature);
	}
}