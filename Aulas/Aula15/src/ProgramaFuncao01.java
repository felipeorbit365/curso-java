public class ProgramaFuncao01 {
    static void soma(int primeiroNumero, int segundoNumero) {
        int soma = primeiroNumero + segundoNumero;
        System.out.println("A soma é " + soma);
    }

    public static void main(String[] args) {
        System.out.println("Começou o programa");
        soma(5, 2);
    }
}
