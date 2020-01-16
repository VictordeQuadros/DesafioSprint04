package utilitarios;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenusUtilizados {

	public void Inicial() throws IOException{
		
		FileInputStream fis = new FileInputStream("Compasso ART ASCII");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
	}
	
	
	
	public void Geral(){
		
		System.out.println("_____________________________________");
		System.out.println("## Escolha uma das opçoes a baixo ##");
		System.out.println("Opcao 1 - Cadastra pessoas");
		System.out.println("Opcao 2 - Imprime pessoas cadastradas");
		System.out.println("Opcao 0 - Sair do programa");
		System.out.println("_____________________________________");
		System.out.println("Digite a Opção: ");
	}

}