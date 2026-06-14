import java.util.Scanner;

public class rating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie rating (1-5): ");
        int rating = sc.nextInt();

        if (rating == 5) {
            System.out.println("Excellent Movie!");
        } else if (rating == 4) {
            System.out.println("Very Good Movie!");
        } else if (rating == 3) {
            System.out.println("Good Movie!");
        } else if (rating == 2) {
            System.out.println("Average Movie!");
        } else if (rating == 1) {
            System.out.println("Poor Movie!");
        } else {
            System.out.println("Invalid Rating! Please enter a rating between 1 and 5.");
        }

        sc.close();
    }

    
}
