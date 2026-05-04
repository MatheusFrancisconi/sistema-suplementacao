public class Suplemento {
    // ATRIBUTOS (As características do pote de suplemento)
    // ATRIBUTOS PRIVADOS (Ninguém de fora consegue mexer diretamente)
    private String nome;
    private String marca;
    private int quantidadeEmGramas;
    private int tamanhoDaDose;

    // O CONSTRUTOR (A Fábrica)
    // Ele pede as informações nos parênteses para poder criar o objeto
    public Suplemento(String nomeDoProduto, String marcaDaFabricante, int quantidadeInicial, int dose) {
        this.nome = nomeDoProduto;
        this.marca = marcaDaFabricante;
        this.quantidadeEmGramas = quantidadeInicial;
        this.tamanhoDaDose = dose;

        System.out.println("Sucesso: Um novo pote de " + this.nome + " foi fabricado no sistema!\n");
    }

    // --- GETTERS (Os Porta-Vozes) ---
    // metodo para devolver nome
    public String getNome() {
        return this.nome;
    }

    // metodo para devolver a marca
    public String getMarca() {
        return this.marca;
    }

    // MÉTODO (A ação que o suplemento pode sofrer)
    public void consumirDose() {
        if (quantidadeEmGramas >= tamanhoDaDose) {
            quantidadeEmGramas = quantidadeEmGramas - tamanhoDaDose;

            System.out.println("Voce consumiu uma dose de " + nome + "!");
            System.out.println("Ainda restam " + quantidadeEmGramas + " gramas no pote.");
        } else {
            System.out.println("O" + nome + " acabou ou não tem o suficiente para uma dose");
        }

    }

}
