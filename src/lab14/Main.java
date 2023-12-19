package lab14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WaitList<String> waitList = new WaitList<>();
        BoundedWaitList<String> boundedWaitList = new BoundedWaitList<>(5);
        UnfairWaitList<String> unfairWaitList = new UnfairWaitList<>();

        waitList.add("Alice");
        waitList.add("Bob");
        waitList.add("Charlie");

        boundedWaitList.add("Dave");
        boundedWaitList.add("Eve");
        boundedWaitList.add("Frank");

        unfairWaitList.add("Grace");
        unfairWaitList.add("Henry");
        unfairWaitList.add("Isabel");

        System.out.println("WaitList: " + waitList);
        System.out.println("BoundedWaitList: " + boundedWaitList);
        System.out.println("UnfairWaitList: " + unfairWaitList);

        waitList.remove();
        boundedWaitList.remove();
        unfairWaitList.remove("Henry");

        System.out.println("Is 'Alice' in WaitList? " + waitList.contains("Alice"));
        System.out.println("Is BoundedWaitList empty? " + boundedWaitList.isEmpty());
        System.out.println("Is UnfairWaitList empty? " + unfairWaitList.isEmpty());

        unfairWaitList.moveToBack("Grace");

        System.out.println("WaitList after removal: " + waitList);
        System.out.println("BoundedWaitList after removal: " + boundedWaitList);
        System.out.println("UnfairWaitList after removal and move: " + unfairWaitList);
    }
}
