public class ProgramaFuncao01b {
    static int soma(int primeiroNumero, int segundoNumero) {
        int somatorio = primeiroNumero + segundoNumero;
        return somatorio;
    }

    public static void main(String[] args) {
        System.out.println("Começou o programa");
        int resultadoSoma = soma(9, 3);
        System.out.println("A soma vale " + resultadoSoma);
    }
}