package programafuncao02;

public class Operacoes {
    /*
     contador
     - Metodo que retorna uma string de valores contados

     O metodo precisa ser public static
     - public: para que possa ser acessado em todos as partes do codigo
     - static: para que possa ser chamado no main, ja que um metodo estatico pode fazer chamada sem instanciar nenhum
      objeto (não precisa transformar o metodo em objeto para que ele possa ser utilizado
    */

    public static String contador(int i, int f) {
        String s = "";
        for (int c = 1; c <= f; c++) {
            s += c + " ";
        }
        return s;
    }
}