package roselicia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import model.Cadastro;
import roselicia.jdbc.connection.FabricaConexao;

public class CadastroDao {
	private Connection cnn;
	
	public CadastroDao() {
		FabricaConexao fc = new FabricaConexao();
		cnn = fc.criarConexao();
	}
	public void incluir(Cadastro cadastro) {
		try {
			String sql= "INSERT INTO public.tab_cadastro (nome,telefone) VALUES (?,?);";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setString(1, cadastro.getNome());
			st.setLong(2, cadastro.getTelefone());
			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//IMPLEMENTAR
	public void alterar(Cadastro cadastro) {
		try {
		String sql = "UPDATE public.tab_cadastro SET nome=?, telefone =? WHERE id=3;";
		PreparedStatement st = cnn.prepareStatement(sql);
		st.setString(1, cadastro.getNome());
		st.setLong(2, cadastro.getTelefone());				
		st.executeUpdate();
	} catch (SQLException a) {
		a.printStackTrace();
		}
	}
	public void excluir(Cadastro cadastro) {
		try {
			String sql = "DELETE FROM public.tab_cadastro WHERE id=4;";
			PreparedStatement st = cnn.prepareStatement(sql);
		
			st.executeUpdate();
		} catch (SQLException a) {
			a.printStackTrace();
			}
		
		
		
	}
	public List<Cadastro> listar() {
		return null;
	}
	public Cadastro buscar() {
		return null;
	}
	
	
}
