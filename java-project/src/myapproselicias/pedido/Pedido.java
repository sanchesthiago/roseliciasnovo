package myapproselicias.pedido;

import java.util.Date;
import java.util.List;
import myapproselicias.cadastro.Cadastro;
import myapproselicias.cadastro.Cliente;
import myapproselicias.cadastro.Empresa;


public class Pedido {
	private Integer id;
	private Date data;
	private Double valorTotal;
	private Cliente cliente;
	private List<PedidoItem> itens;
	private Integer ccf;
	private Integer cco;
	private Empresa empresa;
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

	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	public Integer getCcf() {
		return ccf;
	}
	public void setCcf(Integer ccf) {
		this.ccf = ccf;
	}
	public Integer getCco() {
		return cco;
	}
	public void setCco(Integer cco) {
		this.cco = cco;
	}
	public void setItens(List<PedidoItem> itens) {
		this.itens = itens;
	}
	public List<PedidoItem> getItens() {
		return itens;
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
}	
