package util;

public class FormatUtil {
	public static String formatCnpj(String cnpj) {
		String textoFormatado = cnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
		return textoFormatado;
	}

public static String quebraLinha(String descricao) {
	
	
	String linhaFormatada = descricao.substring(0, 20); 
	String linhaFormatada2 = descricao.substring(20); 
	
	String tudo = String.format("%s \n%s", linhaFormatada,linhaFormatada2 );
	
	return tudo;
	}


}