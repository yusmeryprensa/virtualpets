package virtual_pet;

public class VirtualPet {
    private String name;
    private int thirst;
    private int health;
    private int hunger;

    public VirtualPet(String name) {
        this.name = name;
        this.thirst = 20;
        this.health = 30;
        this.hunger = 15;
    }

    public String getName() {
        return name;
    }

    public int getThirst() {
        return thirst;
    }

    public int getHealth() {
        return health;
    }

    public int getHunger() {
        return hunger;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void feed() {
        hunger -= 2;
        thirst -= 1;
    }

    public void water() {
        thirst -= 2;
    }

    public void tic() {
        hunger += 10;
        thirst += 10;
        health -= 5;
    }

    public void play() {
        health += 5;
    }

}
