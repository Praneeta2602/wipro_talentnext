package oops_Inheritance;
import java.util.*;

// Video class
class Video {
    String videoName;
    boolean checkout;
    int rating;

    public Video(String name) {
        this.videoName = name;
        this.checkout = false;
        this.rating = 0;
    }

    public String getName() {
        return videoName;
    }

    public boolean getCheckout() {
        return checkout;
    }

    public int getRating() {
        return rating;
    }

    public void doCheckout() {
        checkout = true;
    }

    public void doReturn() {
        checkout = false;
    }

    public void receiveRating(int rating) {
        this.rating = rating;
    }
}

// VideoStore class
class VideoStore {
    ArrayList<Video> store;

    public VideoStore() {
        store = new ArrayList<>();
    }

    public void addVideo(String name) {
        store.add(new Video(name));
        System.out.println("Video \"" + name + "\" added successfully.");
    }

    public void doCheckout(String name) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.doCheckout();
                System.out.println("Video \"" + name + "\" checked out successfully.");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void doReturn(String name) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.doReturn();
                System.out.println("Video \"" + name + "\" returned successfully.");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void receiveRating(String name, int rating) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.receiveRating(rating);
                System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void listInventory() {
        System.out.println("\n-----------------------------------------------");
        System.out.println("Video Name\t|\tCheckout\t|\tRating");
        for (Video v : store) {
            System.out.println(v.getName() + "\t|\t" + v.getCheckout() + "\t|\t" + v.getRating());
        }
        System.out.println("-----------------------------------------------");
    }
}

// Main class must match the file name: MiniProject_2.java
public class MiniProject_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore store = new VideoStore();
        int choice;

        do {
            System.out.println("\n=== Video Store Menu ===");
            System.out.println("1. Add Video");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter video name to add: ");
                    String nameToAdd = sc.nextLine();
                    store.addVideo(nameToAdd);
                    break;

                case 2:
                    System.out.print("Enter video name to check out: ");
                    String nameToCheckout = sc.nextLine();
                    store.doCheckout(nameToCheckout);
                    break;

                case 3:
                    System.out.print("Enter video name to return: ");
                    String nameToReturn = sc.nextLine();
                    store.doReturn(nameToReturn);
                    break;

                case 4:
                    System.out.print("Enter video name to rate: ");
                    String nameToRate = sc.nextLine();
                    System.out.print("Enter rating (0-10): ");
                    int rating = sc.nextInt();
                    sc.nextLine(); // consume newline
                    store.receiveRating(nameToRate, rating);
                    break;

                case 5:
                    store.listInventory();
                    break;

                case 6:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
