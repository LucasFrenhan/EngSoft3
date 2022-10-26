public class Geometrica implements ICalcMedia{
    @Override
    public double CaculaMedia(int a, int b) {
        Math math = null;
        return math.sqrt(a*b);
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
