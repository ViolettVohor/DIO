package com.company.arvore;

public class ArvoreBinaria<T extends Comparable<T>> {
    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        BinNo<T> novoNo = new BinNo<>(conteudo);
        this.raiz = inserir(raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
        if(atual == null) {
            return novoNo;
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        }else{
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    public void exibirInOrder() {
        System.out.println("\nExibindo InOrder");
        exibirInOrder(this.raiz);
    }

    private void exibirInOrder(BinNo<T> atual) {
        if(atual != null) {
            exibirInOrder(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ", ");
            exibirInOrder(atual.getNoDir());
        }
    }

    public void exibirPosOrder() {
        System.out.println("\nExibindo PosOrder");
        exibirPosOrder(this.raiz);
    }

    private void exibirPosOrder(BinNo<T> atual) {
        if(atual != null) {
            exibirPosOrder(atual.getNoEsq());
            exibirPosOrder(atual.getNoDir());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrder() {
        System.out.println("\nExibindo PreOrder");
        exibirPreOrder(this.raiz);
    }

    private void exibirPreOrder(BinNo<T> atual) {
        if(atual != null) {
            System.out.print(atual.getConteudo() + ", ");
            exibirPreOrder(atual.getNoEsq());
            exibirPreOrder(atual.getNoDir());
        }
    }
    
    public void remover(T conteudo) {
        try{
            BinNo<T> atual = this.raiz;
            BinNo<T> noPai = null;
            BinNo<T> noFilho = null;
            BinNo<T> temporario = null;


            while (atual != null && !atual.getConteudo().equals(conteudo)) {
                noPai = atual;
                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoEsq();
                }else{
                    atual = atual.getNoDir();
                }
            }

            if (atual == null) {
                System.out.println("Conteúdo não encontrado. Bloco Try.");
            }

            if (noPai == null) {
                if (atual.getNoDir() == null) {
                    this.raiz = atual.getNoEsq();
                }else if (atual.getNoEsq() == null) {
                    this.raiz = atual.getNoDir();
                }else{
                    for (temporario = atual, noFilho = atual.getNoEsq();
                         noFilho.getNoDir() != null;
                         temporario = noFilho, noFilho = noFilho.getNoEsq()
                    ){
                        if (noFilho != atual.getNoEsq()) {
                            temporario.setNoDir(noFilho.getNoEsq());
                            noFilho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    noFilho.setNoDir(raiz.getNoDir());
                    raiz = noFilho;
                }
            }else if (atual.getNoDir() == null) {
                if (noPai.getNoEsq() == atual) {
                    noPai.setNoEsq(atual.getNoEsq());
                }else{
                    noPai.setNoDir(atual.getNoEsq());
                }
            }else if (atual.getNoEsq() == null) {
                if (noPai.getNoEsq() == atual) {
                    noPai.setNoEsq(atual.getNoDir());
                }else{
                    noPai.setNoDir(atual.getNoDir());
                }
            }else{
                for (temporario = atual, noFilho = atual.getNoEsq();
                     noFilho.getNoDir() != null;
                     temporario = noFilho, noFilho = noFilho.getNoDir()
                ){
                    if (noFilho != atual.getNoEsq()) {
                        temporario.setNoDir(noFilho.getNoEsq());
                        noFilho.setNoEsq(atual.getNoEsq());
                    }
                    noFilho.setNoDir(atual.getNoDir());

                    if (noPai.getNoEsq() == atual) {
                        noPai.setNoEsq(noFilho);
                    }else{
                        noPai.setNoDir(noFilho);
                    }
                }
            }

        }catch (NullPointerException erro) {
            System.out.println("Conteúdo não encontrado. Bloco Catch.");
        }
    }
}
