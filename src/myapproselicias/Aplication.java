package myapproselicias;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import myapproselicias.pedido.PedidoItem;
import myapproselicias.printer.PrintApp;
import myapproselicias.cadastro.CadCliente;
import myapproselicias.cadastro.CadEmpresa;
import myapproselicias.cadastro.CadEnd;
import myapproselicias.cadastro.Cadastro;
import myapproselicias.cadastro.Produto;
import myapproselicias.pedido.Pedido;

public class Aplication {

private static final Date Date = null;

public static void main(String[] args) {
	
	CadEmpresa empresa = new CadEmpresa();
		empresa.setId(1);
		empresa.setRazaoSocial("Roselicias LTDA");
		empresa.setCnpj("23751874000186");
		empresa.setie(999999999l);
		empresa.setim(99999999l);
	
	CadEnd endereco = new CadEnd();
		endereco.setLogradouro("Rua Carneiro Leão ");
		endereco.setNumero(290  );
		endereco.setComplemento(" Apto 31 Bloco 3 ");
		endereco.setBairro("Bras");
		endereco.setCidade(" São Paulo - SP");
	
	CadCliente cliente = new CadCliente();
		cliente.setId(1);
		cliente.setNome("Thiago");
		cliente.setCelular(11958675144l);
		cliente.setEmail("thiago.sanches@gmail.com");
		
		
	Produto pao1 = new Produto();
		pao1.setId(1);
		pao1.setTitulo("Pão 3 queijos");
		pao1.setDescricao("Pão Salgado recheado com Gorgonzola, Ricota e Requeijão");
		pao1.setValorUnit(15.00);
		pao1.setCodBars("987995945");
		
	Pedido pedido = new Pedido();
		pedido.setEmpresa(empresa);
		pedido.setId(1);		
		pedido.setValorTotal(30.00);
		pedido.setCcf("00029");
		pedido.setCco("00030");
		
		Date data = GregorianCalendar.getInstance().getTime();
		SimpleDateFormat format = new SimpleDateFormat();
	
		
	List<PedidoItem> itens = new ArrayList<>();
	PedidoItem item = new PedidoItem();
		item.setId(1);
		item.setQuantidade(2);
		item.setValorUnit(15.00);
		item.setValorTotal(item.getValorUnit() * item.getQuantidade());
		
		itens.add(item);
		
		
		/*
		System.out.println("Razão Social: " + empresa.getRazaoSocial());
		System.out.print(endereco.getLogradouro());
		System.out.print( endereco.getNumero() );
		System.out.print(endereco.getComplemento());
		System.out.print(endereco.getBairro());
		System.out.println(endereco.getCidade());
		System.out.println("CNPJ:" + empresa.getCnpj());
		System.out.println("IE:" + empresa.getiE());
		System.out.println("IM:" + empresa.getiM());
		System.out.println("----------------------------------------------------------------" );
		System.out.print(format.format(data));
		System.out.print(" CCF:" + pedido.getCcf());
		System.out.println(" CCO:" + pedido.getCco());
		System.out.println("CUPOM FISCAL");
		System.out.println("ITEM CÓDIGO DESCRIÇÃO QNT UN VL ");
		System.out.println("----------------------------------------------------------------" );*/
		
		PrintApp.imprimirPedido(empresa);
		PrintApp.imprimirPedido(endereco);
		PrintApp.imprimirPedido(pedido);
		
		
		/*for(PedidoItem i: pedido.getItens()) {
			System.out.println(i.getProduto().getTitulo() + " Valor Da Venda " + i.getValorVenda() + " Valor Total " + i.getValorTotal());
			
		}*/
	
	}
	

}
