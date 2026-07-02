package br.gov.rn.eejk.model; // Define que esta classe pertence ao pacote model

import java.util.ArrayList; // Importa a classe ArrayList

public class Agenda { // Cria a classe Agenda

    private ArrayList<Contato> contatos; // Cria uma lista de contatos

    public Agenda() { // Construtor da classe Agenda
        this.contatos = new ArrayList<>(); // Inicializa a lista de contatos vazia
    }

    public void adicionar(Contato contato) { // Método para adicionar contato
        this.contatos.add(contato); // Adiciona o contato na lista
    }

    public void listar() { // Método para listar todos os contatos

        if (contatos.isEmpty()) { // Verifica se a lista está vazia
            System.out.println("Nenhum contato cadastrado."); // Mostra mensagem se não houver contatos
            return; // Encerra o método
        }

        for (Contato contato : contatos) { // Percorre todos os contatos da lista
            System.out.println(contato); // Exibe cada contato
        }
    }

    public Contato buscarPorNome(String nome) { // Método para buscar contato pelo nome

        for (Contato contato : contatos) { // Percorre todos os contatos da lista

            if (contato.getNome().equalsIgnoreCase(nome)) { // Compara o nome ignorando maiúsculas e minúsculas
                return contato; // Retorna o contato encontrado
            }
        }

        return null; // Retorna null se não encontrar nenhum contato
    }

    public boolean remover(String nome) { // Método para remover contato pelo nome

        Contato contato = buscarPorNome(nome); // Busca o contato pelo nome

        if (contato == null) { // Verifica se o contato não foi encontrado
            return false; // Retorna falso se não encontrou
        }

        contatos.remove(contato); // Remove o contato da lista
        return true; // Retorna verdadeiro informando que removeu
    }

    public boolean atualizarTelefone(String nome, String novoTelefone) { // Método para atualizar telefone

        Contato contato = buscarPorNome(nome); // Busca o contato pelo nome

        if (contato == null) { // Verifica se o contato não foi encontrado
            return false; // Retorna falso se não encontrou
        }

        contato.setTelefone(novoTelefone); // Atualiza o telefone usando o setter
        return true; // Retorna verdadeiro informando que atualizou
    }

    public void listarFavoritos() { // Método para listar contatos favoritos

        boolean encontrou = false; // Variável para saber se encontrou algum favorito

        for (Contato contato : contatos) { // Percorre todos os contatos da lista

            if (contato instanceof ContatoPessoal) { // Verifica se o contato é do tipo ContatoPessoal

                ContatoPessoal pessoal = (ContatoPessoal) contato; // Converte Contato para ContatoPessoal

                if (pessoal.isFavorito()) { // Verifica se o contato pessoal é favorito
                    System.out.println(pessoal); // Exibe o contato favorito
                    encontrou = true; // Marca que encontrou pelo menos um favorito
                }
            }
        }

        if (!encontrou) { // Verifica se nenhum favorito foi encontrado
            System.out.println("Nenhum favorito encontrado."); // Exibe mensagem
        }
    }
}
