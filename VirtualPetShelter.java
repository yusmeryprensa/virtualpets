import java.util.HashMap;

public class VirtualPetShelter {
    HashMap<String, VirtualPet> shelter = new HashMap<>();

    public void feedallpets() {
        for (VirtualPet pet : shelter.values()) {
            pet.feed();
        }
    }

    public void waterallpets() {
        for (VirtualPet pet : shelter.values()) {
            pet.water();
        }
    }

    public void ticallpets() {
        for (VirtualPet pet : shelter.values()) {
            pet.tic();
        }
    }

    public void playallpets() {
        for (VirtualPet pet : shelter.values()) {
            pet.play();
        }
    }

    public void adoptedpet(String petName) {
        shelter.remove(petName);
    }

    public void admitpet(VirtualPet pet) {
        shelter.put(pet.getName(), pet);
    }

    public VirtualPet findPetByName(String name) {
        return shelter.get(name);
    }
}