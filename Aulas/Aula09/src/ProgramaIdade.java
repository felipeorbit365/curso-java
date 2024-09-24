import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira seu ano de nascimento: ");
        int anoDeNascimento = teclado.nextInt();

        int idade = 2024 - anoDeNascimento;

        if (idade >= 18) {
            System.out.printf("Você tem %d anos, portanto, é maior de idade.", idade);
        } else {
            System.out.printf("Você tem apenas %d anos, portanto, é menor de idade.", idade);
        }
    }
}
