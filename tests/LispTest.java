import static org.junit.Assert.*;
import org.junit.*;

/**
 * Unit tests for Lisp
 * @author Jacob Boyles
 * @version 1.0
 */
public class LispTest {
    
    @Test
    /**
     * Test to make sure event with given size of 10 list is empty.
     */
    public void testConstructorWithParam() {
        Lisp list = new Lisp(10);
        assertSame(0, list.size());
    }
    
    @Test
    /**
     * Test for size of 0 with no size param given to constructor.
     */
    public void testConstructorNoParam() {
        Lisp list = new Lisp();
        assertSame(0, list.size());
    }
    
    @Test
    /**
     * Test for adding one object to list.
     */
    public void testAddOne() {
       Lisp list = new Lisp(1);
       list.add(1);
       assertSame(1, list.size()); //Make sure size was incremented
       assertSame(1, list.get()); //Make sure object in the list was the one added
       assertSame(0, list.curPos()); //Make sure current is still at the 0th element
    }
    
    @Test
    /**
     * Test to add two objects to list and move current between both links.
     */
    public void testAddTwo() {
        Lisp list = new Lisp(2);
        list.add(1);
        list.add(2);
        assertSame(2, list.size()); //Make sure size was incremented twice
        assertSame(2, list.get()); //Make sure second link is two
        list.moveTo(1); //Move current back to first link
        assertSame(1, list.get()); //Make sure first link is one
    }
    
    @Test
    /**
     * Test to clear a list of all elements
     */
    public void testClear() {
        Lisp list = new Lisp();
        list.add(1);
        list.add(2);
        assertSame(2, list.size()); //Make sure list size is two before clearing
        list.clear();
        assertSame(0, list.size()); //Make sure list size is 0 after clear
    }

}
