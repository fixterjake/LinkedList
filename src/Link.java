/**
 * Link class for use in Lisp implementation
 * @author Jacob Boyles
 * @version 1.0
 */
public class Link {
    
    private Object current;
    
    private Link next;
    
    /**
     * Constructor for Link
     * @param it Object it
     * @param inn Link inn
     */
    public Link(Object it, Link inn) {
        current = it;
        next = inn;
    }
    
    /**
     * Constructor for Link
     * @param inn Link inn
     */
    public Link(Link inn) {
        current = null;
        next = inn;
    }
    
    /**
     * Method to return the object in the Link
     * @return Object
     */
    Object element() {
        return current;
    }
    
    /**
     * Set the element of link to the param it
     * @param it given Object
     * @return Object assigned as it
     */
    Object setElement(Object it) {
        current = it;
        return it;
    }
    
    /**
     * Return the next Link
     * @return Next Link
     */
    Link next() {
        return next;
    }
    
    /**
     * Set the next link to given param
     * @param inn Given Object
     * @return Given Object assigned to N
     */
    Link setNext(Link inn) {
        next = inn;
        return inn;
    }
}