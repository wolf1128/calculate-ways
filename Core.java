import java.util.*;

public class Core {

    // Calculate count of ways to reach out
    // the n-th stair using 1 or 2 or 5 steps.
    public static int calWays(int n)
    {
        if (n == 0)
            return 1;
        else if (n < 0 || n > 30)
            return 0;
        else 
            return calWays(n - 1) + calWays(n - 2) + calWays(n -5);
    }

    // Driver function
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Read user input integer       

        System.out.println(calWays(n));
    }
}