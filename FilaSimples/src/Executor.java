public class Executor {
    public static void main(String[] args) {
        FilaSimples fila = new FilaSimples(5);
        fila.adicionarElemento(3);
        fila.adicionarElemento(3);
        fila.adicionarElemento(3);
        fila.removerOcorrencias(2);
        fila.exibirFila();
        fila.aumentarCapacidade(6);
    }
}