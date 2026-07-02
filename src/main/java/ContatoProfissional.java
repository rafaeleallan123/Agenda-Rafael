package br.gov.rn.eejk.model; // Define que esta classe pertence ao pacote model

public class ContatoProfissional extends Contato { // ContatoProfissional herda de Contato

    private String empresa; // Atributo privado para guardar o nome da empresa

    public ContatoProfissional(String nome, String telefone, String empresa) { // Construtor da classe
        super(nome, telefone); // Chama o construtor da classe Contato
        this.empresa = empresa; // Guarda a empresa recebida no atributo empresa
    }

    public String getEmpresa() { // Método para acessar a empresa
        return this.empresa; // Retorna o nome da empresa
    }

    @Override // Indica que estamos implementando o método abstrato da classe Contato
    public String getTipo() { // Método que retorna o tipo do contato
        return "Profissional"; // Retorna o texto Profissional
    }

    @Override // Indica que estamos sobrescrevendo o método toString
    public String toString() { // Método que define como o contato profissional será exibido
        return super.toString() // Usa o texto criado pela classe Contato
                + " | Empresa: " + empresa; // Exibe a empresa do contato profissional
    }
}
