package myapproselicias.cadastro;

public class Empresa {
	private Integer id;
	private String razaoSocial;
	private String cnpj;
	private Long ie;
	private Long im;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Long getie() {
		return ie;
	}
	public void setie(Long ie) {
		this.ie = ie;
	}
	public Long getim() {
		return im;
	}
	public void setim(Long im) {
		this.im = im;
	}
	public static Empresa getEmpresa() {
		
		return null;
	}
	public static Empresa getPedido() {
		
		return null;
	}
	public void setCadastro(Cadastro cadEmpresa) {
		// TODO Auto-generated method stub
		
	}
	
}
