# Biblioteca Digital em Java

## Sobre o projeto

Este projeto foi desenvolvido em Java com foco na prática de Programação Orientada a Objetos. O sistema simula o funcionamento de uma biblioteca digital, permitindo o cadastro de usuários e materiais, além do controle de empréstimos, devoluções e multas por atraso.

## Funcionalidades

* Cadastro de usuários
* Cadastro de materiais
* Realização de empréstimos
* Registro de devoluções
* Cálculo de multa por atraso
* Listagem de usuários, materiais e empréstimos

## Conceitos utilizados

* Classes abstratas
* Herança
* Interfaces
* Encapsulamento
* Polimorfismo
* Listas com ArrayList

## Estrutura do projeto

* `Interfaces`: interfaces do sistema
* `usuarios`: classes de usuário
* `entidades`: materiais e empréstimos
* `sistema`: classes principais do sistema

## Regras do sistema

* Não permite empréstimo sem quantidade disponível
* Não permite ultrapassar o limite de empréstimos do usuário
* Calcula a data prevista de devolução conforme o tipo de usuário
* Atualiza a quantidade do material ao devolver
* Calcula multa em caso de atraso
* Não permite devolver o mesmo empréstimo duas vezes

## Tecnologias

* Java
* Programação Orientada a Objetos (POO)

## Execução

1. Clone o repositório
2. Abra o projeto em uma IDE Java
3. Execute a classe `Main`

## Autora

Projeto desenvolvido por Leticia para prática acadêmica de Programação Orientada a Objetos em Java.
