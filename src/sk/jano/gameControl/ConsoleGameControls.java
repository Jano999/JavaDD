package sk.jano.gameControl;

import java.util.Scanner;

public class ConsoleGameControls implements gameControls{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String putPassword() {
        System.out.println("Put your password: ");
        return scanner.nextLine();
    }

    @Override
    public String chooseHero() {
        System.out.println("Choose hero: A - Warrior, B - Guardian, C - Hunter, D - Rogue, E - Mage");
        return  scanner.nextLine();
    }

    @Override
    public int setMoveCount() {
        System.out.println("How many moves do we play?");
        int moveCount;
        try {
            moveCount = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception ex){
            System.out.println("Couldnt get the number of moves. Are you sure you write right number?");
            moveCount = setMoveCount();

        }

    }

    @Override
    public void printResultOfGame() {
        scanner.close();
    }
}
