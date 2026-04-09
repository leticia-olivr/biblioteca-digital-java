/*
GUIA DO PROJETO — SISTEMA DE BIBLIOTECA DIGITAL EM JAVA

OBJETIVO GERAL
- Criar um sistema de biblioteca digital em Java.
- O projeto precisa usar:
  interfaces,
  classes abstratas,
  herança,
  encapsulamento,
  listas,
  múltiplos arquivos .java. :contentReference[oaicite:0]{index=0}

--------------------------------------------------
1) ORGANIZAÇÃO DO PROJETO
--------------------------------------------------

/*
Criar os arquivos e separar por responsabilidade.

Sugestão de organização:
- interfaces
- usuarios
- materiais
- principal ou sistema

Verificar se todos os arquivos obrigatórios existem:
- Exibivel
- CalculavelMulta
- Usuario
- Aluno
- Professor
- Material
- Livro
- Revista
- Ebook
- Emprestimo
- Biblioteca
- Main

Nada além disso é obrigatório pelo enunciado.
*/

--------------------------------------------------
2) INTERFACES OBRIGATÓRIAS
--------------------------------------------------

/*
Interface Exibivel
- Serve para exibir um resumo do objeto.
- Deve ter um método que retorne uma String com resumo. :contentReference[oaicite:1]{index=1}

Quem implementa Exibivel:
- Usuario
- Material
- Emprestimo :contentReference[oaicite:2]{index=2}

Interface CalculavelMulta
- Serve para definir o cálculo da multa.
- Deve ter um método para calcular multa. :contentReference[oaicite:3]{index=3}

Quem implementa CalculavelMulta:
- Emprestimo :contentReference[oaicite:4]{index=4}
*/

--------------------------------------------------
3) CLASSE ABSTRATA USUARIO
--------------------------------------------------

/*
A classe Usuario deve:
- ser abstrata
- implementar Exibivel :contentReference[oaicite:5]{index=5}

Atributos mínimos:
- codigo
- nome
- email :contentReference[oaicite:6]{index=6}

Métodos abstratos esperados:
- limite máximo de empréstimos
- prazo de devolução em dias
- valor da multa diária
- tipo do usuário :contentReference[oaicite:7]{index=7}

Também pensar:
- construtor
- getters
- setters, apenas se fizer sentido
- exibirResumo
*/

--------------------------------------------------
4) CLASSES ALUNO E PROFESSOR
--------------------------------------------------

/*
Aluno
- herda de Usuario
- é classe concreta
- regras fixas:
  limite de 3 empréstimos simultâneos
  prazo de 7 dias
  multa diária de R$ 2,50 :contentReference[oaicite:8]{index=8}

Professor
- herda de Usuario
- é classe concreta
- regras fixas:
  limite de 5 empréstimos simultâneos
  prazo de 14 dias
  multa diária de R$ 1,00 :contentReference[oaicite:9]{index=9}

Pensar:
- quais métodos abstratos de Usuario cada um vai sobrescrever
- como mostrar no resumo se é Aluno ou Professor
*/

--------------------------------------------------
5) CLASSE ABSTRATA MATERIAL
--------------------------------------------------

/*
A classe Material deve:
- ser abstrata
- implementar Exibivel :contentReference[oaicite:10]{index=10}

Atributos mínimos:
- codigo
- titulo
- ano de publicacao
- quantidade disponivel :contentReference[oaicite:11]{index=11}

Métodos esperados:
- verificar se há exemplar disponível
- reduzir quantidade no empréstimo
- aumentar quantidade na devolução
- ter pelo menos um método abstrato para informação específica do tipo de material :contentReference[oaicite:12]{index=12}

Também pensar:
- construtor
- getters
- proteção do encapsulamento
- exibirResumo
*/

--------------------------------------------------
6) CLASSES LIVRO, REVISTA E EBOOK
--------------------------------------------------

/*
Livro
- herda de Material
- atributo específico mínimo: autor :contentReference[oaicite:13]{index=13}

Revista
- herda de Material
- atributo específico mínimo: edicao :contentReference[oaicite:14]{index=14}

Ebook
- herda de Material
- atributos específicos mínimos:
  formato
  tamanho do arquivo :contentReference[oaicite:15]{index=15}

Pensar:
- qual método abstrato de Material cada um vai sobrescrever
- como o resumo de cada material vai mostrar sua informação específica
*/

--------------------------------------------------
7) CLASSE EMPRESTIMO
--------------------------------------------------

/*
Emprestimo deve:
- ser classe concreta
- implementar Exibivel
- implementar CalculavelMulta :contentReference[oaicite:16]{index=16}

Atributos mínimos:
- id do empréstimo
- usuário
- material
- data do empréstimo
- data prevista de devolução
- data real de devolução :contentReference[oaicite:17]{index=17}

Responsabilidades:
- armazenar dados do empréstimo
- registrar devolução
- verificar se o empréstimo foi finalizado
- calcular dias de atraso
- calcular multa
- exibir resumo do empréstimo :contentReference[oaicite:18]{index=18}

Pensar com calma:
- quando a data prevista será calculada
- como saber se ainda está em andamento
- como impedir devolução duas vezes
- como calcular atraso somente se a devolução existir
*/

--------------------------------------------------
8) CLASSE BIBLIOTECA
--------------------------------------------------

/*
Biblioteca deve:
- ser a classe que gerencia o sistema
- armazenar listas de:
  usuários,
  materiais,
  empréstimos :contentReference[oaicite:19]{index=19}

Métodos obrigatórios:
- cadastrar usuário
- cadastrar material
- buscar usuário por código
- buscar material por código
- buscar empréstimo por id
- realizar empréstimo
- registrar devolução
- listar usuários
- listar materiais
- listar empréstimos em andamento
- listar empréstimos finalizados
- contar empréstimos ativos de um usuário :contentReference[oaicite:20]{index=20}

Essa classe é o centro da lógica do sistema.
Antes de implementar, pensar:
- quais listas vai usar
- como procurar elementos nas listas
- o que acontece quando não encontrar usuário/material/empréstimo
- em quais métodos as regras de negócio serão verificadas
*/

--------------------------------------------------
9) REGRAS OBRIGATÓRIAS DO SISTEMA
--------------------------------------------------

/*
O sistema deve respeitar estas regras: :contentReference[oaicite:21]{index=21}

1. Não pode emprestar material sem quantidade disponível.
2. Não pode emprestar além do limite permitido para o tipo de usuário.
3. A data prevista de devolução deve ser calculada com base no tipo de usuário.
4. A devolução deve atualizar a quantidade disponível do material.
5. Se houver atraso, a multa deve ser calculada.
6. Não pode devolver duas vezes o mesmo empréstimo.
7. Não pode realizar empréstimo para usuário inexistente.
8. Não pode realizar empréstimo de material inexistente.

Antes de programar, pensar:
- em qual classe cada regra será verificada
- quais mensagens de erro mostrar
- se vai usar exceção ou mensagem simples
*/

--------------------------------------------------
10) REGRA DA MULTA
--------------------------------------------------

/*
A multa deve seguir:
multa = diasDeAtraso × valorMultaDiaria :contentReference[oaicite:22]{index=22}

Valores fixos:
- Aluno: R$ 2,50 por dia
- Professor: R$ 1,00 por dia :contentReference[oaicite:23]{index=23}

Dias de atraso:
- diferença entre data real de devolução e data prevista
- considerar somente valores positivos :contentReference[oaicite:24]{index=24}

Se devolveu no prazo ou antes:
- multa = 0,00 :contentReference[oaicite:25]{index=25}

Antes de fazer:
- decidir que classe sabe o valor da multa diária
- decidir que classe sabe quantos dias de atraso houve
- juntar essas duas informações sem quebrar a lógica
*/

--------------------------------------------------
11) O QUE A MAIN PRECISA MOSTRAR
--------------------------------------------------

/*
A Main deve demonstrar o funcionamento completo do sistema.
Ela não deve só criar objetos soltos. :contentReference[oaicite:26]{index=26}

Roteiro obrigatório:
1. Criar a biblioteca.
2. Cadastrar pelo menos 1 aluno.
3. Cadastrar pelo menos 1 professor.
4. Cadastrar pelo menos 2 livros.
5. Cadastrar pelo menos 1 revista.
6. Cadastrar pelo menos 1 ebook.
7. Listar usuários e materiais.
8. Realizar empréstimos válidos.
9. Fazer pelo menos uma tentativa inválida.
10. Listar empréstimos em andamento.
11. Registrar uma devolução com atraso.
12. Registrar uma devolução sem atraso.
13. Mostrar o valor das multas.
14. Mostrar a situação final do sistema. :contentReference[oaicite:27]{index=27}

Não esquecer:
- a Main serve para provar que tudo funciona
- ela deve mostrar as regras sendo respeitadas
*/

--------------------------------------------------
12) ORDEM CERTA PARA VOCÊ FAZER
--------------------------------------------------

/*
PASSO 1
- Criar as interfaces.

PASSO 2
- Criar Usuario e Material como abstratas.

PASSO 3
- Criar Aluno e Professor.

PASSO 4
- Criar Livro, Revista e Ebook.

PASSO 5
- Criar Emprestimo.

PASSO 6
- Criar Biblioteca.

PASSO 7
- Criar Main para testar tudo.

Essa ordem evita fazer classe dependente antes da base.
*/

--------------------------------------------------
13) CHECKLIST DE CADA CLASSE
--------------------------------------------------

/*
Para cada classe, verificar:
- nome correto
- pacote correto
- atributos privados
- construtor necessário
- getters necessários
- métodos pedidos no enunciado
- sobrescrita correta de métodos
- responsabilidade da classe bem definida

Pergunta que você deve se fazer:
"Essa classe está fazendo só o que deveria fazer?"
*/

--------------------------------------------------
14) CHECKLIST FINAL ANTES DE ENTREGAR
--------------------------------------------------

/*
Verificar:
- usei interfaces?
- usei classes abstratas?
- usei herança?
- usei encapsulamento?
- usei listas?
- usei vários arquivos .java?
- tenho todas as classes obrigatórias?
- a Main mostra uma execução completa?
- a multa funciona?
- a devolução atualiza a quantidade?
- o sistema impede empréstimo inválido?
- o sistema impede devolução duplicada?

Se tudo isso estiver certo, você estará seguindo o enunciado.
*/

--------------------------------------------------
15) CUIDADOS PARA NÃO ERRAR
--------------------------------------------------

/*
- Não misturar responsabilidade de classes.
- Não colocar tudo na Main.
- Não esquecer que Usuario e Material são abstratas.
- Não esquecer que Emprestimo implementa duas interfaces.
- Não esquecer de usar listas dentro de Biblioteca.
- Não esquecer que a data prevista depende do tipo de usuário.
- Não esquecer que a quantidade disponível muda no empréstimo e na devolução.
- Não esquecer de listar estado inicial e final.
*/

--------------------------------------------------
16) PERGUNTA FINAL QUE DEVE GUIAR VOCÊ
--------------------------------------------------

/*
Se eu mostrar meu projeto para o professor, ele consegue enxergar claramente:
- quem são os usuários,
- quais são os materiais,
- como acontece um empréstimo,
- como acontece uma devolução,
- como a multa é calculada,
- e como a biblioteca controla tudo?

Se a resposta for sim, você está no caminho certo.
*/

Projeto de biblioteca digital em Java