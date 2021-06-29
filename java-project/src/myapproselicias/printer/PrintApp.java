package myapproselicias.printer;

import myapproselicias.pedido.Pedido;
import myapproselicias.pedido.PedidoItem;
import util.FormatUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import myapproselicias.cadastro.Empresa;
import myapproselicias.cadastro.Cadastro;
import myapproselicias.cadastro.Endereco;
//import myapproselicias.formatador.Formatador;
public class PrintApp {
	
		public static String gerarCupom(Pedido pedido) { 
			Empresa empresa = pedido.getEmpresa();
			StringBuilder sb = new StringBuilder();
			sb.append(empresa.getCadastro().getRazaosocial());
			Endereco e = empresa.getCadastro().getEndereco();
			
			sb.append(String.format("\n%s- Nº%s -%s- %s -%s ", e.getLogradouro(), e.getNumero(), e.getComplemento(), e.getBairro(), e.getCidade() ));
			sb.append(String.format("\nCNPJ:%s", FormatUtil.formatCnpj(empresa.getCadastro().getCnpj()) ));
								
			sb.append(String.format("\nIE:%s ", empresa.getCadastro().getIe().toString().replaceAll( ("(\\d{3})(\\d{3})(\\d{3})"), "$1.$2.$3")));
			sb.append(String.format("\nIM:%s", empresa.getCadastro().getIm().toString().replaceAll( ("(\\d{2})(\\d{3})(\\d{3})"), "$1.$2.$3")));
			
			sb.append("\n---------------------------------------------------------------------------------\n");
			
			//SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
			//String dataFormatada = formatador.format(pedido.getData());
			
			Date d = GregorianCalendar.getInstance().getTime();
			SimpleDateFormat format = new SimpleDateFormat();
			
			sb.append(String.format("%s",format.format(d) ));
			sb.append(String.format(" CCF:%06d CCO:%06d", pedido.getCcf(), pedido.getCco() ));
			sb.append("\nCUPOM FINAL\n");
			sb.append(String.format("%-6s%-40s%12s%12s%12s\n", "ITEM", "DESCRIÇÃO", "QUANT", "R$ UNIT", "R$ TOTAL"));
			sb.append("\n---------------------------------------------------------------------------------\n");
			
			List<PedidoItem> itens = pedido.getItens();
			
			for(PedidoItem i: itens) {
				String q = String.format("%06d",i.getQuantidade()); //depois usar double
				String vu = String.format("%.2f",i.getValorUnit());
				String vt = String.format("%.2f",i.getValorTotal());
				String des = FormatUtil.quebraLinha(i.getDescricao()) ;
				
				sb.append(String.format("%03d %-40s%12s%12s%12s\n", i.getId(), des, q, vu, vt ));
				
			}
			
			System.out.println(sb.toString());
			return sb.toString();
			
			
			
	
		}
		
}
