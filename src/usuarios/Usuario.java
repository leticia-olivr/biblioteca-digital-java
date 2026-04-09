package usuarios;

import Interfaces.IExibir;

public abstract class Usuario implements IExibir {
    private int codigo;
    private String nome;
    private String email;

    Usuario(){

    }

    Usuario(int codigo, String nome, String email){
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public abstract int limiteMaxEmprestimos();
    public abstract int prazoDevolucaoDias();
    public abstract double multaDiaria();
    public abstract String tipoUsuario();

    @Override
    public String exibirResumo(){
        return nome + "|" + email + "|" + codigo;
    }
}
//implementar exibivel
// herda Aluno e professor