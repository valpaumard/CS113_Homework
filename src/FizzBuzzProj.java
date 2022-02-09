import java.util.Scanner;

public class FizzBuzzProj {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int fizz = 0, buzz = 0;

        do {
            System.out.println("Enter Fizz Number (integer 1-100): ");
            fizz = keyboard.nextInt();

            if (fizz < 1 || fizz > 100) {
                System.out.println("Invalid! (Out of Range)");
            }
        } while (fizz < 1 || fizz > 100);

        do {
            System.out.println("Enter Buzz Number (integer 1-100): ");
            buzz = keyboard.nextInt();

            if (buzz < 1 || buzz > 100) {
                System.out.println("Invalid! (Out of Range)");
            }

            if (buzz == fizz) {
                System.out.println("Invalid! Buzz Number cannot match Fizz Number)");
            }
        } while (buzz < 1 || buzz > 100 || buzz == fizz);


        for (int i = 1; i <= 100; i++)
        {
            if (i % (fizz * buzz) == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if (i % fizz == 0)
            {
                System.out.println("Fizz");
            }
            else if (i % buzz == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }


    }
}
