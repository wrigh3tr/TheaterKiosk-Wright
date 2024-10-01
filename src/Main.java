import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int Age = 0;
        Scanner Console = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        Age = Console.nextInt();
        if (Age >= 21 )
            System.out.println("You are old enough to obtain a wristband ");
        else if (Age <= 21)
            System.out.println("You are not old enough to obtain a wristband ");
        else
        System.out.println("Enter a Valid Input ");

    }
}