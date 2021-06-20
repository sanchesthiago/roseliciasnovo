package myapproselicias.pedido;

public class PedidoItem  {
	private Integer id;
	private Integer quantidade;
	private Double valorUnit;
	private Double valorTotal;
	
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
