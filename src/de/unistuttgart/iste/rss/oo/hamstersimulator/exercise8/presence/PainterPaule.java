package de.unistuttgart.iste.rss.oo.hamstersimulator.exercise8.presence;

import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Direction;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Write a description of class PainterPaule here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PainterPaule extends SimpleHamsterGame {
	// instance variables - replace the example below with your own
	final private int x = 1;

	/**
	 * Constructor for objects of class PainterPaule
	 */
	public PainterPaule() {
		File terFile = new File("territories/territory-painting.ter");
		try {
			InputStream targetStream = new FileInputStream(terFile);
			game.initialize(targetStream);
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
		game.displayInNewGameWindow();
		
	}

	void multiMove(final int numberOfSteps) {

		for (int i = 0; i < numberOfSteps; i++) {
			paule.move();
		}
	}

	/**
	 * Tests the painting of number one ("001") after implementing correctly:
	 * initialPosition() - which puts paule in the first position ready to paint a
	 * digit paintZero() - paints the digit 0 paintOne() - paints the digit space()
	 * - space after a digit one or zero put paule to ready position for the next
	 * digit
	 */
	@Override
	public void run() {
		
		// initialPosition();
		// paintZero();
		// space();
		// paintZero();
		// space();
		// paintOne();
	}
	
	/** 
	 * execute this method via the run dialog to test your code
	 */
	
	public static void main(String[] args) {
		(new PainterPaule()).doRun();
	}

}
