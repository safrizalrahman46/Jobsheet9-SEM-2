/**
 * stack19
 */
public class stack19 {

    int size;
    int top;
    int push;
    book19 data[];
    
    public stack19(int size) {
        this.size = size;
        data = new book19[size];
        top = -1;
    }

    public boolean IsEmpty(){
        if (top == -1){
        return true;
        }else {
        return false;
        }
    }

    public boolean IsFull() {
        return top == size - 1;
    }
    
    // public boolean IsFull(){
    //     if (top == size) {
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }

    public void push(book19 dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack is full. Cannot push element.");
        }
    }
    // public void push (book19 dt ){
    //     if (!IsFull()) {
    //         top++;
    //         data[top] = dt;
    //     } 
    // }

    public void pop() {
        if (!IsEmpty()) {
            book19 x = data[top];
            top--;
            System.out.println("Removed data: " + x);
        } else {
            System.out.println("Stack is empty. Cannot pop element.");
        }
    }
    
    // public void pop(){
    //     if (!IsEmpty()) {
    //         book19 x = data[top];
    //         top--;
    //         System.out.println("Remove data : " + x);
    //     }else{
    //         System.out.println("Stack is empty");
    //     }
    // }

    public void peek(){
        System.out.println("Top element : " +data[top]);
    }

    public void print() {
        System.out.println("Stack content:");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i] + " ");
        }
        System.out.println();
    }
    
    // public void print (){
    //     System.out.println("Stack content: ");
    //     for (int i = top; i >- 0; i--) {
    //         System.out.println(data[i] + " ");
    //     }
    //     System.out.println("");
    // }

    public void clear(){
        if (!IsEmpty()) {
            for (int i =top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack is now empty");
        }else{
            System.out.println("Failed ! Stack is still empty ");
        }
    }
}

