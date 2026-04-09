package entidades;

public class Ebook extends Material {
    
    private String formato;
    private double tamanhoArquivo;

    public Ebook(){
    }

    public Ebook(int codigo, String titulo,int anoPublicacao ,int quantidadeDisponivel, String formato, double tamanhoArquivo){
        super(codigo, titulo, anoPublicacao, quantidadeDisponivel);
        this.formato = formato;
        this.tamanhoArquivo = tamanhoArquivo;
    }


    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(int tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
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

    @Override
    public String infoEspecifica(){
        return "Formato: " + formato + " | Tamanho: " + tamanhoArquivo + " MB";
    }




}
