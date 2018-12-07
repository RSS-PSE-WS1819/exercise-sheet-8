import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Direction;
import java.io.IOException;

/**
 * Write a description of class PainterPaule here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PainterPaule extends SimpleHamsterGame
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class PainterPaule
     */
    public PainterPaule()
    {
        game.displayInNewGameWindow();
        try {
            game.initialize("/territories/territory-painting.ter");
        } catch (IOException ex){
            throw new RuntimeException(ex);
        }
    }
    
    void multiMove (int numberOfSteps) {
           
        for (int i = 0; i<numberOfSteps; i++) {
            paule.move();
        }
    }
    
    /**
     * Tests the painting of number one ("001") after implementing correctly:
     * initialPosition() - which puts paule in the first position ready to 
     *                     paint a digit
     * paintZero() - paints the digit 0
     * paintOne() - paints the digit 
     * space() - space after a digit one or zero put paule to ready position
     *           for the next digit
     */
    public void testPaintingOne(){
        //initialPosition();
        //paintZero();
        //space();
        //paintZero();
        //space();
        //paintOne();     
    }
   
    
    
    
}
