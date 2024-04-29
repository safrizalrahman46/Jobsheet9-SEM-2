package Practicum3;

import java.util.Scanner;
import java.util.Stack;

public class poltek {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Insert Sentence: ");
            String sentence = scanner.nextLine();
            
            String reversedSentence = reverseSentence(sentence);
            
            System.out.println("Result: " + reversedSentence);
        }
        
        public static String reverseSentence(String sentence) {
            Stack<Character> stack = new Stack<>();
            
            // Push each character of the sentence onto the stack
            for (int i = 0; i < sentence.length(); i++) {
                stack.push(sentence.charAt(i));
            }
            
            // Pop each character from the stack to construct the reversed sentence
            StringBuilder reversed = new StringBuilder();
            while (!stack.isEmpty()) {
                reversed.append(stack.pop());
            }
            
            return reversed.toString();
        }
    } 

