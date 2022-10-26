public class Aritmetica implements ICalcMedia{

    @Override
    public double CaculaMedia(double a, double b) {
        return (a+b)/2;
    }

    @Override
    public String Situacao(double media)
    {
        String situacao;
        if(media>5)
        {
            situacao = "Aprovado";
        }
        else
        {
            situacao = "Reprovado";
        }
        return situacao;
    }
}
