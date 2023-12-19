package lab12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DrunkardGameQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.next();
        String input2 = scanner.next();

        Queue<Integer> player1 = parseInput(input1);
        Queue<Integer> player2 = parseInput(input2);

        int moves = 0;
        while (!player1.isEmpty() && !player2.isEmpty() && moves <= 106) {
            int card1 = player1.poll();
            int card2 = player2.poll();

            if ((card1 > card2) && (card2 != 0 && card1 != 9)) {
                player2.add(card2);
                player2.add(card1);
            } else {
                player1.add(card1);
                player1.add(card2);
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

    private static Queue<Integer> parseInput(String input) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            int card = Character.getNumericValue(input.charAt(i));
            queue.add(card);
        }
        return queue;
    }
}
