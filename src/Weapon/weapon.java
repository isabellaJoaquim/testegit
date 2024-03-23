package Weapon;

public class weapon {
    String name;
    private int attackPower;
    private int durability;

    public weapon(String name, int attackPower, int durability) {
        this.name = name;
        this.attackPower = attackPower;
        this.durability = durability;
    }

    public void attack() {
        if (durability > 0) {
            System.out.println("Ataque com " + name + "! Poder de ataque: " + attackPower);
            durability--;
            System.out.println("Durabilidade restante de " + name + ": " + durability);
        } else {
            System.out.println(name + " está quebrada e não pode ser usada.");
        }
    }

    public void repair(int amount) {
        durability += amount;
        System.out.println(name + " foi reparada. Nova durabilidade: " + durability);
    }

    public int getDurability() {
        return durability;
    }
}