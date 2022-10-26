public class Geometrica implements ICalcMedia{
    @Override
    public double CaculaMedia(double a, double b) {
        return Math.sqrt(a*b);
    }

    @Override
    public String Situacao(double media) {
        String situacao;
        if(media>=7)
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
