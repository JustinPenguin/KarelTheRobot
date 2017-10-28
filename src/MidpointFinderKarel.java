/*
 * Name: Justin Peng
 * Section Leader: Katherine Erdman
 * Karel places a beeper on the midpoint of street 1 in any world and then stands on the corner above it.
 * Cite: Referenced Stephen Hamlin for how to approach this question
 */

import stanford.karel.*;

public class MidpointFinderKarel extends SuperKarel {
	public void run() {
		makeSquare();
		midpointFinder();
		topOfMidpoint();
	}
/*
 * Karel creates the largest square possible in the world by moving one to the right and up
 * precondition: Karel is on street 1 avenue 1 facing East
 * postcondition: Karel is facing West on the right most avenue 	
 */
	private void makeSquare() {
		while(frontIsClear()) {
			move();
			turnLeft();
			move();
			turnRight();
		}
		turnAround();
	}
/*
 * Karel goes down 1 and left 2 corners at a time until it hits the Southern wall and places a beeper
 * precondition: Karel is facing West on the right most avenue
 * postcondition: Karel is at the midpoint of the first street facing West
 */
	private void midpointFinder() {
		while(leftIsClear()) {
			move();
			turnLeft();
			move();
			move();
			turnRight();
		}
	
		putBeeper();
	}
/*
 * Karel moves to the top of the beeper it has placed at the midpoint of street 1
 * precondition: Karel is facing West on the beeper it has placed at the midpoint of street 1
 * postcondition: Karel is on top of the beeper it has placed on street 1 facing North
 */
	private void topOfMidpoint() {
		turnRight();
		move();
	}
}
