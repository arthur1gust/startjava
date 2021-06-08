import java.util.Scanner;

public class GuessNumber {
    private int numberComputer;
    private int numberPlayer;
    private Player playerFirst;
    private Player playerSecond;
    
    Scanner scan = new Scanner(System.in);
    
    public GuessNumber(Player playerFirst, Player playerSecond) {
        this.playerFirst = playerFirst;
        this.playerSecond = playerSecond;
    }

    private boolean checkNumber(Player player) {
        System.out.print("Enter number player - " + player.getName() + ": ");
        numberPlayer = scan.nextInt();
        if (numberPlayer == numberComputer) {
            System.out.print("Player - " + player.getName() + " - WIN!!! ");
            return true;
        } else if (numberPlayer > numberComputer) {
            System.out.println("Your number is big");
        } else {
            System.out.println("Your number is less");
        }
        return false;
    }
    
    public void start() {
        numberComputer = (int) (Math.random() * 100);
        while (true) {
            if (checkNumber(playerFirst)) {
                break;
            }
            if (checkNumber(playerSecond)) {
                break;
            }
        }
    }
}