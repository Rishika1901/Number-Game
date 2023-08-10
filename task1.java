import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        task1 t = new task1();
        t.game();
    }

    public void game() {
        Scanner sc = new Scanner(System.in);
        Random randomno = new Random();
        int min = 1;
        int max = 100;
        int rounds = 3;
        boolean again = true;

        System.out.println("\n**Welcome to Guessing game**\n");
        System.out.println("You heve to guess a num between 1 to 100");
        System.out.println("you have only 3 attemps\n");
        while (again) {
            int num = randomno.nextInt(max - min + 1) + min;
            int attemps = 0;
            boolean guessingnum = false;
            while (attemps < rounds && !guessingnum) {
                System.out.print("Enter your guessing num :- ");
                int gussnum = sc.nextInt();
                if (num == gussnum) {
                    System.out.println("**Winner**");
                    again = false;
                    break;
                } else if (gussnum > num / 2) {
                    if (attemps == 3) {
                        System.out.println("your guessing no. is too high \n");
                        attemps++;
                    } else {
                        System.out.println("your guessing no. is too high \n");
                        attemps++;
                    }
                } else if (gussnum < num / 2) {
                    if (attemps == 3) {
                        System.out.println("your guessing no. is too small \n");
                        attemps++;
                    } else {
                        System.out.println("your guessing no. is too small \n");
                        attemps++;
                    }
                }
            }
            if (attemps == rounds) {
                System.out.println("Sorry....\nGame Over");
                break;
            }
        }
    }
}