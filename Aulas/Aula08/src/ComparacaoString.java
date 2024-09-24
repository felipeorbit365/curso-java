public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "Felipe";
        String nome2 = "Felipe";
        String nome3 = new String("Felipe");
        String resultado;
        resultado = (nome1.equals(nome3))?"O conteúdo é igual":"O conteúdo é diferente";
        System.out.println(resultado);
    }
}
