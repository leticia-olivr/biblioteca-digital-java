package sistema;

import java.time.LocalDate;

import entidades.*;
import usuarios.*;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Usuario aluno = new Aluno(1, "Ana", "ana@email.com");
        Usuario professor = new Professor(2, "Carlos", "carlos@email.com");

        biblioteca.cadastrarUsuario(aluno);
        biblioteca.cadastrarUsuario(professor);

        Material livro1 = new Livro(1, "Java Básico", 2020, 2, "Autor A");
        Material livro2 = new Livro(2, "Estruturas de Dados", 2021, 1, "Autor B");
        Material revista = new Revista(3, "Revista Tech", 2022, 1, 10);
        Material ebook = new Ebook(4, "POO em Java", 2023, 1, "PDF", 5.0);

        biblioteca.cadastrarMaterial(livro1);
        biblioteca.cadastrarMaterial(livro2);
        biblioteca.cadastrarMaterial(revista);
        biblioteca.cadastrarMaterial(ebook);

        System.out.println("\n=== Usuários ===");
        biblioteca.listarUsuarios();

        System.out.println("\n=== Materiais ===");
        biblioteca.listarMateriais();

        biblioteca.realizarEmprestimo(1, 1, 1, LocalDate.of(2026, 4, 1));
        biblioteca.realizarEmprestimo(2, 1, 2, LocalDate.of(2026, 4, 1));
        biblioteca.realizarEmprestimo(3, 1, 3, LocalDate.of(2026, 4, 1));
        biblioteca.realizarEmprestimo(4, 2, 4, LocalDate.of(2026, 4, 1));

        biblioteca.realizarEmprestimo(5, 1, 4, LocalDate.of(2026, 4, 1));

        System.out.println("\n=== Empréstimos em andamento ===");
        biblioteca.listarEmprestimosEmAndamento();

        biblioteca.registrarDevolucao(1, LocalDate.of(2026, 4, 10));

        biblioteca.registrarDevolucao(2, LocalDate.of(2026, 4, 5));


        System.out.println("\n=== Empréstimos Finalizados ===");
        biblioteca.listarEmprestimosFinalizados();

        System.out.println("\n=== Materiais Atualizados ===");
        biblioteca.listarMateriais();

        System.out.println("\n=== Empréstimos em andamento (FINAL) ===");
        biblioteca.listarEmprestimosEmAndamento();
    }
}
