package myapproselicias.cadastro;

public class Produto {
	private Integer id;
	private String titulo;
	private String descricao;
	private String codBars;
	private Double valorUnit;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCodBars() {
		return codBars;
	}
	public void setCodBars(String codBars) {
		this.codBars = codBars;
	}
	public Double getValorUnit() {
		return valorUnit;
	}
	public void setValorUnit(Double valorUnit) {
		this.valorUnit = valorUnit;
	}
	
	
}
