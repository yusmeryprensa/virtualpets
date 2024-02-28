package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean game = true;
        VirtualPet max = new VirtualPet("Max");
        System.out.println("Max is your virtual pet.");
        while (game) {
            System.out.println("Max has a hunger of " + max.getHunger());
            System.out.println("Max has a thirst of " + max.getThirst());
            System.out.println("Max has a health of " + max.getHealth());
            System.out.println("Press 2 to feed Max ");
            System.out.println("Press 4 to give water");
            System.out.println("Press 6 to play with Max");
            System.out.println("Press 0 to end the game.");
            int choice = input.nextInt();
            switch (choice) {
                case 2:
                    max.feed();
                    max.tic();
                    System.out.println("You just feed Max");
                    break;
                case 4:
                    max.water();
                    max.tic();
                    System.out.println("You just gave Max water");
                    break;
                case 6:
                    max.play();
                    max.tic();
                    System.out.println("You have just played with Max");
                    break;
                case 0:
                    game = false;
                    System.out.println("Thank you for playing.");
                    break;
                default:
                    System.out.println("You have enter invalid number, please try again.");
                    break;
            }
        }

    }

}
