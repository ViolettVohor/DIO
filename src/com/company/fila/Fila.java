package com.company.fila;

public class Fila<T> {
    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T obj){
        No<T> novoNo = new No<>(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first(){
        if(!this.isEmpty()){
            No<T> primeiroNo = refNoEntradaFila;
            while(true) {
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue() {
        if(!this.isEmpty()){
            No<T> primeiroNo = refNoEntradaFila;
            No<T> noAuxiliar = refNoEntradaFila;
            while(true) {
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null;
    }

    @Override
    public String toString(){
        StringBuilder stringRetorno = new StringBuilder();
        No<T> noAuxiliar = refNoEntradaFila;

        if(!this.isEmpty()) {
            while(true){
                stringRetorno.append("[No{objeto=").append(noAuxiliar.getObject()).append("}] ---> ");
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    break;
                }
            }
        }
        stringRetorno.append("null");

        return stringRetorno.toString();
    }
}
