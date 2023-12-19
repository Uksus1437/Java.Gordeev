package lab12;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DrunkardGameDeque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.next();
        String input2 = scanner.next();

        Deque<Integer> player1 = parseInput(input1);
        Deque<Integer> player2 = parseInput(input2);

        int moves = 0;
        while (!player1.isEmpty() && !player2.isEmpty() && moves <= 106) {
            int card1 = player1.pollLast();
            int card2 = player2.pollLast();

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

    private static Deque<Integer> parseInput(String input) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = input.length() - 1; i >= 0; i--) {
            int card = Character.getNumericValue(input.charAt(i));
            deque.addFirst(card);
        }
        return deque;
    }
}
