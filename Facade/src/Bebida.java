public class Bebida extends Produto{
    private int ml;

    public int getMl() {
        return ml;
    }

    public Bebida(int ml, String descricao, double preco) {
        super(descricao,preco);
        this.ml = ml;
    }

    @Override
    public void ExibirEscolha()
    {
        System.out.println("A bebida escolhida foi "+ getDescricao() +", de: "+ ml +"ml, de preço: R$"+ getPreco());
    }
}
