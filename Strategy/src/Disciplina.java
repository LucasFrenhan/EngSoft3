public class Disciplina {

    private ICalcMedia CalcMedia;
    public double Media;
    private String Nome;
    private double P1;
    private double P2;
    public String Situcao;

    public ICalcMedia getCalcMedia() {
        return CalcMedia;
    }

    public void setCalcMedia(ICalcMedia calcMedia) {
        CalcMedia = calcMedia;
    }

    public double getMedia() {
        return Media;
    }

    public void setMedia(double media) {
        this.Media = media;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double p1) {
        this.P1 = p1;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double p2) {
        this.P2 = p2;
    }

    public String getSitucao() {
        return Situcao;
    }

    public void setSitucao(String situcao) {
        this.Situcao = situcao;
    }

    Disciplina(ICalcMedia calcula)
    {
        this.CalcMedia = calcula;
    }
    public void CalcularMedia()
    {
        Media = CalcMedia.CaculaMedia(P1, P2);
        Situcao = CalcMedia.Situacao(Media);
    }
}
