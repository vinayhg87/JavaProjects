package UserInput;

import java.util.Scanner;

public class receiveInput {

    public static void main(String args[])
    {
        Scanner scr = new Scanner(System.in);
        String input;
        System.out.println("Enter the value here!");
        input = scr.nextLine();
        System.out.println("You have entered "+ input+ ". Please verify!");




    }
}
