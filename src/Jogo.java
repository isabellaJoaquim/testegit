public class Jogo {

        public static void main(String[] args) {
            Heroi heroi1 = new Heroi();
            heroi1.nome = "Arthur";
            heroi1.forca = 10;

            Heroi heroi2 = new Heroi();
            heroi2.nome = "Merlin";
            heroi2.forca = 8;

            heroi1.atacar(heroi2);

            Mago mago1 = new Mago();
            mago1.nome = "Pedro";
            mago1.forca = 19;

            heroi1.atacar(mago1);
            mago1.atacar(heroi2);
            mago1.lancarMagia(heroi1);

            Arqueiro arqueiro1 = new Arqueiro();
            arqueiro1.nome = "joão";
            arqueiro1.forca = 30;

            arqueiro1.lancaFlecha(heroi2);
        }
    }
