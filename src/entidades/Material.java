package entidades;


import Interfaces.IExibir;

public abstract class Material implements IExibir {
    private int codigo;
    private String titulo;
    private int anoPublicacao;
    private int quantidadeDisponivel;

    Material(int codigo, String titulo, int anoPublicacao, int quantidadeDisponivel){
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel){
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
    
    public boolean disponivel(){
        return quantidadeDisponivel > 0;
    }

    public void redQuanEmprestimo(){
        quantidadeDisponivel--;
    }
    public void aumentarQuantidade(){
        quantidadeDisponivel++;
    }

    @Override
    public String exibirResumo(){
        return titulo + "|" + codigo + "|" + anoPublicacao + "|" + quantidadeDisponivel;
    }
}
 
//implementar a interface exibivel
//Duvidade se ta implementado certo 