# M30 — Expressões Lambda e Interfaces Funcionais

Projeto desenvolvido como atividade prática do curso **EBAC Back-end Java v2**.

## 🎯 Objetivo

Criar uma interface funcional própria e utilizar uma expressão Lambda junto com a Stream API para filtrar uma lista de nomes, exibindo apenas aqueles que começam com a letra **A**.

## 🧠 Conceitos praticados

- **Interface funcional:** criação da interface `FiltroNome` com o método `testar(String nome)`.
- **`@FunctionalInterface`:** anotação que indica que a interface foi criada para ter um único método abstrato.
- **Expressões Lambda:** implementação da regra `nome -> nome.startsWith("A")`.
- **Stream API:** utilização de `stream()` e `filter()` para selecionar os nomes.
- **Referência a método:** uso de `System.out::println` para exibir os resultados.

## 📁 Estrutura do projeto

```text
src/
├── Main.java
└── FiltroNome.java
```

## ⚙️ Como executar

1. Abra o projeto no IntelliJ IDEA ou em outra IDE Java.
2. Localize `src/Main.java`.
3. Execute o método `main()`.

## 🖥️ Resultado esperado

Com a lista de nomes utilizada no projeto, apenas o nome que começa com **A** será exibido:

```text
Ada
```

## 📚 Atividade

**M30 — Expressões Lambda e Interfaces Funcionais**  
Curso: EBAC Back-end Java v2

---

Exercício desenvolvido para praticar recursos do Java moderno de forma simples e direta.
