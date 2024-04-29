/**
 * book19
 */
public class book19 {

    String  authorName;
    int publishedYear, pagesAmount, price;
    private String title;
    private String author;


    public book19(String tt, String nm, int yr, int pam, int pr){
        this.title = tt;
        this.authorName= nm;
        this.publishedYear = pam;
        this.price = pr;
    }

    public book19(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    int size,top;
    book19 data[];

    public void stack19 (int size){
        this.size = size;
        data = new book19[size];
        top = -1 ;
    }

    public boolean IsEmpty(){
        if (top == -1){
        return true;
        }else {
        return false;
        }
    }

    public boolean IsFull(){
        if (top == size) {
            return true;
        }else{
            return false;
        }
    }

    public void push (book19 dt){
        if (!IsFull()) {
            top++;
            data[top] = dt ;
        }else {
            System.out.println("Stack is full");
        }
    }

    public void pop(){
        if (!IsEmpty()) {
            book19 x = data[top];
            top--;
            System.out.println("Removed data : " + x.title + " "+
             x.authorName + " " + x.publishedYear + " " +
             x.pagesAmount + " " + x.price ); 
        }else {
            System.out.println("Top element : " + data[top]);
        }
    }

    public void peek(){
        System.out.println("Top element : " +data[top]);
    }
    
    public void print() {
        System.out.println("Stack content:");
        for (int i = top; i >= 0; i--) {
            System.out.println("Title: " + data[i].title + " " +
            data[i].authorName + " " + data[i].publishedYear +
            data[i].pagesAmount + " " + data[i].price);  
        }
        System.out.println("");
    }  
}