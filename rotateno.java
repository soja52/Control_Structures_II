import java.util.Scanner;

public class rotateno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter rotation value: ");
        int k = sc.nextInt();

        // Count digits
        int temp = num;
        int digits = 0;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        // Handle rotations greater than number of digits
        k = k % digits;
        if (k < 0) {
            k = k + digits;
        }

        // Calculate divisors
        int div = 1;
        int mul = 1;

        for (int i = 1; i <= digits; i++) {
            if (i <= k)
                div *= 10;
            else
                mul *= 10;
        }

        // Rotate the number
        int rem = num % div;
        int quo = num / div;

        int rotated = rem * mul + quo;

        System.out.println("Rotated Number: " + rotated);

        sc.close();
    }

    
}
