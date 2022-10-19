public class Burguer extends Produto{
    private int gramas;

    public int getGramas() {
        return gramas;
    }

    public  Burguer(int gramas, String descricao, double preco) {
        super(descricao, preco);
        this.gramas = gramas;
    }

    @Override
    public void ExibirEscolha()
    {
        System.out.println("O burguer escolhido foi "+ getDescricao() +", de: "+ gramas +"g, de preço: R$"+ getPreco());
    }
}
