package converter;

public class ToNumberRoman {
	
	private static String[] numbersroman =
		{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
	
	private static int[] indoarabian =
		{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
	
	private String savethe_totalnumbroman;

	private int value;
	private String roman = "";

	//ToNumberRoman = Para Numeros Romanos
	//o mesmo é um constructor que inicializa ja convertendo o valor...
	public ToNumberRoman(int value) { 	
		this.value = value;
		for(int i = 12; i > -1; i--){
			while (value >= indoarabian[i]){	
				roman += numbersroman[i];
				value -= indoarabian[i];
					
			}
			
		}
		
	}
	
	//Get Value = Obter Valor
	//O mesmo é um getter que pega o valor já convertido...
	public String getValue() { 
		return roman;
		
	}
	
	//Set Value = Valor definido
	//o mesmo é um setter onde define o valor nao convertido...
	public void setValue(int value) { 
		this.value = value;
		
	}
	
	//Get Counted Numbers = Obter numeros contados 
	//o mesmo conta a ocorrencia de cada numero romano utilizado...
	public String getcountednumbers() { 
		savethe_totalnumbroman = "";	
	    for(int i = 0; i < roman.length(); i++) {
		    int _helpcount = 0;
	        for (int j = 0; j < roman.length(); j++) {
	            if(roman.charAt(i) == roman.charAt(j)) {
	            	_helpcount++;
	            	
	            } 
	            
	        }
	        
	        char _helptofragment = roman.charAt(i);
	        if (!savethe_totalnumbroman.contains("" + _helptofragment)) {
	            savethe_totalnumbroman += _helpcount + "(" + roman.charAt(i) + "); ";
	            
	        }
	        
	    }

		return savethe_totalnumbroman;
		
	}
	
}
