import java.util.Scanner;

public class ProgramaVetor02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] mes = {"Janeiro", "Fevereiro", "Março",
                "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro"};

        int[] numeroDias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Digite o ano: ");
        int ano = teclado.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) { // Verifica se o ano é bissexto ou não
            numeroDias[1] = 29;
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        for (int cc = 0; cc < mes.length; cc++) {
            System.out.println("O mês de " + mes[cc] + " tem " + numeroDias[cc] + " dias.");
        }
    }
}

/*
Perguntando ao usuário se é ano bissexto:

        Scanner teclado = new Scanner(System.in);

        System.out.print("O ano é bissexto? [S/N]: ");
        String resposta = teclado.next();

        if (resposta.equals("S")) {
            numeroDias[1] = 29;
        }

 */
