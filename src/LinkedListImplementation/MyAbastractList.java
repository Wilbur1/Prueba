package LinkedListImplementation;

public abstract class MyAbastractList<E> implements MyList<E> {

    protected int size;

    protected MyAbastractList() {
    }

    protected MyAbastractList(E[] elements) {
        for (int i = 0; i < elements.length; i++) {
            add(elements[i]);
        }
    }

    // add Element e at the end of the list
    public void add(E e) {
        add(size, e);
    }

    public boolean isEmpty() {
        return size == 0;
    }

//   Another way to implement the isEmpty function 
//    public boolean isEmpty() {
//        if (size == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    
    public int size(){
        return size;
    }
}
