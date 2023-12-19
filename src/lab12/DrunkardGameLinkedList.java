package lab12;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class DrunkardGameLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.next();
        String input2 = scanner.next();

        LinkedList<Integer> player1 = parseInput(input1);
        LinkedList<Integer> player2 = parseInput(input2);

        int moves = 0;
        while (!player1.isEmpty() && !player2.isEmpty() && moves <= 106) {
            int card1 = player1.removeLast();
            int card2 = player2.removeLast();

            if ((card1 > card2) && (card2 != 0 && card1 != 9)) {
                player2.addFirst(card1);
                player2.addFirst(card2);
            } else {
                player1.addFirst(card1);
                player1.addFirst(card2);
            }

            moves++;
        }

        if (player1.isEmpty()) {
            System.out.println("first " + moves);
        } else if (player2.isEmpty()) {
            System.out.println("second " + moves);
        } else {
            System.out.println("botva");
        }
    }

    private static LinkedList<Integer> parseInput(String input) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = input.length() - 1; i >= 0; i--) {
            int card = Character.getNumericValue(input.charAt(i));
            list.addFirst(card);
        }
        return list;
    }
}
