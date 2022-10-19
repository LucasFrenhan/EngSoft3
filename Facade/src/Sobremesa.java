public class Sobremesa extends Produto{
    private String tamanho;

    public String getTamanho() {
        return tamanho;
    }

    public Sobremesa(String tamanho, String descricao, double preco) {
        super(descricao, preco);
        this.tamanho = tamanho;
    }


    @Override
    public void ExibirEscolha()
    {
        System.out.println("A sobremesa escolhida foi "+ getDescricao() +", de tamanho: "+ tamanho +", de preço: R$"+ getPreco());
    }
}
