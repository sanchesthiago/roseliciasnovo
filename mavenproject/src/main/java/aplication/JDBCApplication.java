package aplication;
import model.Cadastro;
import roselicia.dao.CadastroDao;

public class JDBCApplication {
	public static void main (String[] args) {
		CadastroDao dao = new CadastroDao();
		
		Cadastro cadastro = new Cadastro();
		cadastro.setNome(null);
		cadastro.setTelefone(null);
		dao.excluir(cadastro);
		
	}
}
