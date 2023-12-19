package lab12;

import java.util.Scanner;
import java.util.Stack;

public class DrunkardGameStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.next();
        String input2 = scanner.next();

        Stack<Integer> player1 = parseInput(input1);
        Stack<Integer> player2 = parseInput(input2);

        int moves = 0;
        while (!player1.isEmpty() && !player2.isEmpty() && moves <= 106) {
            int card1 = player1.pop();
            int card2 = player2.pop();

            if ((card1 > card2) && (card2 != 0 && card1 != 9)) {
                player2.add(0, card2);
                player2.add(0, card1);
            } else {
                player1.add(0, card1);
                player1.add(0, card2);
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

    private static Stack<Integer> parseInput(String input) {
        Stack<Integer> stack = new Stack<>();
        for (int i = input.length() - 1; i >= 0; i--) {
            int card = Character.getNumericValue(input.charAt(i));
            stack.push(card);
        }
        return stack;
    }
}
