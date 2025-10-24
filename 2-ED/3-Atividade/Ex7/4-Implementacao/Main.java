class No {
    int valor;
    No proximo;

    No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class Fila {
    No inicio;
    No fim;

    Fila() {
        inicio = null;
        fim = null;
    }

    public void enfileirar(int valor) {
        No novo = new No(valor);
        if (fim != null) {
            fim.proximo = novo;
        }
        fim = novo;
        if (inicio == null) {
            inicio = novo;
        }
    }

    public int desenfileirar() {
        if (inicio == null) {
            return -1;
        }
        int valorRemovido = inicio.valor;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        return valorRemovido;
    }

    public void exibir() {
        if (inicio == null) {
            System.out.println("Fila vazia!");
            return;
        }
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}

class Pilha {
    No topo;

    Pilha() {
        topo = null;
    }

    public void empilhar(int valor) {
        No novo = new No(valor);
        novo.proximo = topo;
        topo = novo;
    }

    public int desempilhar() {
        if (topo == null) {
            return -1;
        }
        int valorRemovido = topo.valor;
        topo = topo.proximo;
        return valorRemovido;
    }

    public void exibir() {
        if (topo == null) {
            System.out.println("Pilha vazia!");
            return;
        }
        No atual = topo;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}

public class Main {
    public static Pilha converterFilaParaPilha(Fila fila) {
        Pilha pilha = new Pilha();
        while (fila.inicio != null) {
            int valor = fila.desenfileirar();
            pilha.empilhar(valor);
        }
        return pilha;
    }

    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(4);

        System.out.println("Fila original:");
        fila.exibir();

        Pilha pilha = converterFilaParaPilha(fila);

        System.out.println("Pilha resultante (ordem invertida):");
        pilha.exibir();
    }
}
