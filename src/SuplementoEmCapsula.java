// A palavra "extends" é o que faz a mágica da Herança acontecer.
public class SuplementoEmCapsula extends Suplemento {
    // Este atributo só existe para quem é em cápsula. O Whey em pó não tem isso.
    private int quantidadeDeCapsulas;

    public SuplementoEmCapsula(String nome, String marca, int quantidadeDeCapsulas) {
        super(nome, marca, 0, 0);

        this.quantidadeDeCapsulas = quantidadeDeCapsulas;
    }

    @Override
    public void consumir() {
        if (quantidadeDeCapsulas > 0) {
            quantidadeDeCapsulas--; // reduz o numero de capsulas

            System.out.println("Cápsula de " + getNome() + " Consumida!");
            System.out.println("Restam " + quantidadeDeCapsulas + " capsulas no pote. \n ");
        } else {
            System.out.println("Não possui mais capsulas para serem consumidas!");
        }
    }
}
