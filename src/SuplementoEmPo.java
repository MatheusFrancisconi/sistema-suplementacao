public class SuplementoEmPo extends Suplemento {
    private int quantidadeEmGramas;
    private int tamanhoDaDose;

    public SuplementoEmPo(String nome, String marca, int quantidade, int dose) {
        super(nome, marca);
        this.quantidadeEmGramas = quantidade;
        this.tamanhoDaDose = dose;
    }

    @Override
    public void consumir() {
        if (quantidadeEmGramas >= tamanhoDaDose) {
            quantidadeEmGramas -= tamanhoDaDose;
            System.out.println("Dose de " + getNome() + " consumida!");
            System.out.println("Restam apenas " + quantidadeEmGramas + " gramas");
        } else {
            System.out.println("O pó do " + getNome() + " acabou!");
        }
    }
}
