package myapproselicias.pedido;

public class PedidoItem  {
	private Integer id;
	private Integer quantidade;
	private Double valorUnit;
	private Double valorTotal;
	private String titulo;
	private String descricao;
	private String codBars;
	
	
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getValorUnit() {
		return valorUnit;
	}
	public void setValorUnit(Double valorUnit) {
		this.valorUnit = valorUnit;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	

}
