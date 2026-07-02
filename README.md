# Agenda em Memória

Projeto desenvolvido na disciplina de Desenvolvimento de Sistemas para revisão dos principais conceitos de Programação Orientada a Objetos (POO) utilizando Java.

## Objetivos

Este projeto foi criado com fins educacionais para praticar:

- Classes e Objetos
- Atributos e Métodos
- Encapsulamento
- Herança
- Classes Abstratas
- Métodos Abstratos
- Interfaces
- Polimorfismo
- ArrayList
- Organização em Pacotes

---

## Estrutura do Projeto

```text
src
├── app
│   └── App.java
│
└── model
    ├── Agenda.java
    ├── Contato.java
    ├── ContatoPessoal.java
    ├── ContatoProfissional.java
    └── Favoritavel.java
```

---

## Funcionalidades

O sistema funciona através do terminal e permite:

- Cadastrar contatos pessoais
- Cadastrar contatos profissionais
- Listar contatos
- Buscar contatos por nome
- Atualizar telefone
- Remover contatos
- Favoritar contatos pessoais
- Listar contatos favoritos

---

## Conceitos Aplicados

### Classe Abstrata

A classe `Contato` representa um modelo genérico de contato.

```java
public abstract class Contato
```

---

### Herança

As classes abaixo herdam de `Contato`:

```java
ContatoPessoal
ContatoProfissional
```

---

### Interface

A interface `Favoritavel` define o comportamento de favoritar um contato.

```java
public interface Favoritavel
```

---

### Encapsulamento

Os atributos são privados e acessados através de métodos públicos.

Exemplo:

```java
private String nome;
private String telefone;
```

---

### ArrayList

Os contatos são armazenados em memória utilizando:

```java
ArrayList<Contato>
```

---

## Como Executar

### Clonar o projeto

```bash
git clone https://github.com/SEU-USUARIO/agenda.git
```

### Entrar na pasta

```bash
cd agenda
```

### Compilar

```bash
mvn compile
```

### Executar

```bash
mvn exec:java
```

Ou execute diretamente a classe:

```text
app.App
```

---

## Exemplo de Menu

```text
===== AGENDA =====

1 - Novo contato pessoal
2 - Novo contato profissional
3 - Listar contatos
4 - Buscar contato por nome
5 - Remover contato
6 - Atualizar telefone
7 - Listar favoritos
0 - Sair
```

---

## Limitações

Atualmente os dados são armazenados apenas em memória.

Quando o programa é encerrado:

```text
Contatos são perdidos.
```

---

## Próximos Passos

Evoluções previstas para o projeto:

- Persistência com Banco de Dados
- JPA/Hibernate
- H2 Database
- Relacionamentos entre entidades
- Interface gráfica
- API REST

---

## Autor

Weskley Bezerra

Disciplina: Desenvolvimento de Sistemas

Escola Estadual em Tempo Integral Juscelino Kubitschek (EETIJK)
