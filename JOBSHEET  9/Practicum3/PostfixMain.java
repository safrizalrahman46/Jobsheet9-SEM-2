package Practicum3;

import java.util.Scanner;

public class PostfixMain {

    public static void main(String[] args) {
        Scanner sUcaP19 = new Scanner(System.in);
        String P, Q;
        System.out.println("Insert mathematical expression (infix) : ");
        Q = sUcaP19.nextLine();
        Q = Q.trim();
        Q += ' ';
        
        int total  = Q.length();

        Postflix post = new Postflix(total);
        P = post.convert(Q);
        System.out.println("Postfix: " + P);

    }
    
}

