import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first number: ");
         n1 = s.nextInt();
         System.out.print("Enter the second number: ");
         n2 = s.nextInt();
          System.out.print("Enter the third number: ");
         n3 = s.nextInt();

          int largestNumber = findLargest(n1, n2, n3);

        System.out.println("The largest number is: " + largestNumber);

        s.close();
    }

    private static int findLargest(int n1, int n2, int n3) {
        if (n1 >= n2 && n1 >= n3) {
            return n1;
        } else if (n2 >= n1 && n2 >= n3) {
            return n2;
        } else {
            return n3;
        }
    }
}