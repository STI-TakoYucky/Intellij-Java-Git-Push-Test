import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<String> nicknames = new PriorityQueue<>();

        System.out.println("Enter the nicknames of 8 of your classmates:");
        for (int i = 1; i <= 8; i++) {
            System.out.print("Classmate #" + i + ": ");
            nicknames.offer(scanner.nextLine());
        }

        while (!nicknames.isEmpty()){
            System.out.println("Press H to say hi to " + nicknames.peek());

            if (scanner.nextLine().equalsIgnoreCase("H")) {
                System.out.println("Hi " + nicknames.remove() + "!");
            } else {
                System.out.println("Only press H to say hi.");
            }
        }

        System.out.println("Done saying hi.");
    }
}
