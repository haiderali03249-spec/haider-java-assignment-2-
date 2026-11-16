import java.util.Scanner;

public class QueueArray {
    static int[] queue = new int[5];
    static int count = 0;

    static void enqueue(int value) {
        if (count == 5) {
            System.out.println("Queue Overflow!");
        } else {
            queue[count++] = value;
        }
    }

    static void dequeue() {
        if (count == 0) {
            System.out.println("Queue Underflow!");
        } else {
            System.out.println("Removed: " + queue[0]);

            for (int i = 0; i < count - 1; i++) {
                queue[i] = queue[i + 1];
            }

            count--;
        }
    }

    static void front() {
        if (count == 0) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Front: " + queue[0]);
        }
    }

    static void display() {
        if (count == 0) {
            System.out.println("Queue is empty!");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Front");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    enqueue(sc.nextInt());
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    front();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.out.println("Program Ended.");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}