package entidades;

public class Livro extends Material {
    private String autor;

    Livro(int codigo, String titulo,int anoPublicacao ,int quantidadeDisponivel, String autor ){
        super(codigo, titulo, anoPublicacao, quantidadeDisponivel);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
