//Isabelle Guevara
//CS1400
//Assignment 3
//25 September 2023
import java.util.Scanner;
public class TaskA{
    public static void main(String[] args){
        System.out.println("Welcome to the Costs of CPP Program");
        Scanner option_input = new Scanner(System.in);
        System.out.println("Please enter your room and board option (1 = commuter, 2 = on-campus housing and 3 = off-campus housing):");
        int room_board_option = option_input.nextInt();
        double total_cost = 0, monthly_cost = 0;
        if(room_board_option == 1){
            total_cost = 20582;}
        if (room_board_option == 2){
            total_cost = 28108;}
        if (room_board_option == 3){
            total_cost = 26584;}
        monthly_cost = total_cost / 12;
        System.out.printf("Your total estimated cost is $%,.2f", total_cost);
        System.out.printf(" and your monthly cost is about $%,.2f\n", monthly_cost);
    }
    //CPP cost calculator
}


