package myapproselicias.pedido;

import java.util.Date;
import java.util.List;

import myapproselicias.cadastro.CadEmpresa;


public class Pedido {
	private Integer id;
	private Date data;
	private Double valorTotal;
	private List itens;
	private String ccf;
	private String cco;
		
	
	public String getCcf() {
		return ccf;
	}
	public void setCcf(String ccf) {
		this.ccf = ccf;
	}
	public String getCco() {
		return cco;
	}
	public void setCco(String cco) {
		this.cco = cco;
	}
	public List getItens() {
		return itens;
	}
	public void setItens(List itens) {
		this.itens = itens;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public void setEmpresa(CadEmpresa empresa) {
		
		
	}
	
	public CadEmpresa getEmpresa() {
		
		return null;
	}
	
	private static Pedido pedido() {
		
		return null;
	}
	
}