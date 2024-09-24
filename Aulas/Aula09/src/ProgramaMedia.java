import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira a primeira nota: ");
        float primeiraNota = teclado.nextFloat();

        System.out.print("Insira a segunda nota: ");
        float segundaNota = teclado.nextFloat();

        float media = (primeiraNota + segundaNota) / 2;

        System.out.printf("Com as notas %.2f e %.2f, sua média é %.2f \n", primeiraNota, segundaNota, media);

        if (media > 9) {
            System.out.println("Parabéns!");
        }
    }
}
