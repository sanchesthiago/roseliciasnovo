package myapproselicias.cadastro;

public class Empresa {
	private Integer id;
	private String razaosocial;
	private String cnpj;
	private Long ie;
	private Long im;
	private Cadastro cadastro;
	
	
	public Cadastro getCadastro() {
		return cadastro;
	}
	
	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRazaoSocial() {
		return razaosocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaosocial = razaoSocial;
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
			
}
