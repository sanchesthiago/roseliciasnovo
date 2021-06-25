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
			String sql= "INSERT INTO public.tab_cliente (pf_pj, razao_social, cpf_cnpj, telefone1, telefone2, email, cep, estado, cidade, rua, numero, complemento, bairro, site_instagram) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setString(1, cadastro.getPfpj());
			st.setString(2, cadastro.getRazaoSocial());
			st.setString(3, cadastro.getCpfcnpj());
			st.setLong(4, cadastro.getTelefone1());
			st.setLong(5, cadastro.getTelefone2());
			st.setString(6, cadastro.getEmail());
			st.setString(7, cadastro.getCep());
			st.setString(8, cadastro.getEstado());
			st.setString(9, cadastro.getCidade());
			st.setString(10, cadastro.getRua());
			st.setString(11, cadastro.getNumero());
			st.setString(12, cadastro.getComplemento());
			st.setString(13, cadastro.getBairro());
			st.setString(14, cadastro.getSite());
			
			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//IMPLEMENTAR
	public void alterar(Cadastro cadastro) {
		try {
		String sql = "UPDATE public.tab_cliente SET pf_pj=?, razao_social=?, cpf_cnpj=?, telefone1=?, telefone2=?, email=?, cep=?, estado=?, cidade=?, rua=?, numero=?, complemento=?, bairro=?, site_instagram=? WHERE codigo=6;";
		PreparedStatement st = cnn.prepareStatement(sql);
		st.setString(1, cadastro.getPfpj());
		st.setString(2, cadastro.getRazaoSocial());
		st.setString(3, cadastro.getCpfcnpj());
		st.setLong(4, cadastro.getTelefone1());
		st.setLong(5, cadastro.getTelefone2());
		st.setString(6, cadastro.getEmail());
		st.setString(7, cadastro.getCep());
		st.setString(8, cadastro.getEstado());
		st.setString(9, cadastro.getCidade());
		st.setString(10, cadastro.getRua());
		st.setString(11, cadastro.getNumero());
		st.setString(12, cadastro.getComplemento());
		st.setString(13, cadastro.getBairro());
		st.setString(14, cadastro.getSite());				
		st.executeUpdate();
	} catch (SQLException a) {
		a.printStackTrace();
		}
	}
	public void excluir(Cadastro cadastro) {
		try {
			String sql = "DELETE FROM public.tab_cliente WHERE codigo=3;";
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
