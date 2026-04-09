package entidades;

public class Revista extends Material {
    private int edicao;

    Revista(int codigo, String titulo,int anoPublicacao ,int quantidadeDisponivel, int edicao){
        super(codigo, titulo, anoPublicacao, quantidadeDisponivel);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

     @Override
    public int getCodigo() {
        return super.getCodigo();
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }


    @Override
    public int getAnoPublicacao() {
        return super.getAnoPublicacao();
    }

    @Override
    public int getQuantidadeDisponivel() {
        return super.getQuantidadeDisponivel();
    }

    @Override
    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        super.setQuantidadeDisponivel(quantidadeDisponivel);
    }

}
