import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        Scanner nome = new Scanner (System.in);
        Scanner telefone = new Scanner (System.in);
        int opcao = 0;
        String nomeP;
        String nomeConsulta = "";
        Integer telefoneP;
        Hashtable<String, Integer> listaTelefonica = new Hashtable<String, Integer>();

        System.out.println("     L I S T A    T E L E F O N I C A");
        while (opcao != 3) {
            System.out.println("");
            System.out.println("	********** MENU ***********");
            System.out.println(" 	1 - Adicionar Contato   ");
            System.out.println(" 	2 - Buscar Contato      ");
            System.out.println(" 	3 - Sair                ");
            System.out.println("	***************************");
            System.out.print("\nDigite aqui sua opcao: ");
            opcao = scan.nextInt();

            switch(opcao){
                case 1:
                    System.out.print("Informe o nome:");
                    nomeP = nome.nextLine();
                    System.out.print("Informe o Numero do Telefone:");
                    telefoneP = telefone.nextInt();
                    listaTelefonica.put(nomeP, telefoneP);
                    break;
                case 2:
                    System.out.print("Informe o nome da pessoa:");
                    nomeConsulta = nome.nextLine();

                    if(listaTelefonica.get(nomeConsulta) == null){
                        System.out.println("Lista Não contém cadastro!");
                    }else {
                        System.out.println("Telefone " + nomeConsulta + " : " + listaTelefonica.get(nomeConsulta));
                        }
                    break;
                case 3:
                    System.out.println("O programa esta sendo finalizado....");
                    break;
                default:
                    System.out.println("Opcao Invalida! Digite Novamente...");
            }//FIM switch
        }//FIM while

    }
}