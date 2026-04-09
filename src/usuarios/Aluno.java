package usuarios;

public class Aluno extends Usuario {
    
    public Aluno(){
    }
    
    public Aluno(int codigo, String nome, String email){
        super(codigo, nome, email);
    }

   @Override
   public int getCodigo() {
       return super.getCodigo();
   }

    @Override
    public String getNome(){
        return super.getEmail();
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
        return 3;
    }

    @Override
    public int prazoDevolucaoDias() {
        return 7;
    }

    @Override
    public double multaDiaria() {
        return 2.50;
    }

    @Override
    public String tipoUsuario() {
        return "Aluno";
    }

}
