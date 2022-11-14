import java.util.Random;
import java.util.Scanner;

class GuessMyNumber {
    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        int randomInt = rnd.nextInt(10);
        int number;

        System.out.println("Uzmini skaitli no 1 līdz 10!");

        number = scan.nextInt();

        if (number == randomInt) {

            System.out.println("Apsveicu Esi uzminējis manu skaitli!");

        } else if (number > randomInt) {

            System.out.println("Mēģini mazāku skaitli!");

        } else {

            System.out.println("Mēģini lielāku skaitli!");

        }
    }
}