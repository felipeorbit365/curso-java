public class OperadorTernario {
    public static void main(String[] args) {
        int numero1, numero2, resultado;
        numero1 = 14;
        numero2 = 8;
        resultado = (numero1 > numero2)?numero1 + numero2:numero1 - numero2;
        System.out.println(resultado);
    }
}
