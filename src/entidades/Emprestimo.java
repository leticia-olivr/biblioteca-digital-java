package entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import Interfaces.ICalcularMulta;
import Interfaces.IExibir;
import usuarios.Usuario;


public class Emprestimo implements IExibir, ICalcularMulta {
    private int idEmprestimo;
    private Usuario usuario;
    private Material material;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaDevolucao;
    private LocalDate dataRealDevolucao;

    Emprestimo(){
    }
    
    Emprestimo(int idEmprestimo, Usuario usuario, Material material, LocalDate emprestimo){
        this.idEmprestimo = idEmprestimo;
        this.usuario = usuario;
        this.material = material;
        this.dataEmprestimo = emprestimo;
        this.dataPrevistaDevolucao = dataEmprestimo.plusDays(usuario.prazoDevolucaoDias());

    }

      public int getId() {
        return idEmprestimo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Material getMaterial() {
        return material;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public LocalDate getDataRealDevolucao() {
        return dataRealDevolucao;
    }

    public void registrarDevolucao(LocalDate dataDevolucao) {
        if (this.dataRealDevolucao != null) {
            System.out.println("Erro: empréstimo já foi devolvido.");
            return;
        }

        this.dataRealDevolucao = dataDevolucao;

        material.aumentarQuantidade();
    }

    public boolean estaFinalizado() {
        return dataRealDevolucao != null;
    }

    public long diasDeAtraso() {
        if (dataRealDevolucao == null) {
            return 0;
        }

        long dias = ChronoUnit.DAYS.between(dataPrevistaDevolucao, dataRealDevolucao);

        return Math.max(dias, 0);
    }

    @Override
    public double calcularMulta() {
        long diasAtraso = diasDeAtraso();
        return diasAtraso * usuario.multaDiaria();
    }

    
    @Override
    public String exibirResumo() {
        return "ID: " + idEmprestimo +
                " | Usuário: " + usuario.getNome() +
                " | Material: " + material.getTitulo() +
                " | Empréstimo: " + dataEmprestimo +
                " | Previsto: " + dataPrevistaDevolucao +
                " | Devolução: " + (dataRealDevolucao != null ? dataRealDevolucao : "Em andamento");
    }
}



