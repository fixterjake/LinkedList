/**
 * Link class for use in Lisp implementation
 * @author Jacob Boyles
 * @version 1.0
 */
public class Link {
    
    private Object e;
    
    private Link n;
    
    /**
     * Constructor for Link
     * @param it
     * @param inn
     */
    public Link(Object it, Link inn) {
        e = it;
        n = inn;
    }
    
    /**
     * Constructor for Link
     * @param inn
     */
    public Link(Link inn) {
        e = null;
        n = inn;
    }
    
    /**
     * Method to return the object in the Link
     * @return Object
     */
    Object Element() {
        return e;
    }
    
    /**
     * Set the element of link to the param it
     * @param it given Object
     * @return Object assigned as it
     */
    Object setElement(Object it) {
        return e = it;
    }
    
    /**
     * Return the next Link
     * @return Next Link
     */
    Link next() {
        return n;
    }
    
    /**
     * Set the next link to given param
     * @param inn Given Object
     * @return Given Object assigned to N
     */
    Link setNext(Link inn) {
        return n = inn;
    }
}