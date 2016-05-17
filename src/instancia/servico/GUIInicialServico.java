/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.servico;

import GUI.GUIAdministrador;
import GUI.GUICliente;
import GUI.GUIInicial;
import GUI.GUIUsuario;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class GUIInicialServico implements GUIInicial{
    
    private static Scanner in = new Scanner(System.in);
    
    private static GUIAdministrador guiAdministrador = new GUIAdministradorServico();
    private static GUIUsuario guiUsuario = new GUIUsuarioServico();
    private static GUICliente guiCliente = new GUIClienteServico();
    
    @Override
    public void acessarInterface() {
        
        int option;
        
        do {
			System.out.println("---------- Gerenciamento de Demandas ----------");
			System.out.println("1 - Acessar area Usuario Administrador");
			System.out.println("2 - Acessar area Usuario Padrao");
			System.out.println("3 - Acessar area Usuario Cliente");
			System.out.println("0 - Sair");
			
			System.out.print("Opcao desejada: ");
			option = in.nextInt();
			
			
			switch (option) {
			case 1:
				showMenuGUIUsuarioAdministrador();
				break;
			case 2:
				showMenuGUIUsuarioPadrao();
				break;
			case 3:
				showMenuGUIUsuarioCliente();
				break;
			default:
				break;
			}
		} while(option > 0);
	}
    
    public void showMenuGUIUsuarioAdministrador(){
        int option;
		
		do {
			System.out.println("---------- Area Admistrador----------");
			System.out.println("1 - Cadastrar Usuario");
			System.out.println("2 - Cadastrar Informacoes");
			System.out.println("3 - Remover Usuario");
                        System.out.println("4 - Remover Informacoes");
                        System.out.println("5 - Listar Usuarios");
                        System.out.println("6 - Listar Informacoes");
                        System.out.println("7 - Cadastrar Cliente");
                        System.out.println("8 - Remover Cliente");
                        System.out.println("9 - Listar Clientes");
                        System.out.println("10 - Analisar Pedido");
			
			System.out.println("0 - Voltar");
			
			System.out.print("Opcao desejada: ");
			option = in.nextInt();
			
			//clearConsole();
			
			switch (option) {
			case 1:
				guiAdministrador.cadastrarUsuario();
				break;
			case 2:
				guiAdministrador.cadastrarInformacoes();
				break;
			case 3:
				guiAdministrador.removerUsuario();
				break;
                        case 4:
                                guiAdministrador.removerInformacoes();
                                break;
                        case 5:
                                guiAdministrador.listarUsuarios();
                                break;
                        case 6:
                                guiAdministrador.listarInformacoes();
                                break;
                        case 7:
                                guiAdministrador.cadastrarCliente();
                                break;
                        case 8:
                                guiAdministrador.removerCliente();
                                break;
                        case 9:
                                guiAdministrador.listarCliente();
                                break;
                        case 10:
                                guiAdministrador.analisarPedido();
                                break;
                         
			default:
				return;
			}
		} while(option > 0);
    }
    
    public void showMenuGUIUsuarioPadrao(){
        int option;

        do{
            System.out.println("---------- Area Usuario Padrao----------");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Remover Cliente");
            System.out.println("3 - Listar Clientes");
            System.out.println("4 - Analisar Pedido");
			
            System.out.println("0 - Voltar");
			
            System.out.print("Opcao desejada: ");
            option = in.nextInt();
            
            switch (option) {
                case 1 :
                        guiUsuario.cadastrarCliente();
                        break;
                case 2:
                        guiUsuario.removerCliente();
                        break;
                case 3:
                        guiUsuario.listarCliente();
                        break;
                case 4:
                        guiUsuario.analisarPedido();
                        break;
                default:
                        break;
            }
        }while(option > 0);
    }
    
    public void showMenuGUIUsuarioCliente(){
        int option;

        do{
            System.out.println("---------- Area Cliente----------");
            System.out.println("1 - Cadastrar Pedido");
           
			
            System.out.println("0 - Voltar");
			
            System.out.print("Opcao desejada: ");
            option = in.nextInt();
            
            switch (option) {
                case 1 :
                        guiCliente.cadastrarPedido();
                        break;
                default:
                        break;
            }
        }while(option > 0);
    }
   

}
