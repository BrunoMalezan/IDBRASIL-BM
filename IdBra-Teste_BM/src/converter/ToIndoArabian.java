package converter;

public class ToIndoArabian {
	
	private static String numbersroman = "IXCM";
	
	private static String numbersromanwithexception = "VLD";
	
	String value;
	
	//To Indo-Arabian = Para Indo-Arabico
	//o mesmo é um constructor que inicializa chamando um conversor de valor...
	public ToIndoArabian(String value) {
		this.value = Integer.toString(toconvert(value));

	}
	
	//Get Value = Obter Valor
	//O mesmo é um getter que pega o valor já convertido...
	public String getValue() {
		return value;
		
	}

	//Set Value = Valor definido
	//o mesmo é um setter onde define o valor nao convertido...
	public void setValue(String value) {
		this.value = value;
		
	}
	
	//To Convert = Para converter
	//o mesmo converter indo-arabico para numeros romanos
	private static int toconvert(String indoarabicos) {
		int _helpsave = 0;
		double _rightrule = 0;
		for(int i = indoarabicos.length()-1; i >= 0; i--) {
			double _helpvalue = (int)toconvert(indoarabicos.charAt(i));
			double _helpprocess = ((_helpvalue + 0.5) - _rightrule);
			double _helpvalue2 = 0;
			if(_helpprocess < 0) {
				_helpvalue2 = -1;
			} else if(_helpprocess > 0) {
				_helpvalue2 = 1;
				
			} else if(_helpprocess == 0){
				_helpvalue2 = 0;
				
			} else {
				_helpvalue2 = (Double)null;
				
			}
			
			_helpsave += _helpvalue * _helpvalue2;
			_rightrule = _helpvalue;
			
		}
		
		return _helpsave;
		
	}
	
	//To Convert = Para converter
	//o mesmo converter indo-arabico para numeros romanos
	private static double toconvert(char numbroman) {		
		double _helpprocess1 = Math.pow(10, numbersroman.indexOf(numbroman));
		double _helpprocess2 = Math.pow(10, numbersromanwithexception.indexOf(numbroman));
		double _helpsave = _helpprocess1 + 5 * _helpprocess2;
		return _helpsave;
		
	}

}
