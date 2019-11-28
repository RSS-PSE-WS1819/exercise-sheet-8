package de.unistuttgart.iste.rss.oo.hamstersimulator.exercise8.presence;

import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.exercise8.homework.SimpleHamsterGame;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Direction;
import java.io.IOException;

/**
 * Write a description of class PainterPaule here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CollectorPaule extends SimpleHamsterGame {
	// instance variables - replace the example below with your own
	final private int x = 1;

	/**
	 * Constructor for objects of class PainterPaule
	 */
	public CollectorPaule() {
		game.displayInNewGameWindow();
		try {
			game.initialize("/territories/territory-collector.ter");
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}

	void multiMove(final int numberOfSteps) {

		for (int i = 0; i < numberOfSteps; i++) {
			paule.move();
		}
	}

}
