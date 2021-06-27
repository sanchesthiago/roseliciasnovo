package aplication;
import java.util.List;

import model.Cadastro;
import roselicia.dao.CadastroDao;

public class JDBCApplication {
	static CadastroDao dao = new CadastroDao();
	
	public static void main (String[] args) {
		//listando();
		//Cadastrando();
		//Alterando();
		//Excluindo();
		//listando();
	
		
	}
	private static void Cadastrando() {
		CadastroDao dao = new CadastroDao();
		Cadastro cadastro = new Cadastro();
		
		cadastro.setPfpj("F");
		cadastro.setRazaoSocial("João da Esquina");
		cadastro.setCpfcnpj("38409309874");
		cadastro.setTelefone1(11958675144l);
		cadastro.setTelefone2(119586l);
		cadastro.setEmail("Xerife@gmail.com");
		cadastro.setCep("03040000");
		cadastro.setEstado("SP");
		cadastro.setCidade("São Paulo");
		cadastro.setRua("Carneiro Leao");
		cadastro.setNumero("290");
		cadastro.setComplemento("Apto 31 bloco 3");
		cadastro.setBairro("Brás");
		cadastro.setSite("www.terra.com.br");
		dao.incluir(cadastro);
	}	
	
	private static void Alterando() {
		CadastroDao dao = new CadastroDao();
		Cadastro cadastro = new Cadastro();
		
		cadastro.setPfpj("F");
		cadastro.setRazaoSocial("Xe alt 26/06");
		cadastro.setCpfcnpj("38409309874");
		cadastro.setTelefone1(11958675144l);
		cadastro.setTelefone2(119586l);
		cadastro.setEmail("Xerife@gmail.com");
		cadastro.setCep("03040000");
		cadastro.setEstado("SP");
		cadastro.setCidade("São Paulo");
		cadastro.setRua("Carneiro Leao");
		cadastro.setNumero("290");
		cadastro.setComplemento("Apto 31 bloco 3");
		cadastro.setBairro("Brás");
		cadastro.setSite("www.terra.com.br");
		dao.alterar(cadastro);		
	}
	private static void Excluindo() {
		CadastroDao dao = new CadastroDao();
		Cadastro cadastro = new Cadastro();
		//cadastro.setCodigo(2);
		dao.excluir(1);
	}
	
	private static void listando() { 
		CadastroDao dao = new CadastroDao();
		Cadastro cadastro = new Cadastro();
			
			List<Cadastro> cad =dao.listar();
			
			for(Cadastro c : cad) {
				System.out.println(String.format("Codigo:%s \nPF/PJ:%s \nRazão Social: %s \nCPF/CNPJ: %s \nTelefone1: %s \nTelefone2: %s \nE-mail: %s \nCEP: %s \nEstado: %s \nCidade: %s \nRua: %s  \nNº: %s \nComplemento: %s \nBairro: %s \nSite/Instagran: %s", c.getCodigo(), c.getPfpj(),c.getRazaoSocial(), c.getCpfcnpj(), c.getTelefone1(), c.getTelefone2(), c.getEmail(), c.getCep(), c.getEstado(), c.getCidade(), c.getRua(), c.getNumero(), c.getComplemento(), c.getBairro(), c.getSite() ));
			
				
			}
	
			}
			
				
	}
	

