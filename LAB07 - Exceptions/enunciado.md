# Ex01 
Crie uma classe funcionário, com os campos CPF, Nome e Salário. Faça todos os métodos esperados para tratar desses atributos.

Adicionalmente

- Acrescente um novo atributo privado em Funcionário que armazene o teto salarial. Por padrão, todos os objetos da classe Funcionário são inicializados com o teto de R$ 40 mil. Permita ao usuário da classe atribuir e consultar os valores desse novo atributo. 

- Crie um método para aumentar o salário, passando como parâmetro um valor porcentual.
- Note que o método pode gerar valores inválidos. É possível que o salário fique negativo ou que atinja um valor acima do teto. Não deixe que isso ocorra. Para retornar o erro, crie uma classe de exceção baseada na classe IllegalStateException (essa classe herda RuntimeException). 

- Caso o erro seja de valor negativo, mostrar a mensagem "Valor inválido de salário";

- Caso o erro seja de valor maior que o teto, mostrar a mensagem "Valor ultrapassa o teto";

- Na classe principal inclua um código que faz chama um dos métodos que pode acionar a exceção criada e nesse caso mostre na tela a mensagem do erro emitida pela exceção.

- Independentemente de a exceção ser ou não acionada, mostrar ao final da chamada do método qual o valor do salário atual

# Ex02
 
- Qual a diferença entre o throw e throws ? Justifique explicado o que cada comando faz

- Indique a diferença entre checked e uncheked exceptions

# Resposta Ex02
## Throw e Throws

A palavra-chave throw, que está no imperativo, lança uma Exception . Isso é bem diferente de
throws , que está no presente do indicativo e só avisa da possibilidade daquele método lançá-la,
obrigando o outro método que vá utilizar-se daquele a se preocupar com essa exceção em questão

---

O throw é um comando de lançamento de exceções, ao ser chamado o mesmo força uma exceção.

As duas formar existentes de tratamento de exceções em Java do ponto de vista método são: Try/Catch and Throws

Ao se criar um throws delegamos um tratamento de exceção para o metódo o qual chamou.

## Checked e Unchecked

As exceções chamadas de Unchecked são aquelas na qual o compilador não checa se as exceções estão sendo tratadas ou não

As exceções chamadas de Checked são aquelas que obrigam quem chama o metodo ou construturo a tratar a exceção
"Must be caught or declared to be throw".
