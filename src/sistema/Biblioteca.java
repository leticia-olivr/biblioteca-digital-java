package sistema;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entidades.Emprestimo;
import entidades.Material;
import usuarios.Usuario;

public class Biblioteca {

    private List<Usuario> usuarios;
    private List<Material> materiais;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        usuarios = new ArrayList<>();
        materiais = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void cadastrarMaterial(Material material) {
        materiais.add(material);
    }

    public Usuario buscarUsuarioPorCodigo(int codigo) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCodigo() == codigo) {
                return usuario;
            }
        }
        return null;
    }

    public Material buscarMaterialPorCodigo(int codigo) {
        for (Material material : materiais) {
            if (material.getCodigo() == codigo) {
                return material;
            }
        }
        return null;
    }

    public Emprestimo buscarEmprestimoPorId(int id) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getId() == id) {
                return emprestimo;
            }
        }
        return null;
    }

    public int contarEmprestimosAtivosUsuario(Usuario usuario) {
        int contador = 0;

        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getUsuario().getCodigo() == usuario.getCodigo() && !emprestimo.estaFinalizado()) {
                contador++;
            }
        }

        return contador;
    }

    public void realizarEmprestimo(int idEmprestimo, int codigoUsuario, int codigoMaterial, LocalDate dataEmprestimo) {
        Usuario usuario = buscarUsuarioPorCodigo(codigoUsuario);
        Material material = buscarMaterialPorCodigo(codigoMaterial);

        if (usuario == null) {
            System.out.println("Erro: usuário não encontrado.");
            return;
        }

        if (material == null) {
            System.out.println("Erro: material não encontrado.");
            return;
        }

        if (!material.disponivel()) {
            System.out.println("Erro: material sem quantidade disponível.");
            return;
        }

        if (contarEmprestimosAtivosUsuario(usuario) >= usuario.limiteMaxEmprestimos()) {
            System.out.println("Erro: usuário atingiu o limite máximo de empréstimos.");
            return;
        }

        material.redQuanEmprestimo();

        Emprestimo emprestimo = new Emprestimo(idEmprestimo, usuario, material, dataEmprestimo);
        emprestimos.add(emprestimo);

        System.out.println("Empréstimo realizado com sucesso.");
    }

    public void registrarDevolucao(int idEmprestimo, LocalDate dataDevolucao) {
        Emprestimo emprestimo = buscarEmprestimoPorId(idEmprestimo);

        if (emprestimo == null) {
            System.out.println("Erro: empréstimo não encontrado.");
            return;
        }

        if (emprestimo.estaFinalizado()) {
            System.out.println("Erro: esse empréstimo já foi devolvido.");
            return;
        }

        emprestimo.registrarDevolucao(dataDevolucao);

        System.out.println("Devolução registrada com sucesso.");
        System.out.println("Multa: R$ " + emprestimo.calcularMulta());
    }

    public void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.exibirResumo());
        }
    }

    public void listarMateriais() {
        for (Material material : materiais) {
            System.out.println(material.exibirResumo());
        }
    }

    public void listarEmprestimosEmAndamento() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.estaFinalizado()) {
                System.out.println(emprestimo.exibirResumo());
            }
        }
    }

    public void listarEmprestimosFinalizados() {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.estaFinalizado()) {
                System.out.println(emprestimo.exibirResumo());
            }
        }
    }
}