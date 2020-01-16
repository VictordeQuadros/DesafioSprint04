package testes;

import java.io.FileNotFoundException;
import java.io.IOException;

import utilitarios.LidaComArquivos;

public class testaLidaComArquivos {

	public static void main(String[] args) throws IOException,  FileNotFoundException{
		
		LidaComArquivos art = new LidaComArquivos();
		
		art.LeArquivoEImprime("Pessoas.txt");

	}

}
