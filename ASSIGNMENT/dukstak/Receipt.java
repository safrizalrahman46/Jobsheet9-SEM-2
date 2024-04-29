package dukstak;

public class Receipt {
    private String transactionId;
    private String date;
    private int quantity;
    private double totalPrice;

    public Receipt(String transactionId, String date, int quantity, double totalPrice) {
        this.transactionId = transactionId;
        this.date = date;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

}
