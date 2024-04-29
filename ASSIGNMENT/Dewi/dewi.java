package Dewi;

import java.util.Scanner; // Import Scanner class if not already imported

public class dewi {
    public static void main(String[] args) {

        CustomStack<Integer> intStack = new CustomStack<>();
        CustomStack<String> stringStack = new CustomStack<>(); // Corrected typo
        CustomStack<Receipt> receiptStack = new CustomStack<>();
        Scanner scanner = new Scanner(System.in);
        
        // Simulate adding receipts to the stack
        for (int i = 1; i <= 8; i++) {
            System.out.println("Enter details for Receipt " + i + ":");
            System.out.print("Transaction ID: ");
            String transactionId = scanner.nextLine();
            System.out.print("Date: ");
            String date = scanner.nextLine();
            System.out.print("Quantity of Items: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.print("Total Price: ");
            double totalPrice = Double.parseDouble(scanner.nextLine());
            
            Receipt receipt = new Receipt(transactionId, date, quantity, totalPrice);
            receiptStack.push(receipt);
        }
        
        // Retrieve and display the receipts
        System.out.println("\nRetrieving Receipts:");
        while (!receiptStack.isEmpty()) {
            Receipt receipt = receiptStack.pop();
            System.out.println(receipt);
        }
    }
}
