/*
 * Name: Justin Peng
 * Section Leader: Katherine Erdman
 * Karel rebuilds columns of beepers on the posts of the arches of any height on any world
 */

import stanford.karel.*;
public class StoneMasonKarel extends SuperKarel {
	public void run() {
		while(frontIsClear()) {
			buildColumn();
			moveToNextColumn();
		}
	buildColumn();
	}
/*
 * Karel turns upwards and moves while placing beepers on empty corners
 * precondition: Karel is facing East on the first street
 * postcondition: Karel is facing South on the first street of the avenue that the most recent column was built	
 */
	private void buildColumn() {
		turnLeft();
		while(frontIsClear()) {
			if(beepersPresent()) {
				move();
			} else
			putBeeper();
		}
		if(noBeepersPresent()) {
			putBeeper();
		} 
		turnAround();
		while(frontIsClear()) {
			move();
		}
	}
/*
 * Karel turns left and moves 4 corners down the street it's on to be in position to build the next column
 * precondition: Karel is facing East on the first street and is not facing a wall
 * postcondition: Karel is facing East on the first street at the start of the next column
 */
	private void moveToNextColumn() {
		turnLeft();
		for(int i=0; i<4; i++) {
			move();
		}
	}
	// TODO: write the code to implement this program

}
