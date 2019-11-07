/**************************************************************************************************************
 * @file ConversationalAI.java
 * @brief This program implements basic knowledge about Scanner, SOUT.
 * @author Tao Long
 * @data January 1.22
 **************************************************************************************************************/


import java.util.Scanner;

public class ConversationalAI {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("");
        System.out.println("Hi! I am a professional Profile Organizer~");
        System.out.println("Today, I will help you generate your own profile!");
        System.out.println("");

        String username;
        System.out.print("What's your name? ");
        username = keyboard.next();
        System.out.println("Your name: " + username + " is saved.");
        System.out.println("By the way, " + username + " is a beautiful name!");

        String userage;
        System.out.println("");
        System.out.print("How old are you? (Type numbers) ");
        userage = keyboard.next();
        System.out.println("Your age: " + userage + " is saved.");
        System.out.println("Come on! " + userage + " years old is the best time to fight for your future!");

        String userclassification;
        System.out.println("");
        System.out.print("What year are you in? (Freshman / Sophomore / Junior / Senior) ");
        userclassification = keyboard.next();
        System.out.println("Your year: " + userclassification + " is saved.");
        System.out.println("I still remember my "+userclassification+" life.");

        String userhometown;
        System.out.println("");
        System.out.println("Where are your from?");
        userhometown = keyboard.next();
        System.out.println("Your hometown: " + userhometown + " is saved." );
        System.out.println("I really want to visit this place in the future!");

        String finalprofile;
        System.out.println("");
        System.out.println("Enter 1 to see your whole profile. ");
        finalprofile = keyboard.next();
        System.out.println("");
        System.out.println("Profile:");
        System.out.println("   -Your name: " + username);
        System.out.println("   -Your age: " + userage);
        System.out.println("   -Your year: " + userclassification);
        System.out.println("   -Your hometown: " + userhometown);
    }
}
