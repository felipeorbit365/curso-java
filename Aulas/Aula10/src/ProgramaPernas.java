import java.util.Scanner;

public class ProgramaPernas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de pernas: ");
        int quantidadePernas = teclado.nextInt();
        String tipoSer;

        System.out.printf("Um ser de %d pernas é do tipo: ", quantidadePernas);

        switch (quantidadePernas) {
            case 1:
                tipoSer = "Saci";
                break;
            case 2:
                tipoSer = "Bípede";
                break;
            case 3:
                tipoSer = "Tripé";
                break;
            case 4:
                tipoSer = "Quadrúpede";
                break;
            case 6, 8:
                tipoSer = "Aranha";
                break;
            default:
                tipoSer = "ET";
        }
        System.out.println(tipoSer);
    }
}
