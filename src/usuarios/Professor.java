package usuarios;

public class Professor extends Usuario {
    

    Professor(){
    }

    Professor(int codigo, String nome, String email){
        super(codigo, nome, email);
    }

    @Override
    public int getCodigo() {
        return super.getCodigo();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

     @Override
    public int limiteMaxEmprestimos() {
        return 5;
    }

    @Override
    public int prazoDevolucaoDias() {
        return 14;
    }

    @Override
    public double multaDiaria() {
        return 1.00;
    }

    @Override
    public String tipoUsuario() {
        return "Aluno";
    }
}
