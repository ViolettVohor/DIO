package com.company.listaencadeada;

public class ListaEncadeada<T> {
    private No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size()-1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noRetorno;
    }

    public T remove(int index){
        validaIndice(index);
        No<T> noPivor = this.getNo(index);
        if(index == 0){
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    public int size() {
        int tamanhoLista = 0;
        No<T> referenciaAuxiliar = referenciaEntrada;
        while(true){
            if(referenciaAuxiliar != null) {
                tamanhoLista++;
                if(referenciaAuxiliar.getProximoNo() != null) {
                    referenciaAuxiliar = referenciaAuxiliar.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }

    private void validaIndice(int index) {
        if(index >= size())
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice "
                    + index + " desta lista. Esta lista só vai até o índice " + (size() - 1) + ".");
    }

    public boolean isEmpty() {
        return referenciaEntrada == null;
    }

    public No<T> getReferenciaEntrada() {
        return referenciaEntrada;
    }

    public void setReferenciaEntrada(No<T> referenciaEntrada) {
        this.referenciaEntrada = referenciaEntrada;
    }

    @Override
    public String toString() {
        StringBuilder stringRetorno = new StringBuilder();
        No<T> noAuxiliar = referenciaEntrada;

        for(int i = 0; i < this.size(); i++){
            stringRetorno.append("[No{conteúdo=").append(noAuxiliar.getConteudo()).append("}] --> ");
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        stringRetorno.append("null");
        return stringRetorno.toString();
    }
}
