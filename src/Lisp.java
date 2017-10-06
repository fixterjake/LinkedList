/**
 * @author Jacob Boyles
 * @version 1.0
 */
public class Lisp implements LispADT {
    
    private Link head;
    private Link tail;
    private Link curr;
    private int listSize;
    
    /**
     * Constructor with size param, ignores the param
     * @param size
     */
    public Lisp(int size) {
        this();
    }
    
    /**
     * Default constructor
     */
    public Lisp() {
        clear();
    }
    
    /**
     * Clear the current list
     */
    public void clear() {
        curr = tail = new Link(null);
        head = new Link(tail);
        listSize = 0;
    }

    @Override
    public LispADT add(Object c) {
        curr.setNext(new Link(curr.Element(), curr.next()));
        curr.setElement(c);
        if (tail == curr) {
            tail = curr.next();
        }
        listSize++;
        return this;
    }

    @Override
    public Object get() throws RuntimeException {
        
        return null;
    }

    @Override
    public LispADT moveTo(Integer p) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LispADT next() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LispADT prev() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LispADT remove() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer size() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer curPos() {
        // TODO Auto-generated method stub
        return null;
    }

}
