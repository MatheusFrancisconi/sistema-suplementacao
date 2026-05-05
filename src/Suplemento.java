public abstract class Suplemento {
    // ATRIBUTOS (As características do pote de suplemento)
    // ATRIBUTOS PRIVADOS (Ninguém de fora consegue mexer diretamente)
    private String nome;
    private String marca;

    // O CONSTRUTOR (A Fábrica)
    // Ele pede as informações nos parênteses para poder criar o objeto
    public Suplemento(String nomeDoProduto, String marcaDaFabricante) {
        this.nome = nomeDoProduto;
        this.marca = marcaDaFabricante;
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

    // Método abstrato!
    public abstract void consumir();
}
