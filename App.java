import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        boolean game = true;
        VirtualPet max = new VirtualPet("Max");
        VirtualPet spotty = new VirtualPet("Spotty");
        VirtualPet julia = new VirtualPet("Julia");
        VirtualPet lily = new VirtualPet("Lily");
        VirtualPet chloe = new VirtualPet("Chloe");
        HashMap<String, VirtualPet> shelter = new HashMap<String, VirtualPet>();
        VirtualPetShelter petShelter = new VirtualPetShelter();
        petShelter.shelter = shelter;
        petShelter.admitpet(max);
        petShelter.admitpet(chloe);
        petShelter.admitpet(spotty);
        petShelter.admitpet(julia);
        petShelter.admitpet(lily);
        System.out.println("There are " + shelter.size() + " pet in the shelter.");
        while (game) {
            for (VirtualPet pet : shelter.values()) {
                System.out.println(pet.toString());
            }
            System.out.println("Press 1 to adopted a pet from the shelter");
            System.out.println("Press 2 to admit a pet to the shelter");
            System.out.println("Press 3 to feed a single pet");
            System.out.println("Press 4 to give water to a single pet");
            System.out.println("Press 5 to give water to all pets");
            System.out.println("Press 6 to play with a single pet");
            System.out.println("Press 7 to play with all pet");
            System.out.println("Press 8 to feed all the pets");
            System.out.println("Press 0 to end the game.");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter the name of pet you want to adopt");
                    String petNameToAdopt = input.nextLine();
                    petShelter.adoptedpet(petNameToAdopt);
                    petShelter.ticallpets();
                    System.out.println("You just adopted " + petNameToAdopt);
                    break;
                case 2:
                    System.out.println("Enter the name of the pet you want to admit");
                    String petNameToAdmit = input.nextLine();
                    VirtualPet petToAdmit = new VirtualPet(petNameToAdmit);
                    petShelter.admitpet(petToAdmit);
                    petShelter.ticallpets();
                    System.out.println("You just admit " + petNameToAdmit);
                    break;
                case 3:
                    System.out.print("Enter the name of pet you want to feed -> ");
                    String petName = input.nextLine();
                    VirtualPet petToFeed = petShelter.findPetByName(petName);
                    petToFeed.feed();
                    System.out.println("You fed " + petName);
                    petShelter.ticallpets();
                    break;
                case 4:
                    System.out.print("Enter the name of pet you want to water -> ");
                    String petNameToWater = input.nextLine();
                    VirtualPet petToWater = petShelter.findPetByName(petNameToWater);
                    petToWater.water();
                    System.out.println("You just gave water to " + petNameToWater);
                    petShelter.ticallpets();
                    break;
                case 5:
                    petShelter.waterallpets();
                    petShelter.ticallpets();
                    System.out.println("You have just gave water to all the pets");
                    break;
                case 6:
                    String petNameToPlay = input.nextLine();
                    VirtualPet petToPlay = petShelter.findPetByName(petNameToPlay);
                    petToPlay.play();
                    System.out.println("You have just played with " + petNameToPlay);
                    petShelter.ticallpets();
                    break;
                case 7:
                    petShelter.playallpets();
                    petShelter.ticallpets();
                    System.out.println("You have played with all the pets");
                    break;
                case 8:
                    petShelter.feedallpets();
                    petShelter.ticallpets();
                    System.out.println("You have just feed all the pets");
                    break;
                case 0:
                    game = false;
                    System.out.println("Thank you for playing.");
                    break;
                default:
                    System.out.println("You have enter invaild number, please try again.");
                    break;
            }
        }

        input.close();
    }

}