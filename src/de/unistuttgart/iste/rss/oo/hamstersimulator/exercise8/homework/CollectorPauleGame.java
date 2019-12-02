package de.unistuttgart.iste.rss.oo.hamstersimulator.exercise8.homework;

import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Direction;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Write a description of class CollectorPaule here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CollectorPauleGame extends SimpleHamsterGame {
	// instance variables - replace the example below with your own
	final private int x = 1;

	/**
	 * Constructor for objects of class PainterPaule
	 */
	public CollectorPauleGame() {
		File terFile = new File("territories/territory-collector.ter");
		try {
			InputStream targetStream = new FileInputStream(terFile);
			game.initialize(targetStream);
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
		game.displayInNewGameWindow();
		
	}

	/**
	 * Your comment block goes here.
	 * 
	 * @param numberOfSteps
	 */
	void multiMove(final int numberOfSteps) {

		for (int i = 0; i < numberOfSteps; i++) {
			paule.move();
		}
	}
	
	@Override
	public void run() {
		
	}
	
	/** 
	 * execute this method via the run dialog to test your code
	 */
	
	public static void main(String[] args) {
		(new PainterPauleGame()).doRun();
	}


}
