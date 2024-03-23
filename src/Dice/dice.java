package Dice;

import java.util.Random;
public class dice {
        private Random random;

        public void Dice() {
            this.random = new Random();
        }

    public dice(Random random) {
        this.random = random;
    }

    public int roll() {
            return random.nextInt(6) + 1;
        }

    public static class Dice {
        public int roll() {
            return 0;
        }
    }
}

