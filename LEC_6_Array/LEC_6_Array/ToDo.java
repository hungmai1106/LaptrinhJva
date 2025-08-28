package Lec6;

import java.util.Scanner;
import java.util.ArrayList;

public class ToDo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- TO-DO LIST ---");
            System.out.println("1. Add a new task");
            System.out.println("2. View all tasks");
            System.out.println("3. Remove a task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    tasks.add(task); 
                    System.out.println("-> Task added!");
                    break;

                case 2:
                    System.out.println("-> To-Do List:");
                    if (tasks.isEmpty()) {
                        System.out.println("(No tasks yet!)");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter index to remove: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                        System.out.println("-> Task removed!");
                    } else {
                        System.out.println("-> Invalid index!");
                    }
                    break;

                case 4:
                    System.out.println("Exited");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);
    }
}
