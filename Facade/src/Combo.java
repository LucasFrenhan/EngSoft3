
public class Combo {
    private Produto produto;

    private Burguer burguer;

    private Sobremesa sobremesa;

    private Bebida bebida;


    public void EscolheCombo(int escolha)
    {

        if(escolha == 1)
        {
            sobremesa = new Sobremesa("Grande","Sorvete",9);
            burguer = new Burguer(350,"Big mac",25);
            bebida = new Bebida(700,"Coca-cola",14.5);
        }

        if(escolha == 2)
        {
            sobremesa = new Sobremesa("Médio","Sorvete",7);
            burguer = new Burguer(200,"Big mac",20);
            bebida = new Bebida(500,"Coca-cola",12.5);
        }

        if(escolha == 3)
        {
            sobremesa = new Sobremesa("Pequeno","Sorvete",5);
            burguer = new Burguer(100,"Big mac",15);
            bebida = new Bebida(300,"Coca-cola",9.5);
        }
    }
    public void MostrarCombos()
    {
        sobremesa.ExibirEscolha();
        burguer.ExibirEscolha();
        bebida.ExibirEscolha();
        System.out.println("Total R$:"+(sobremesa.getPreco()+burguer.getPreco()+bebida.getPreco()));
    }
}
