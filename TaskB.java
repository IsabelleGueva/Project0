//Isabelle Guevara
//25 September 2023
//CS1400
//Assignment 3
import java.util.Scanner;
public class TaskB{
    public static void main(String[] args){
        double total_cost = 0, needed_hours = 0;
        System.out.println("Welcome to the Costs of CPP Program");
        Scanner family_support_input = new Scanner(System.in);
        System.out.println("Please enter the amount of annual family support: ");
        double family_support = family_support_input.nextDouble();
        Scanner financial_aid_input = new Scanner(System.in);
        System.out.println("Please enter the amount of financial aid/loan you are eligible for: ");
        double financial_aid = financial_aid_input.nextDouble();
        Scanner room_board_input = new Scanner(System.in);
        System.out.println("Please enter your room and board option (1 = commuter, 2 = on-campus housing and 3 = off-campus housing): ");
        int room_board_option = room_board_input.nextInt();
        if (room_board_option == 1) total_cost = 20582;
        if (room_board_option == 2) total_cost = 28108;
        if (room_board_option == 3) total_cost = 26584;
        Scanner hourly_input = new Scanner(System.in);
        System.out.println("Please enter your hourly rate: ");
        double hourly = hourly_input.nextDouble();
        needed_hours = (total_cost - (family_support + financial_aid))/(30*hourly);
        System.out.printf("You need to work %.2f hours per week based on the information entered.\n", needed_hours);
        if (needed_hours > 20){
            System.out.println("Note: This exceeds the maximum amount of hours allowed.");
        }
    }
}