package dukstak;

public class Main {
    public static void main(String[] args) {
        // Membuat beberapa objek Receipt
        Receipt receipt1 = new Receipt("123", "2024-04-29", 2, 50.0);
        Receipt receipt2 = new Receipt("456", "2024-04-30", 3, 75.0);
        Receipt receipt3 = new Receipt("789", "2024-05-01", 1, 30.0);

        // Membuat sebuah stack
        Stack stack = new Stack();

        // Menambahkan receipt ke dalam stack
        stack.push(receipt1);
        stack.push(receipt2);
        stack.push(receipt3);

        // Mengambil receipt dari stack dan menampilkannya
        while (!stack.isEmpty()) {
            Receipt receipt = stack.pop();
            System.out.println(receipt);
        }
    }
}
