# Herança

A herança é um dos aspectos mais importantes da Programação Orientada a Objetos. A chave para entender a herança é que ela fornece reutilização de código. Em vez de escrever o mesmo código repetidamente, podemos simplesmente herdar as propriedades de uma classe na outra. Trata-se de um relacionamento entre uma superclasse (classe generalizada) e uma subclasse (classe especializada), onde a subclasse herda dados e comportamentos da superclasse. Com isso, podemos afirmar que a herança representa a relação “é um”.

![Observe um exemplo na figura 1.](caminho/para/a/imagem/figura1.png)


Figura 1 – Exemplo de relação de herança Fonte: Elaborado pelo autor.

Figura 1 – Exemplo de relação de herança Fonte: Elaborado pelo autor.

Observe pela figura 1 que temos uma superclasse chamada Animal. Nela temos os atributos (características) e métodos (ações) que podem ser representadas em qualquer tipo de animal. Ou seja, qualquer animal tem uma cor e qualquer animal come.

Temos também uma classe chamada Cachorro. Observe que esta classe herda as características da classe animal. A relação é: cachorro herda da classe animal, ou simplesmente, cachorro é um animal. Deste modo, a classe cachorro, além da propriedade cor (herdada da classe animal), também tem a propriedade proprietário, bem como os métodos desta classe. De modo semelhante, a classe Leão também tem seus próprios métodos e atributos, além é claro, dos métodos e atributos da classe Animal.

Quando algumas classes estão intimamente relacionadas, podemos identificar atributos e métodos comuns e adicioná-los a uma superclasse. Depois disso, usamos herança para definir as subclasses e as especializamos com capacidades além daquelas herdadas da superclasse.
