package aplication;
import model.Cadastro;
import roselicia.dao.CadastroDao;

public class JDBCApplication {
	public static void main (String[] args) {
		CadastroDao dao = new CadastroDao();		
		Cadastro cadastro = new Cadastro();
		/*cadastro.setPfpj("P");
		cadastro.setRazaoSocial("Xerife Alterado");
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
		cadastro.setSite("www.terra.com.br");*/
		dao.excluir(cadastro);
		
	}
}
