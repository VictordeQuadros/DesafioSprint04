package utilitarios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import objetosPessoas.Pessoa;

public class LidaComArquivos {

	public void LeArquivoEImprime(String nomeArquivo) throws IOException{
		Scanner scanner = new Scanner(new File(nomeArquivo));
		
		
		 do{
		
		String linha = scanner.nextLine();
		
		Scanner linhaScanner = new Scanner(linha);
		linhaScanner.useDelimiter(";");
		
		int codigo = linhaScanner.nextInt();
		String nome = linhaScanner.next();
		String endereco = linhaScanner.next();
		int idade = linhaScanner.nextInt();
		
		String valorFormatado = String.format("Código: %d" + System.lineSeparator()
				+ "Nome: %s" + System.lineSeparator()
				+ "Endereço: %s" + System.lineSeparator()
				+ "Idade: %d" + System.lineSeparator() , codigo,nome,endereco,idade);
		System.out.println(valorFormatado);
		
		
		linhaScanner.close();
		}while(scanner.hasNextLine());
		
		scanner.close();
		
	}

	public void EscreveNoArquivo(String nomeArquivo,Pessoa Pessoa) throws IOException{
		
			BufferedWriter bw =new BufferedWriter(new FileWriter(nomeArquivo, true));
			

			bw.write(Pessoa.toString());
			bw.newLine();
			bw.close();

		
	}



	
	
	
}
