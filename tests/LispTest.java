import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Lisp
 * 
 * @author Jacob Boyles
 * @version 1.0
 */
public class LispTest {

    /**
     * Test to make sure event with given size of 10 list is empty.
     */
    @Test
    public void testConstructorWithParam() {
        LinkedLisp list = new LinkedLisp(10);
        assertSame(0, list.size()); // Assert empty list size is 0 even with
                                    // size param
    }

    /**
     * Test for size of 0 with no size param given to constructor.
     */
    @Test
    public void testConstructorNoParam() {
        LinkedLisp list = new LinkedLisp();
        assertSame(0, list.size()); // Assert empty list size is 0
    }

    /**
     * Test for adding one object to list.
     */
    @Test
    public void testAddOne() {
        LinkedLisp list = new LinkedLisp(1);
        list.add(1);
        assertSame(1, list.size()); // Make sure size was incremented
        assertSame(1, list.get()); // Make sure object in the list was the one
                                   // added
        assertSame(0, list.curPos()); // Make sure current is still at the 0th
                                      // element
    }

    /**
     * Test to add two objects to list and move current between both links.
     */
    @Test
    public void testAddTwo() {
        LinkedLisp list = new LinkedLisp(2);
        list.add(1);
        list.add(2);
        assertSame(2, list.size()); // Make sure size was incremented twice
        assertSame(2, list.get()); // Make sure second link is two
        list.moveTo(1); // Move current back to first link
        assertSame(1, list.get()); // Make sure first link is one
    }

    /**
     * Test to clear a list of all elements
     */
    @Test
    public void testClear() {
        LinkedLisp list = new LinkedLisp();
        list.add(1);
        list.add(2);
        assertSame(2, list.size()); // Make sure list size is two before
                                    // clearing
        list.clear();
        assertSame(0, list.size()); // Make sure list size is 0 after clear
    }

    /**
     * Test with one int
     */
    @Test
    public void testGetInt() {
        LinkedLisp list = new LinkedLisp();
        list.add(1); // Add int '1' to list
        assertSame(1, list.get()); // Make sure int '1' is in the list
    }

    /**
     * Test get method with many integers
     */
    @Test
    public void testGetIntMany() {
        LinkedLisp list = new LinkedLisp(100);
        for (int i = 0; i < 101; i++) {
            list.add(i);
        }
        list.moveTo(0); // Move to 0th element
        assertSame(100, list.get()); // Make sure current is at 0'th element and
                                     // that element is 100
        list.moveTo(100); // Move to 100th element
        assertSame(0, list.get()); // Make sure current element is 100'th and
                                   // that element is 0
    }

    /**
     * Test getting the next link in the list
     */
    @Test
    public void testNext() {
        LinkedLisp list = new LinkedLisp(2);
        list.add(1); // Add one to list
        list.add(2); // Add two to list
        assertSame(1, list.next().get()); // Assert that the next link's value
                                          // is one
    }

    /**
     * Test getting previous element from list
     */
    @Test
    public void testPrev() {
        LinkedLisp list = new LinkedLisp();
        list.add(1); // Add '1' to list
        list.add(2); // Add '2' to list
        list.next(); // Move current to next element
        assertSame(2, list.prev().get()); // Make sure the previous element is
                                          // '2'
    }

    /**
     * Test for empty list should have size of zero
     */
    @Test
    public void testSizeZero() {
        LinkedLisp list = new LinkedLisp();
        assertSame(0, list.size()); // Make sure empty list is size 0
    }

    /**
     * Test for list with many elements
     */
    @Test
    public void testSizeNotZero() {
        LinkedLisp list = new LinkedLisp(100);
        for (int i = 0; i < 100; i++) {
            list.add(i); // Add i'th element to the list
        }
        assertSame(100, list.size()); // Make sure size is 100
    }

    /**
     * Test to try removing current element from list
     */
    @Test
    public void testRemove() {
        LinkedLisp list = new LinkedLisp(1);
        list.add(1); // Add '1' to list
        assertSame(1, list.size()); // Make sure the size pre-remove is 1
        assertSame(1, list.get()); // Make sure element pre-remove is '1'
        list.remove(); // Remove current element
        assertSame(0, list.size()); // Make sure size post-remove is 0
        assertSame(null, list.get()); // Make sure element post-remove is null
    }
    
    /**
     * Try to remove with size zero
     */
    @Test
    public void testRemoveSizeOne() {
        LinkedLisp list = new LinkedLisp(1);
        list.add(1); //Add '1' to list
        list.remove(); //Remove that element
        assertNull(list.remove()); //Try to remove hen size is 0
    }
    /**
     * Try to remove multiple elements
     */
    @Test
    public void testRemoveMulti() {
        LinkedLisp list = new LinkedLisp(2);
        list.add(1); //Add '1' to the list
        list.add(2); //Add '2' to the list
        assertSame(2, list.size()); //Make sure list pre-remove is 2
        list.remove(); //Remove current element from the list
        assertSame(1, list.size()); //Make sure size post-remove is 1
        assertSame(1, list.get()); //Make sure the element not removed is '1'
    }
    
    /**
     * Test for moving object to an index less than zero
     */
    @Test
    public void testMoveLessThanZero() {
        LinkedLisp list = new LinkedLisp(1);
        list.add(1); //Add '1' to the list
        assertNull(list.moveTo(-1)); //Try to move to index at -1
    }
    
    /**
     * Test for moving object to an index larger than the size
     */
    @Test
    public void testMoveLargerThanSize() {
        LinkedLisp list = new LinkedLisp(1);
        list.add(1); //Add '1' to the list
        assertNull(list.moveTo(100)); //Try to move to index 100
    }
    
    /**
     * Test current post method
     */
    @Test
    public void testCurrPos() {
        LinkedLisp list = new LinkedLisp();
        Integer curr = list.curPos();
        assertSame(0, curr);
    }

}
