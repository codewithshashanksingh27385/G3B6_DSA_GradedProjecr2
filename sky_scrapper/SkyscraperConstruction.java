package sky_scrapper;

import java.util.*;

class SkyscraperConstruction {
    void construct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of floors in the building");
        int n = scanner.nextInt();

        PriorityQueue<Integer> availableFloors = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the floor size given on day " + i);
            int size = scanner.nextInt();
            availableFloors.add(size);

            System.out.println("The order of construction is as follows");
            System.out.println("Day: " + i);

            PriorityQueue<Integer> tempQueue = new PriorityQueue<>(availableFloors);

            while (!tempQueue.isEmpty()) {
                System.out.print(tempQueue.poll() + " ");
            }
            System.out.println("\n");
        }
    }
}