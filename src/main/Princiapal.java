package main;


import java.util.Scanner;

import objetosPessoas.Pessoa;
import utilitarios.LidaComArquivos;
import utilitarios.MenusUtilizados;

public class Princiapal {

	public static void main(String[] args) throws Exception {

				int opcao;

				Pessoa pessoa;

				Scanner sc = new Scanner(System.in);
				MenusUtilizados Menus = new MenusUtilizados();
				LidaComArquivos Arquivo = new LidaComArquivos();

				// tela de menu
				Menus.Inicial();
				do {
					Menus.Geral();
					opcao = Integer.parseInt(sc.nextLine());
					
					switch(opcao) {
					
					case 1:
						System.out.println("Digite o código:");
						int codigo = Integer.parseInt(sc.nextLine()); 
						System.out.println("Digite o nome:");
						String nome = sc.nextLine();
						System.out.println("Digite o nome:");
						String endereco = sc.nextLine();
						System.out.println("Digite o código:");
						int idade = Integer.parseInt(sc.nextLine()); 
						
						pessoa =new Pessoa(codigo, nome, endereco, idade);
						
						Arquivo.EscreveNoArquivo("Pessoas.txt", pessoa);
						System.out.println("Nova pessoa adicionada com sucesso!");
						break;
					case 2:
						System.out.println("Lista de Pessoas:");
						Arquivo.LeArquivoEImprime("Pessoas.txt");
						System.out.println("*************************************");
						break;
					case 0:
						System.out.println("Programa Encerrado");
						break;
					default:
						System.out.println("Opcao Invalida Tente Novamente");
						break;
						
					}

//					if (opcao == 1) {
//					
//						System.out.println("Digite o código:");
//						int codigo = Integer.parseInt(sc.nextLine()); 
//						System.out.println("Digite o nome:");
//						String nome = sc.nextLine();
//						System.out.println("Digite o nome:");
//						String endereco = sc.nextLine();
//						System.out.println("Digite o código:");
//						int idade = Integer.parseInt(sc.nextLine()); 
//						
//						pessoa =new Pessoa(codigo, nome, endereco, idade);
//						
//							Arquivo.EscreveNoArquivo("Pessoas.txt", pessoa);
//						
//						
//					}
//					if (opcao == 2) {
//						
//						Arquivo.LeArquivoEImprime("Pessoas.txt");
//
//
//
//					} else if (opcao > 2) {
//						System.out.println("OPÇÃO INVÁLIDA, SEU COMPUTADOR VAI EXPLODIR EM 3 2 1...!!!\n");
//						System.out.println("BRINCADEIRA!!!  REINICIE O PROGRAMA E ESCOLHA AS OPÇÕES CERTAS DESSA VEZ!!! \n");
//						break;
//					}

				} while (opcao != 0);
				sc.close();
			}
		


	}


