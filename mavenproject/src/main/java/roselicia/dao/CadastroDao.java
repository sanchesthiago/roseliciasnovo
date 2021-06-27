package roselicia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
			st.close();		
		
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
		st.close();
	} catch (SQLException a) {
		a.printStackTrace();
		}
	}
	
	public void excluir(Integer codigo) {
		try {
			String sql= "DELETE FROM public.tab_cliente WHERE codigo = ? ";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setInt(1, codigo);
			st.executeUpdate();
			st.close();
					
		} catch (SQLException a) {
			a.printStackTrace();
			}
		
		
		
	}
	public List<Cadastro> listar() {
		List<Cadastro> lista = new ArrayList<Cadastro>();
		try {
			String sql = "SELECT * FROM public.tab_cliente ";
			
			PreparedStatement st = cnn.prepareStatement(sql);
			ResultSet rs =  st.executeQuery();
			while (rs.next()){
				Cadastro c = new Cadastro();
				c.setCodigo(rs.getInt("codigo"));
				c.setPfpj(rs.getString("pf_pj"));
				c.setRazaoSocial(rs.getString("razao_social"));
				c.setCpfcnpj(rs.getString("cpf_cnpj"));
				c.setTelefone1(rs.getLong("telefone1"));
				c.setTelefone2(rs.getLong("telefone2"));
				c.setEmail(rs.getString("email"));
				c.setCep(rs.getString("cep"));
				c.setEstado(rs.getString("estado"));
				c.setCidade(rs.getString("cidade"));
				c.setRua(rs.getString("rua"));
				c.setNumero(rs.getString("numero"));
				c.setComplemento(rs.getString("complemento"));
				c.setBairro(rs.getString("bairro"));
				c.setSite(rs.getString("site_instagram"));
				lista.add(c);
							
			}
				st.close();	
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return lista;	
	}	
	
	
	public Cadastro buscar(Integer codigo) {
		Cadastro c = null;
		try {
			String sql= "SELECT * FROM public.tab_cliente WHERE codigo = ?";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setInt(1, codigo);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				c = new Cadastro();
				c.setCodigo(rs.getInt("codigo"));
				c.setPfpj(rs.getString("pf_pj"));
				c.setRazaoSocial(rs.getString("razao_social"));
				c.setCpfcnpj(rs.getString("cpf_cnpj"));
				c.setTelefone1(rs.getLong("telefone1"));
				c.setTelefone2(rs.getLong("telefone2"));
				c.setEmail(rs.getString("email"));
				c.setCep(rs.getString("cep"));
				c.setEstado(rs.getString("estado"));
				c.setCidade(rs.getString("cidade"));
				c.setRua(rs.getString("rua"));
				c.setNumero(rs.getString("numero"));
				c.setComplemento(rs.getString("complemento"));
				c.setBairro(rs.getString("bairro"));
				c.setSite(rs.getString("site_instagram"));
				
				
			}
			
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  c;
	}
	public Integer buscarNome(String razaoSocial) {
		Integer codigo = null;
		try {
			String sql= "SELECT * FROM public.tab_cliente WHERE razao_social = ?";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setString(1, razaoSocial);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				codigo= rs.getInt("codigo");
				
			}

			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  codigo;
	}
	public boolean existsByNome(String razaoSocial) {
		boolean exists =false;
		try {
			String sql= "SELECT * FROM public.tab_cliente WHERE razao_social = ?";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setString(1, razaoSocial);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				exists = true;
				break;
			}
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  exists;
	}

	

	
	
	
}
