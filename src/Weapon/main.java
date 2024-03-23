package Weapon;

public class main {
    public static void main(String[] args) {
        weapon sword = new weapon("Espada", 20, 10);

        System.out.println("Durabilidade inicial da " + sword.name + ": " + sword.getDurability());

        sword.attack();
        sword.attack();
        sword.attack();
    }
}
