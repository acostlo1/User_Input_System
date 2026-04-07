/*This program works on taking user input while validating the information it receives.
If user enters the incorrect information, they get a total of 3 tries before being kicked
out of the program.
 */


import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String correctUsername = "enzo";
        String inputUsername;
        String correctPassword = "1234";
        String inputPassword;
        int usernameAttempts = 0;
        int passwordAttempts = 0;

        //Requesting for user to input their username
        System.out.print("Enter username: ");
        inputUsername = scanner.nextLine();

        //If the user enters the incorrect username & exceeds 2 attempts, user is then kicked out and forced to try again
        while (!inputUsername.equalsIgnoreCase(correctUsername) && usernameAttempts < 2) {
            System.out.println("Incorrect credentials");
            usernameAttempts++;
            System.out.print("Enter username: ");
            inputUsername = scanner.nextLine();
        }
        if (!inputUsername.equalsIgnoreCase(correctUsername)) {
            System.out.println("Your account has been locked due to excessive login attempts. Please try again later.");
            return;
        }

        //Requesting for user to input their password
        System.out.print("Enter password: ");
        inputPassword = scanner.nextLine();

        //If the user enters the incorrect password & exceeds 2 attempts, user is then kicked out and forced to try again
        while (!inputPassword.equals(correctPassword) && passwordAttempts < 2) {
            System.out.println("Incorrect credentials");
            passwordAttempts++;
            System.out.print("Enter password: ");
            inputPassword = scanner.nextLine();
        }

        if (!inputPassword.equals(correctPassword)) {
            System.out.println("Your account has been locked due to excessive login attempts. Please try again later.");
            return;
        }

        //Successful print out messasge once all criteria is validated.
        System.out.println("Login Successful! Welcome, " + inputUsername);


        scanner.close();
    }
}