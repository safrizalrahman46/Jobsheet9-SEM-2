import java.util.Scanner;

public class bookMain19 {

    public static void main(String[] args) {
        stack19 st = new stack19(8);
        Scanner sc19 = new Scanner(System.in);
    
        char choose;
        do {
            System.out.print("Title: ");
            String title = sc19.nextLine();
    
            System.out.print("Author name: ");
            String name = sc19.nextLine();
    
            System.out.print("Published year: ");
            int year = sc19.nextInt();
    
            System.out.print("Pages Amount: ");
            int pages = sc19.nextInt();
    
            System.out.print("Price: ");
            int price = sc19.nextInt();
    
            book19 bk = new book19(title, name, year, pages, price);
            System.out.println("Do you want to add new data to the stack (y/n)? ");
            choose = sc19.next().charAt(0);
            sc19.nextLine();
            st.push(bk); // Pushing a book19 object
        } while (choose == 'y');
        st.print();
        st.pop();
        st.peek();
        st.print();
    }
    
    // public static void main(String[] args) {
    // stack19 st = new stack19(8);
    // Scanner sc19 = new Scanner(System.in);

    // char choose ;
    // do {
    //     System.out.print("Title : ");
    //     String title = sc19.nextLine();

    //     System.out.print("Author name : ");
    //     String name = sc19.nextLine();

    //     System.out.print("Published year : ");
    //     int year = sc19.nextInt();

    //     System.out.print("Pages Amount : ");
    //     int pages = sc19.nextInt();

    //     System.out.print("Price : ");
    //     int price = sc19.nextInt();

    //     book19 bk = new book19(title, name, year, pages, price);
    //     System.out.println("Do you want add new data to stack (y/n)? ");
    //     choose = sc19.next().charAt(0);
    //     sc19.nextLine();
    //     st.push(bk);
    // } while (choose == 'y');
    // st.print();
    // st.pop();
    // st.peek();
    // st.print();
    }


