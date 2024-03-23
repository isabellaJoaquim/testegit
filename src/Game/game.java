package Game;

public class game {
    private boolean isStarted;
    private boolean isPaused;

    public game() {
        this.isStarted = false;
        this.isPaused = false;
    }

    public void start() {
        if (!isStarted) {
            isStarted = true;
            isPaused = false;
            System.out.println("O jogo foi iniciado.");
        } else {
            System.out.println("O jogo já está em andamento.");
        }
    }

    public void pause() {
        if (isStarted) {
            if (!isPaused) {
                isPaused = true;
                System.out.println("O jogo foi pausado.");
            } else {
                System.out.println("O jogo já está pausado.");
            }
        } else {
            System.out.println("O jogo ainda não foi iniciado.");
        }
    }

    public void resume() {
        if (isStarted) {
            if (isPaused) {
                isPaused = false;
                System.out.println("O jogo foi retomado.");
            } else {
                System.out.println("O jogo não está pausado.");
            }
        } else {
            System.out.println("O jogo ainda não foi iniciado.");
        }
    }

    public void end() {
        if (isStarted) {
            isStarted = false;
            isPaused = false;
            System.out.println("O jogo foi encerrado.");
        } else {
            System.out.println("O jogo ainda não foi iniciado.");
        }
    }

    public boolean isStarted() {
        return isStarted;
    }

    public boolean isPaused() {
        return isPaused;
    }
}
