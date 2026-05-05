public class Main {
    public static void main(String[] args) {
        System.out.println("--- TESTANDO O SISTEMA DE SUPLEMENTOS ---\n");

        // Criando o suplemento em pó
        Suplemento meuWhey = new Suplemento("Whey 80", "Black Skull", 900, 30);
        System.out.println("Marca do Whey: " + meuWhey.getMarca() + "\n");

        SuplementoEmCapsula minhaCreatina = new SuplementoEmCapsula("Creatina Creapure", "Growth Supplements", 120);

        System.out.println("Marca da Creatina: " + minhaCreatina.getMarca() + "\n");

        meuWhey.consumir();
        minhaCreatina.consumir();
    }
}
