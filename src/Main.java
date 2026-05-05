public class Main {
    public static void main(String[] args) {
        System.out.println("--- TESTANDO O SISTEMA DE SUPLEMENTOS ---\n");

        // Criando o suplemento em pó
        SuplementoEmPo meuWhey = new SuplementoEmPo("Whey 80%", "Black Skull", 900, 30);
        System.out.println("Nome do Whey: " + meuWhey.getNome() + " | Marca: " + meuWhey.getMarca());
        meuWhey.consumir();
        System.out.println("--------------------------------------------------");

        SuplementoEmCapsula minhaCreatina = new SuplementoEmCapsula("Creatina Creapure", "Growth Supplements", 120);

        System.out.println("Nome da Creatina: " + minhaCreatina.getNome() + " | Marca: " + minhaCreatina.getMarca());
        minhaCreatina.consumir();

    }
}
