package apk;

//baseado neste site link a baixo... foi o site de conversao mais proximo da real convers�o que achei...
//https://www.todamateria.com.br/numeros-romanos/

/*
 * author: Bruno Malezan
 * requester: ID BRASIL SISTEMAS
 * version: 1.0
 * start date: 04-05-2019
 * finish date: 06-05-2019
 * description: Codigo basico sem nenhuma aplica��o de padr�o, proxima versao pode ser usado MVC_
 * _se necessario... Os comentarios sao explicativos para melhor entendimento...
 */ 

import converter.*;

import java.util.Scanner;

public class ConsoleApk {
	
	private static Scanner key;
	private static String helpkey;
	private static ToNumberRoman numbroman;
	private static ToIndoArabian indoarabian;
	
	//main = principal
	//o mesmo inicializa com uma sauda�ao e inicia as fun�oes do programa...
	public static void main(String[] args) {
		System.out.println(">> Bem-Vindo ao novo sistema de convers�o da ID BRASIL! <<");
		System.out.println("");
		System.out.println("*** Numera��o Romana para Indo-Ar�bicos e Indo-Ar�bicos para "
				+ "Numera��o Romana ***");
		System.out.println("");
		System.out.println("!!! S�o v�lidos somente dados de valor 1 a 3999 !!!");
		
		optiontoconversion();
		
	}
	
	//option TO conversion = op�ao para conversao
	//o mesmo permite que o usuario decida as proximas fun�oes de conversao...
	private static void optiontoconversion() { 
		key = new Scanner(System.in);
		int _helpuse = 0;
		
		System.out.println("");
		System.out.println("Pressione a letra: [R] Numera��o Romana para Indo-Ar�bicos / "
				+ "[A] Indo-Ar�bicos para Numera��o Romana:"); 
		System.out.println("Pressione a letra: [E] para encerrar o programa:"); 
		
		switch(key.nextLine().toUpperCase()) {
		case "R":
			try { 
				indoarabian = new ToIndoArabian(numberroman());
				_helpuse = Integer.parseInt(indoarabian.getValue());
				if(_helpuse >= 4000) { //verifica se esta dentro do limite
					optiontoconversion();
				
				}
				
				System.out.println(_helpuse);
				System.out.println(verification(_helpuse, helpkey));
				
				optiontoconversion();
			} catch (Exception e) { //trata se nao for um numero romano
				
				System.out.println("Isto n�o � um Numero Romano!");
				
				optiontoconversion();
				
			}
			
		break;
		case "A":
			numbroman = new ToNumberRoman(intoarabian());
			
			System.out.println(numbroman.getValue());
			System.out.println("Nesta convers�o foi utilizado: " + numbroman.getcountednumbers());
			
			optiontoconversion();

		break;
		case "E":
			System.out.println("!!! Programa finalizado !!!");
			System.out.println("");
			System.out.println("> A ID BRASIL agradece a sua prefer�ncia! At� logo <");
			System.exit(0);
			
			break;
		default:
			System.out.println(cleanconsole());
			
			optiontoconversion();
			
		break;
		
		}
		
	}
	
	//into-arabian = into-arabicos
	//o mesmo verifica se esta dentro do limite e se � um numero indo-arabicos...
	private static int intoarabian() {
		int _helpkey;
		try {
			System.out.println("Insira um numero inteiro (Indo-Ar�bicos) de 1 a 3999:");
			
			_helpkey = key.nextInt();
			if(_helpkey > 0 && _helpkey < 4000) {
				return _helpkey;
				
			} else {
				optiontoconversion();
				
			}
			
		} catch (Exception E){
			System.out.println("Isto n�o � um Indo-Ar�bicos!");
			
			optiontoconversion();
			
		}

		return 0;
		
	}
	
	//number roman = Numeros Romanos
	//o mesmo verifica se � um Numero Romano...
	private static String numberroman() {
		//String _helpkey = "";
		String _thenumbersroman = "IVXLCDM";
		int i = 0;
		
		System.out.println("Insira um Numero Romano de I a MMMCMXCIX:");
		
		helpkey = key.nextLine().toUpperCase();
		for(int j = 0; j < _thenumbersroman.length(); j++) {
			char _helptofragment = _thenumbersroman.charAt(j);
			char _helptofragmentkey = helpkey.charAt(i);
			if(_helptofragment == _helptofragmentkey && i <= helpkey.length()) {
				i++;
				j = -1;
			} 
			
			if(i == helpkey.length()) {
				return helpkey;

			}
					
		}

		return null;
		
	}
	
	//clean console = limpar console
	//o mesmo server para deixar mais limpo o console, retirando acoplamentos...
	private static String cleanconsole() {
		return "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
		
	}

	//verification = Verifica�ao
	//A mesma verifica a prova real de um numero romano, se estiver errado as ordens
	//ou repeti�oes ela corrige...
	private static String verification(int value, String valuekey) {
		String _helpverification = "";
		numbroman = new ToNumberRoman(value);
		_helpverification = numbroman.getValue();
		if(_helpverification.equals(valuekey)) {	
			return "Prova real = " + _helpverification;
				
		} else {
			return "Corre��o = " + _helpverification;
					
		}
		
	}
}
