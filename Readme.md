# Sistema de Biblioteca Digital em Java

## Sobre o Projeto

Este projeto consiste no desenvolvimento de um sistema de biblioteca digital utilizando Java e os principais conceitos de Programação Orientada a Objetos (POO).

O sistema permite gerenciar usuários, materiais e empréstimos, aplicando regras de negócio como controle de disponibilidade, limite de empréstimos e cálculo de multa por atraso.

---

## Funcionalidades

* Cadastro de usuários (Aluno e Professor)
* Cadastro de materiais (Livro, Revista e Ebook)
* Realização de empréstimos
* Registro de devoluções
* Cálculo de multa por atraso
* Listagem de usuários, materiais e empréstimos
* Validação de regras do sistema (limite de empréstimos, disponibilidade, etc.)

---

## Conceitos de POO Utilizados

* Classes abstratas (`Usuario`, `Material`)
* Herança (`Aluno`, `Professor`, `Livro`, `Revista`, `Ebook`)
* Interfaces (`IExibir`, `CalculavelMulta`)
* Encapsulamento
* Polimorfismo
* Listas (`ArrayList`)

---

## Estrutura do Projeto

interfaces
usuarios
materiais
entidades
sistema

* interfaces: contratos do sistema
* usuarios: classes relacionadas aos usuários
* materiais: classes dos materiais da biblioteca
* entidades: classes como `Emprestimo`
* sistema: classe `Biblioteca` e `Main`

---

## Regras do Sistema

* Não é possível emprestar material sem disponibilidade
* Usuários possuem limite de empréstimos
* A data de devolução depende do tipo de usuário
* A devolução atualiza a quantidade do material
* Multa é aplicada em caso de atraso
* Não é possível devolver o mesmo empréstimo duas vezes

---

## Cálculo de Multa

multa = diasDeAtraso × valorMultaDiaria

* Aluno: R$ 2,50 por dia
* Professor: R$ 1,00 por dia

---

## Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)

---

## Como Executar

1. Clone o repositório
   git clone <seu-link-aqui>

2. Abra o projeto em uma IDE (VS Code, IntelliJ ou Eclipse)

3. Execute a classe `Main`

---

## Autor

Projeto desenvolvido por Leticia como prática de Programação Orientada a Objetos em Java.
