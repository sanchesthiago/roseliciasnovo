package myapproselicias.printer;

import myapproselicias.pedido.Pedido;
import myapproselicias.pedido.PedidoItem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import myapproselicias.cadastro.CadEmpresa;
import myapproselicias.cadastro.Cadastro;
import myapproselicias.cadastro.CadEnd;

public class PrintApp {
	
		public static void imprimirPedido(CadEmpresa empresa) {
		
			CadEmpresa Cadempresa = empresa.getEmpresa();
			
		
				
		StringBuilder sb = new StringBuilder();
		
		sb.append(empresa.getRazaoSocial() + "\n");
		sb.append(String.format("CNPJ: %s \nIM: %s \nIE: %s",empresa.getCnpj(),empresa.getie(), empresa.getim()));
		System.out.println(sb.toString());		
		

}
		
		public static void imprimirPedido(CadEnd endereco) {
						
			CadEnd Cadend = endereco.getEndereco();
		
				
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("%s Nº %s %s %s %s",endereco.getLogradouro(), endereco.getNumero(), endereco.getComplemento(), endereco.getBairro(), endereco.getCidade()+ "\n"));
		sb.append("------------------------------------------------------------------\n");
	
		
		
		Date data = GregorianCalendar.getInstance().getTime();
		SimpleDateFormat format = new SimpleDateFormat();
		
		sb.append(format.format(data));
		
		
		System.out.print(sb.toString());

		}
		
		
		public static void imprimirPedido(Pedido pedido) {
			
			Pedido pedido1 = pedido();
			
		
				
		StringBuilder sb = new StringBuilder();
		
		
		sb.append(String.format(" CCF: %s  CCO: %s",pedido.getCcf(), pedido.getCco())+ "\n");
		sb.append("CUPOM FISCAL \n");
		
		sb.append("ITEM   CÓDIGO   DESCRIÇÃO   QNT. UN  VL  UNIT \n");
		sb.append("------------------------------------------------------------------\n");
		sb.append(pedido.getId());
		
		
		System.out.println(sb.toString());		
		

}

		private static Pedido pedido() {
			
			return null;
		}
}
