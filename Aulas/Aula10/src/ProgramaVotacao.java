import java.util.Scanner;

public class ProgramaVotacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira seu ano de nascimento: ");
        int anoNascimento = teclado.nextInt();

        int idade = 2024 - anoNascimento;
        System.out.printf("Você tem %d anos \n", idade);

        if (idade < 16) {
            System.out.println("NÃO VOTA.");
        } else {
            if ((idade >= 16 && idade < 18) || (idade > 70)) {
                System.out.println("VOTO OPCIONAL.");
            } else {
                System.out.println("VOTO OBRIGATÓRIO.");
            }
        }
    }
}
