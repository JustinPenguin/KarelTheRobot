/*
 * Name: Justin Peng
 * Section Leader: Katherine Erdman
 * Karel creates a checkerboard pattern on any world she is given
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	public void run() {
		placeStartBeepers();
		if(frontIsClear()) {
			placeRows();
		}
		if(frontIsClear()) {
			while(leftIsClear()) {
		
			moveUpRow();
			placeRows();
			}
		}
	}
/*
 * Karel places Beepers at every other corner on the first avenue and then comes back down to its starting position of street 1 avenue 1 when it hits a wall
 * precondition: Karel starts at street 1 avenue 1 facing East
 * postcondition: Karel is back at street 1 avenue 1 facing East
 */
	private void placeStartBeepers() {
			turnLeft();
			putBeeper();
			while(frontIsClear()) {
				move();
				if(frontIsClear()) {
					move();
					putBeeper();
				}
			}
			resetPosition();
	}
/*
 * Karel turns around and goes back to the bottom of the avenue
 * precondition: Karel is at the top of the first avenue facing North
 * postcondition: Karel is at the bottom of the first avenue facing East	
 */
	private void resetPosition() {
		turnAround();
		while(frontIsClear()) {
			move();
		}
		turnLeft();
	}
/*
 * Karel will go down the street placing beepers on every other corner while checking to see if her front is clear prior
 * After hitting a wall, Karel will go back to the start of the street that it just worked on.
 * precondition: Karel is on the first avenue of the street she's working on facing East.
 * postcondition: Karel is on the first avenue of the street she's working on facing East.
 */
	private void placeRows() {
		if(noBeepersPresent()){
			putBeeper();
		}
		while(frontIsClear()) {
			move();
			if(frontIsClear()) {
				move();
				putBeeper();
			}
		}
		if(frontIsBlocked()) {
			goBack();
		}
	}
/*
 * Karel moves up to the next street when it has completed the street it is currently on.
 * After moving up to the next street, it checks to see if there's a beeper on the corner of the first avenue 
 * that would've been placed by the method placeStartBeepers.
 * If there's no beeper, it will move forward a space. If not, it will stay put.
 */
	private void moveUpRow() {
		turnLeft();
		move();
		turnRight();
		if(noBeepersPresent()) {
			move();
		}
	}
/*
 * Karel goes back to her original starting point on the first avenue of the street it was working on after completing it.
 * precondition: Karel is facing a wall on the last avenue on the street she worked on.
 * postcondition: Karel is facing East on the first first avenue of the street she worked on.
 */
	private void goBack() {
		turnAround();
		while(frontIsClear()) {
			move();
		}
		turnAround();
	}
}
