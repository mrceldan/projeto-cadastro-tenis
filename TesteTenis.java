package PrimeiraAdo;
import java.util.Scanner;

public class TesteTenis {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        VetorTenis vetor = new VetorTenis(5);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("=====MDS TENNIS PROSHOP=====");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Pesquisar cliente");
            System.out.println("3 - Alterar cliente");
            System.out.println("4 - Excluir cliente");
            System.out.println("5 - Listar clientes");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();
                    System.out.print("Raquete: ");
                    String raquete = sc.nextLine();
                    System.out.print("Corda: ");
                    String corda = sc.nextLine();
                    System.out.print("Libragem: ");
                    String libras = sc.nextLine();
                    System.out.print("Data de entrega: ");
                    String entrega = sc.nextLine();

                    vetor.adicionar(new TenisMDS(nome, telefone, raquete, corda, libras, entrega));
                    break;

                case 2:
                    System.out.print("Posição do cliente a pesquisar: ");
                    int posicao = sc.nextInt();
                    sc.nextLine();
                    System.out.println(vetor.buscar(posicao));
                    break;

                case 3:
                    System.out.print("Nome do cliente a alterar: ");
                    String nomeAlterar = sc.nextLine();
                    for (int i = 0; i < vetor.tamanho; i++) {
                        TenisMDS cliente = (TenisMDS) vetor.elementos[i];
                        if (cliente.getNome().equalsIgnoreCase(nomeAlterar)) {
                            System.out.print("Novo nome: ");
                            cliente.setNome(sc.nextLine());
                            System.out.print("Novo telefone: ");
                            cliente.setTelefone(sc.nextLine());
                            System.out.print("Nova raquete: ");
                            cliente.setModeloRaquete(sc.nextLine());
                            System.out.print("Nova corda: ");
                            cliente.setCorda(sc.nextLine());
                            System.out.print("Nova libragem: ");
                            cliente.setLibragem(sc.nextLine());
                            System.out.print("Nova data: ");
                            cliente.setEntrega(sc.nextLine());
                            System.out.println("Cadastro do cliente alterado!");
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Posição para excluir: ");
                    int posicaoExcluir = sc.nextInt();
                    sc.nextLine();
                    vetor.remover(posicaoExcluir);
                    System.out.println("Cliente excluido com sucesso!");
                    break;

                case 5:
                    System.out.println("Clientes encontrados:");
                    vetor.listar();
                    break;

                case 0:
                    System.out.print("Saindo...");
                    break;

                default:
                    System.out.print("Opção inválida.");
            }
        }

        sc.close();
    }
}