package br.gov.rn.eejk.model; // Define que esta classe pertence ao pacote model

public class ContatoPessoal extends Contato implements Favoritavel { // ContatoPessoal herda de Contato e implementa Favoritavel

    private boolean favorito; // Atributo que indica se o contato é favorito

    public ContatoPessoal(String nome, String telefone) { // Construtor da classe ContatoPessoal
        super(nome, telefone); // Chama o construtor da classe Contato
        this.favorito = false; // Define que o contato começa como não favorito
    }

    @Override // Indica que estamos implementando o método abstrato da classe Contato
    public String getTipo() { // Método que retorna o tipo do contato
        return "Pessoal"; // Retorna o texto Pessoal
    }

    @Override // Indica que estamos implementando o método da interface Favoritavel
    public void favoritar() { // Método para marcar o contato como favorito
        this.favorito = true; // Altera favorito para verdadeiro
    }

    public boolean isFavorito() { // Método para verificar se o contato é favorito
        return this.favorito; // Retorna true ou false
    }

    @Override // Indica que estamos sobrescrevendo o método toString
    public String toString() { // Método que define como o contato pessoal será exibido
        return super.toString() // Usa o texto criado pela classe Contato
                + " | Favorito: " + (favorito ? "Sim" : "Não"); // Exibe se é favorito ou não
    }
}
