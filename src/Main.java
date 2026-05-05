import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- SISTEMA DE ESTOQUE DE SUPLEMENTOS ---\n");

        // Criando a nossa "Prateleira" (Lista)
        // O <Suplemento> diz que essa lista SÓ aceita objetos que sejam suplementos.
        List<Suplemento> nossoEstoque = new ArrayList<>();

        // Criando os nossos objetos concretos
        SuplementoEmPo meuWhey = new SuplementoEmPo("Whey 80%", "Black Skull", 900, 30);
        SuplementoEmCapsula minhaCreatina = new SuplementoEmCapsula("Creatina Creapure", "Growth Suplementos", 120);

        // Adicionando o Create
        nossoEstoque.add(meuWhey);
        nossoEstoque.add(minhaCreatina);

        System.out.println("Produtos cadastrados com sucesso! Total no estoque: " + nossoEstoque.size());

        // Adicionando Read (percorre a lista inteira)
        System.out.println("--- LISTA DE PRODUTOS ---");

        String nomeProcurado = "Whey 80%";
        Suplemento produtoEncontrado = null; // Variável vazia para guardar o produto se acharmos

        // Lê-se: "Para cada Suplemento (vamos chamar de 'item') dentro do
        for (Suplemento item : nossoEstoque) {
            if (item.getNome().equalsIgnoreCase(nomeProcurado)) {
                produtoEncontrado = item;
                break;
            }
        }

        if (produtoEncontrado != null) {
            System.out.println("Produto encontrado! Marca antiga: " + produtoEncontrado.getMarca());

            produtoEncontrado.setMarca("Max Titanium");
            System.out.println("Update realizado! Nova marca: " + produtoEncontrado.getMarca());
        } else {
            System.out.println("Produto não encontrado no estoque");
        }

        System.out.println("--- DELETANDO UM PRODUTO ---");
        if (produtoEncontrado != null) {
            nossoEstoque.remove(produtoEncontrado);
            System.out.println("O produto " + produtoEncontrado.getNome() + " foi removido!");
            System.out.println("Quantidade atua no estoque: " + nossoEstoque.size());
        }
    }
}
