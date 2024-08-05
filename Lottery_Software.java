import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lottery_Software {

    public static final int NUMBER = 6, MAX_NUMBER = 40, PRIZE = 100;

    public static Set<Integer> getTickets() {
        Set<Integer> tickets = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 6 lottery numbers (only numbers less than 40 will be added):");
        while (tickets.size() < NUMBER) {
            int num = sc.nextInt();
            if (num <= MAX_NUMBER) {
                tickets.add(num);
            } else {
                System.out.println("Number greater than or equal to 40 entered, not added to the set.");
            }
        }
        return tickets;
    }

    public static Set<Integer> generateTickets(){
        Set<Integer> winning = new TreeSet<>();
        Random ran = new Random();
        while(winning.size() < NUMBER){
            winning.add(ran.nextInt(MAX_NUMBER)+1);
        }
        return winning;
    }

    public static void main(String[] args) {
        Set<Integer> tickets = getTickets();
        Set<Integer> winning = generateTickets();

        Set<Integer> matches = new TreeSet<>(tickets);
        matches.retainAll(winning);

        if (!matches.isEmpty()){
            System.out.println("Your Tickets "+tickets);
            System.out.println("Winning Tickets "+winning);
            System.out.println("Winning Numbers "+matches);
            System.out.println("Your Prize : "+ PRIZE * Math.pow(2,matches.size()));
        }
    }
}