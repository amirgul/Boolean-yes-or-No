import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter your response");
        String response = keyboard.nextLine();
        boolean accept = true;
        if(response.equalsIgnoreCase("yes") ||(response.equalsIgnoreCase("y")))
        {
            accept = true;

        }
        else
            accept = false;

        System.out.println("accepting rate is: " + accept);


    }
}
