public class MyStack {

    private String [] elements;
    private int nextFree;
    static int defaultSize;

    public static void setDefaultSize(int size){
        defaultSize = size;
    }

    public static int getDefaultSize(){
        return defaultSize;
    }

    //*********** Konstruktoren *********//

    public MyStack(){
        this(defaultSize);



    }
    public MyStack(int size ){
        elements = new String[size];
        nextFree = 0;

    }

    public void push (String element ) {
        if (isFull()){
            throw new RuntimeException("Operation nicht möglich, weil Stack voll ist");
        }
        elements[nextFree] = element;
        nextFree ++;


    }
    public String pop(){
        if (isEmpty()){
            throw new RuntimeException("Operation nicht möglich, weil Stack leer ist.");
        }
        nextFree --;
        String firstElement = elements[nextFree];
        elements[nextFree] = null;
        return firstElement;

    }

    public boolean isEmpty() {
        return nextFree == 0;
    }
    public boolean isFull() {
        return nextFree >= elements.length;
    }

}
