package myapperoselicias.formatador;

public class formatador {
	
	public static String cnpj(String cnpj) {
		
	String cnpjFormatado = cnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
	
return cnpjFormatado;

	}
	}

