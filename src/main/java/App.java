package br.gov.rn.eejk.app; // Define que esta classe pertence ao pacote app

import java.util.Scanner; // Importa Scanner para ler dados do teclado

import br.gov.rn.eejk.model.Agenda; // Importa a classe Agenda
import br.gov.rn.eejk.model.Contato; // Importa a classe Contato
import br.gov.rn.eejk.model.ContatoPessoal; // Importa a classe ContatoPessoal
import br.gov.rn.eejk.model.ContatoProfissional; // Importa a classe ContatoProfissional

public class App { // Cria a classe principal App

    public static void main(String[] args) { // Método principal do programa

        Scanner input = new Scanner(System.in); // Cria o leitor de dados do teclado
        Agenda agenda = new Agenda(); // Cria um objeto Agenda

        int opcao = -1; // Cria variável para guardar a opção do menu

        while (opcao != 0) { // Mantém o programa rodando enquanto a opção for diferente de zero

            System.out.println(); // Pula uma linha
            System.out.println("===== AGENDA ====="); // Exibe o título do menu
            System.out.println("1 - Novo contato pessoal"); // Exibe opção 1
            System.out.println("2 - Novo contato profissional"); // Exibe opção 2
            System.out.println("3 - Listar contatos"); // Exibe opção 3
            System.out.println("4 - Buscar contato por nome"); // Exibe opção 4
            System.out.println("5 - Remover contato"); // Exibe opção 5
            System.out.println("6 - Atualizar telefone"); // Exibe opção 6
            System.out.println("7 - Listar favoritos"); // Exibe opção 7
            System.out.println("0 - Sair"); // Exibe opção 0
            System.out.print("Escolha uma opcao: "); // Solicita a opção do usuário

            opcao = input.nextInt(); // Lê a opção numérica
            input.nextLine(); // Limpa a quebra de linha pendente

            if (opcao == 1) { // Verifica se o usuário escolheu novo contato pessoal

                System.out.print("Nome: "); // Solicita o nome
                String nome = input.nextLine(); // Lê o nome

                System.out.print("Telefone: "); // Solicita o telefone
                String telefone = input.nextLine(); // Lê o telefone

                ContatoPessoal contato = new ContatoPessoal(nome, telefone); // Cria um contato pessoal

                System.out.print("Deseja favoritar? (s/n): "); // Pergunta se deseja favoritar
                String resposta = input.nextLine(); // Lê a resposta

                if (resposta.equalsIgnoreCase("s")) { // Verifica se a resposta foi sim
                    contato.favoritar(); // Marca o contato como favorito
                }

                agenda.adicionar(contato); // Adiciona o contato na agenda
                System.out.println("Contato pessoal cadastrado."); // Exibe mensagem de sucesso

            } else if (opcao == 2) { // Verifica se o usuário escolheu novo contato profissional

                System.out.print("Nome: "); // Solicita o nome
                String nome = input.nextLine(); // Lê o nome

                System.out.print("Telefone: "); // Solicita o telefone
                String telefone = input.nextLine(); // Lê o telefone

                System.out.print("Empresa: "); // Solicita a empresa
                String empresa = input.nextLine(); // Lê a empresa

                ContatoProfissional contato = new ContatoProfissional(nome, telefone, empresa); // Cria contato profissional

                agenda.adicionar(contato); // Adiciona o contato na agenda
                System.out.println("Contato profissional cadastrado."); // Exibe mensagem de sucesso

            } else if (opcao == 3) { // Verifica se o usuário escolheu listar contatos

                System.out.println(); // Pula uma linha
                System.out.println("===== LISTA DE CONTATOS ====="); // Exibe título da lista
                agenda.listar(); // Chama o método listar da agenda

            } else if (opcao == 4) { // Verifica se o usuário escolheu buscar contato

                System.out.print("Digite o nome: "); // Solicita o nome
                String nome = input.nextLine(); // Lê o nome

                Contato contato = agenda.buscarPorNome(nome); // Busca o contato na agenda

                if (contato == null) { // Verifica se não encontrou contato
                    System.out.println("Contato nao encontrado."); // Exibe mensagem
                } else { // Caso o contato tenha sido encontrado
                    System.out.println("Contato encontrado:"); // Exibe mensagem
                    System.out.println(contato); // Exibe o contato encontrado
                }

            } else if (opcao == 5) { // Verifica se o usuário escolheu remover contato

                System.out.print("Nome: "); // Solicita o nome
                String nome = input.nextLine(); // Lê o nome

                boolean removido = agenda.remover(nome); // Tenta remover o contato

                if (removido) { // Verifica se removeu com sucesso
                    System.out.println("Contato removido."); // Exibe mensagem de sucesso
                } else { // Caso não tenha encontrado
                    System.out.println("Contato nao encontrado."); // Exibe mensagem
                }

            } else if (opcao == 6) { // Verifica se o usuário escolheu atualizar telefone

                System.out.print("Nome: "); // Solicita o nome
                String nome = input.nextLine(); // Lê o nome

                System.out.print("Novo telefone: "); // Solicita o novo telefone
                String telefone = input.nextLine(); // Lê o novo telefone

                boolean atualizado = agenda.atualizarTelefone(nome, telefone); // Tenta atualizar o telefone

                if (atualizado) { // Verifica se atualizou com sucesso
                    System.out.println("Telefone atualizado."); // Exibe mensagem de sucesso
                } else { // Caso não tenha encontrado
                    System.out.println("Contato nao encontrado."); // Exibe mensagem
                }

            } else if (opcao == 7) { // Verifica se o usuário escolheu listar favoritos

                System.out.println(); // Pula uma linha
                System.out.println("===== FAVORITOS ====="); // Exibe título dos favoritos
                agenda.listarFavoritos(); // Lista os favoritos

            } else if (opcao == 0) { // Verifica se o usuário escolheu sair

                System.out.println("Encerrando agenda..."); // Exibe mensagem de encerramento

            } else { // Caso o usuário digite uma opção inválida

                System.out.println("Opcao invalida."); // Exibe mensagem de erro
            }
        }

        input.close(); // Fecha o Scanner
    }
}
