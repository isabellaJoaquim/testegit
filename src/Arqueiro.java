public class Arqueiro {

    String nome;
    int forca;

    public void lancaFlecha (Heroi alvo){
        alvo.vida -= 20;
        System.out.println(this.nome + " Lança flecha " + alvo.nome +
                " causando 25 de dano.");
    }
}

