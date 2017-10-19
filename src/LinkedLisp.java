/**
 * @author Jacob Boyles
 * @version 1.0
 */
public class LinkedLisp implements LispADT {

    private Link head;
    private Link tail;
    private Link curr;
    private int listSize;

    /**
     * Constructor with size param, ignores the param
     * 
     * @param size Given size input
     */
    public LinkedLisp(int size) {
        this();
    }

    /**
     * Default constructor
     */
    public LinkedLisp() {
        clear();
    }

    /**
     * Clear the current list
     */
    public void clear() {
        tail = new Link(null);
        curr = tail;
        head = new Link(tail);
        listSize = 0;
    }

    @Override
    public LispADT add(Object c) {
        curr.setNext(new Link(curr.element(), curr.next()));
        curr.setElement(c);
        if (tail == curr) {
            tail = curr.next();
        }
        listSize++;
        return this;
    }

    @Override
    public Object get() throws RuntimeException {
        return curr.element();
    }

    @Override
    public LispADT moveTo(Integer p) {
        if ((p < 0) || (p > listSize)) {
            return null;
        }
        curr = head.next();
        for (int i = 0; i < p; i++) {
            curr = curr.next();
        }
        return this;
    }

    @Override
    public LispADT next() {
        curr = curr.next();
        return this;
    }

    @Override
    public LispADT prev() {
        if (head.next() == curr) {
            return null;
        }
        Link tmp = head;
        while (tmp.next() != curr) {
            tmp = tmp.next();
        }
        curr = tmp;
        return this;
    }

    @Override
    public LispADT remove() {
        if (curr == tail) {
            return null;
        }
        curr.setElement(curr.next().element());
        if (curr.next() == tail) {
            tail = curr;
        }
        curr.setNext(curr.next().next());
        listSize--;
        return this;
    }

    @Override
    public Integer size() {
        return listSize;
    }

    @Override
    public Integer curPos() {
        Link temp = head.next();
        Integer i;
        for (i = 0; curr != temp; i++) {
            temp = temp.next();
        }
        return i;
    }

}
