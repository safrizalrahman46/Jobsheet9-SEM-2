package dukstak;


public class Stack {
    private Node top;
    private int size;

    private class Node {
        Receipt data;
        Node next;

        Node(Receipt data) {
            this.data = data;
        }
    }

    public Stack() {
        top = null;
        size = 0;
    }

    public void push(Receipt data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public Receipt pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Receipt data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public Receipt peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}


