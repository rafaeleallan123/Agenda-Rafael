package br.gov.rn.eejk.model; // Define que esta classe pertence ao pacote model

public abstract class Contato { // Cria uma classe abstrata chamada Contato

    private String nome; // Atributo privado para guardar o nome do contato
    private String telefone; // Atributo privado para guardar o telefone do contato

    public Contato(String nome, String telefone) { // Construtor da classe Contato
        this.nome = nome; // Guarda o nome recebido no atributo nome
        this.telefone = telefone; // Guarda o telefone recebido no atributo telefone
    }

    public String getNome() { // Método para acessar o nome do contato
        return this.nome; // Retorna o nome do contato
    }

    public String getTelefone() { // Método para acessar o telefone do contato
        return this.telefone; // Retorna o telefone do contato
    }

    public void setTelefone(String telefone) { // Método para alterar o telefone do contato
        this.telefone = telefone; // Atualiza o telefone do contato
    }

    public abstract String getTipo(); // Método abstrato que obriga as classes filhas a informarem o tipo

    @Override // Indica que estamos sobrescrevendo o método toString
    public String toString() { // Método que define como o contato será exibido
        return "Tipo: " + getTipo() // Exibe o tipo do contato
                + " | Nome: " + nome // Exibe o nome do contato
                + " | Telefone: " + telefone; // Exibe o telefone do contato
    }
}
