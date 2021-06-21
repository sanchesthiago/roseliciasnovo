package myapproselicias.printer;

import myapproselicias.pedido.Pedido;
import myapproselicias.pedido.PedidoItem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import myapproselicias.cadastro.Empresa;
import myapproselicias.cadastro.Cadastro;
import myapproselicias.cadastro.Endereco;

public class PrintApp {
	
		public static void imprimir(Pedido pedido) { 
			Empresa empresa = pedido.getEmpresa();
			StringBuilder sb = new StringBuilder();
			sb.append("pedido1\n");
			sb.append(cadEmpresa.getCnpj());
			
			System.out.println(sb.toString());
			
			
			
			
		}
		
}
