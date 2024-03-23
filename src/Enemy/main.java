package Enemy;

public class main {
    public static void main(String[] args) {
        // Exemplo de uso da classe Enemy
        enemy enemy = new enemy(100, 20, 10);
        player player = new player();

        while (enemy.isAlive() && player.isAlive()) {
            enemy.attackPlayer(player);
            if (player.isAlive()) {
            }
        }
    }
}
