package Enemy;

public class enemy {
    private int health;
    private int strength;
    private int speed;

    public enemy(int health, int strength, int speed) {
        this.health = health;
        this.strength = strength;
        this.speed = speed;
    }

    public void attackPlayer(player player) {
        int damage = strength;
        player.takeDamage(damage);
        System.out.println("O inimigo atacou o jogador e causou " + damage + " de dano.");
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("O inimigo foi derrotado.");
        } else {
            System.out.println("O inimigo recebeu " + damage + " de dano. Saúde restante: " + health);
        }
    }

    public boolean isAlive() {
        return health > 0;
    }
}