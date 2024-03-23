package Enemy;

public class player {
    private int health;

    public player() {
        this.health = 100; // Saúde inicial do jogador
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("O jogador foi derrotado.");
        } else {
            System.out.println("O jogador recebeu " + damage + " de dano. Saúde restante: " + health);
        }
    }

    public boolean isAlive() {
        return health > 0;
    }
}
