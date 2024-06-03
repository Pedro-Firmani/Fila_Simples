public class FilaSimples {
    private int tamanho;
    private Integer fila[];
    private int novoTamanho;

    public FilaSimples(int tamanho) {
        this.tamanho = tamanho;
        this.fila = new Integer[this.tamanho];
        System.out.println("A fila foi criada");
    }

    public void exibirFila() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println(fila[i]);
        }
    }

    public boolean cheio() {
        for (int i = 0; i < tamanho; i++) {
            if (fila[i] == null) {
                return false;
            }
        }
        return true;
    }

    public boolean vazio() {
        for (int i = 0; i < tamanho; i++) {
            if (fila[i] != null) {
                return false;
            }
        }
        return true;
    }

    public void adicionarElemento(int elemento) {
        if (cheio() == false) {
            for (int i = 0; i < tamanho; i++) {
                if (fila[i] == null) {
                    fila[i] = elemento;
                    System.out.println("O elemento foi adicionado");
                    break;
                }
            }
        } else {
            System.out.println("A fila está cheia");
        }
    }

    public void removerElemento() {
        if (vazio() == false) {
            int i = 0;
            fila[i] = null;
            for (i = 0; i <= tamanho - 2; i++) {
                fila[i] = fila[i + 1];
            }
            fila[i] = null;
            System.out.println("O elemento foi removido");
        } else {
            System.out.println("A fila não possui elementos");
        }
    }
    public void removerOcorrencias(int elemento) {
        if (vazio() == false) {
            if (verificarElemento(elemento) == true) {
                int i = 0;
                Integer[] aux = new Integer[tamanho];
                int j = 0;
                do {
                    if (fila[i] != null) {
                        if (fila[i] != elemento) {
                            aux[j] = fila[i];
                            j++;
                        }
                    }
                    i++;
                } while (i != tamanho);
                fila = aux;
                System.out.println("Todas as ocorrencias do elemento " +elemento+ " foram removidas");
            } else {
                System.out.println("A fila não possui o elemento " + elemento);
            }
        } else {
            System.out.println("A fila não possui elementos");
        }
    }
    public void removerTodos() {
        if (vazio() == false) {
            int i = 0;
            do {
                fila[i] = null;
                i++;
            } while (i != tamanho);
            System.out.println("Todos os elementos foram removidos");

        } else {
            System.out.println("A fila não possui elementos");
        }
    }

    public boolean verificarElemento(int elemento) {
        int i = 0;
        do {
            if(fila[i] != null) {
                if (fila[i] == elemento) {
                    return true;
                }
            }
            i++;
        } while (i != tamanho);
        return false;
    }

    public void buscarElemento(int elemento) {
        if (vazio() == false) {
            if (verificarElemento(elemento) == true) {
                int i = 0;
                do {
                    if (fila[i] != null) {
                        if (fila[i] == elemento) {
                            System.out.println("O elemento " + elemento + " foi encontrado na fila no indice " + i);
                        }
                    }
                    i++;
                } while (i != tamanho);
            } else {
                System.out.println("A fila não possui o elemento " + elemento);
            }
            verificarElemento(elemento);
        } else {
            System.out.println("A fila não possui elementos");
        }
    }

    public void buscarMenor() {
        if (vazio() == false) {
            int i = 0;
            int aux = fila[i];
            do {
                if (aux > fila[i]) {
                    aux = fila[i];
                }
                i++;
            } while (i != tamanho);
            System.out.println("O menor elemento da fila é " + aux);
        } else {
            System.out.println("A fila não possui elementos");
        }
    }

    public void buscarMaior() {
        if (vazio() == false) {
            int i = 0;
            int aux = fila[i];
            do {
                if (aux < fila[i]) {
                    aux = fila[i];
                }
                i++;
            } while (i != tamanho);
            System.out.println("O maior elemento da fila é " + aux);
        } else {
            System.out.println("A fila não possui elementos");
        }
    }

    public void media() {
        if (vazio() == false) {
            int i = 0;
            float soma = 0;
            do {
                if (fila[i] != null) {
                    soma += fila[i];
                }
                i++;
            } while (i != tamanho);
            System.out.println("A média dos elementos da fila é " + soma / tamanho);
        } else {
            System.out.println("A fila não possui elementos");
        }
    }

    public void quantidadeElementos(int elemento) {
        if (vazio() == false) {
            if (verificarElemento(elemento) == true) {
                int i = 0;
                int contagem = 0;
                do {
                    if (fila[i] != null) {
                        if (elemento == fila[i]) {
                            contagem += 1;
                        }
                    }
                    i++;
                } while (i != tamanho);
                System.out.println("A quantidade de elementos " + elemento + " é " + contagem);
            } else {
                System.out.println("A fila não possui o elemento " + elemento);
            }
        } else {
            System.out.println("A fila não possui elementos");
        }
    }

    public void aumentarCapacidade(int novoTamanho) {
        if (novoTamanho > tamanho) {
            Integer aux[] = fila;
            Integer[] novaFila = new Integer[novoTamanho];
            this.fila = novaFila;
            int i = 0;
            do {
                fila[i] = aux[i];
                i++;
            } while (i != tamanho);
            this.tamanho = novoTamanho;
            System.out.println("A capacidade da fila foi aumentada");
        } else {
            System.out.println("O tamanho inserido é menor que o tamanho da fila original.");
        }
    }
}