public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando o Sistema de Controle de Suplementação");

        // Criando o objeto passando tudo para o Construtor de uma vez!
        Suplemento meuWhey = new Suplemento("Whey 80", "Black Skull", 900, 30);

        // O objeto já nasceu pronto e protegido. Agora é só usar!
        System.out.println("nome do produto: " + meuWhey.getNome());
        System.out.println("nome da marca: " + meuWhey.getMarca());

        meuWhey.consumirDose();
        meuWhey.consumirDose();
    }
}
