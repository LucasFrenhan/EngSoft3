import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        System.out.println("1 - Grande");
        System.out.println("2 - Médio");
        System.out.println("3 - Pequeno");
        System.out.println("Digite qual combo deseja");

        Scanner input = new Scanner(System.in);
        int escolha = input.nextInt();
        Combo combo = new Combo();
        combo.EscolheCombo(escolha);
        combo.MostrarCombos();
    }
}