class No{
    int valor;
    No proximo;

    No(int valor){
        this.valor = valor;
        this.proximo = null;
    }
}

class ListaEncadeada{
    No inicio;

    void adicionar(int valor){
        No novo = new No(valor);

        if(inicio == null){
            inicio = novo;
        }else{
            No atual = inicio;
            while (atual.proximo != null){
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }

    void imprimir(){
        if(inicio == null){
            System.out.println("Lista vazia!");
            return;
        }

        No atual = inicio;
        while (atual != null){
            System.out.println(atual.valor + " | ");
            atual = atual.proximo;
        }

        System.out.println();
    }
}