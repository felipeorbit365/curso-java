public class ProgramaVetor01 {
    public static void main(String[] args) {
        int[] n = {3, 2, 8, 7, 5, 4};

        for (int cc = 0; cc <= n.length-1; cc++) {
            System.out.println("Na posição " + cc + " temos o valor " + n[cc]);
        }
    }
}