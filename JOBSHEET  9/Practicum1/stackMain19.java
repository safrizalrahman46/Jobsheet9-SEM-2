import java.util.Scanner;

public class stackMain19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        stack19 stk = new stack19(5);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter published year: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter pages amount: ");
                    int pages = scanner.nextInt();
                    System.out.print("Enter price: ");
                    int price = scanner.nextInt();
                    stk.push(new book19(title, author, year, pages, price));
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    //     stack19 stk = new stack19(5);

    //     // Creating book19 objects and pushing them into the stack
    //     book19 book1 = new book19("Ingkang", "Ingkang", 2020, 300, 20);
    //     book19 book2 = new book19("jengki", "jengki", 2019, 250, 15);
    //     book19 book3 = new book19("Sampitak", "Sampitak", 2018, 400, 25);
        
    //     stk.push(book1);
    //     stk.push(book2);
    //     stk.push(book3);
        
    //     stk.print();

    //     stk.pop();
    //     stk.peek();
    //     stk.print();

    //     // stack19 stk = new Stack(5); // Creating a stack with a capacity of 5

    //  // Creating instances of book19
    //     book19 book4 = new book19("Klepon", "Klepon", 2018, 400, 25);
    //     book19 book5 = new book19("Ponitel", "Ponitel", 2018, 400, 25);

    //     stk.push(book1); // Adding book1 to the stack
    //     stk.push(book2); // Adding book2 to the stack

    //     stk.print(); // Displaying the result

    }
        // stack19 stk = new stack19(5);
    
    // stk.push(15);
    // stk.push(27);
    // stk.push(13);
    // stk.print();

    // stk.push(11);
    // stk.push(34);
    // stk.pop();
    // stk.peek();
    // stk.print();
    // }

}