public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int nota1 = 8;
        int nota2 = 9;
        float media = (float) (nota1 + nota2)/2;
        System.out.println("A média é igual a " + media);

        System.out.println("---");

        int numero = 10;
        int valor = 4 + numero--;
        System.out.println(valor);
        System.out.println(numero);

        System.out.println("---");

        int x = 4;
        x *= 2;
        System.out.println(x);

        System.out.println("---");

        float valorParaArredondar = 8.4f;
        int arredontamento = Math.round(valorParaArredondar);
        System.out.println(arredontamento);

        System.out.println("---");

        double geradorAleatorio = Math.random();
        int numeroAleatorio = (int) (15 + geradorAleatorio * (50 - 15));
        System.out.println(numeroAleatorio);
    }
}
