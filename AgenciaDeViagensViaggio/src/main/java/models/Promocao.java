package models;

public class Promocao {
	private int id;
	private String descricao;
	private double percentDesconto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPercentDesconto() {
		return percentDesconto;
	}
	public void setPercentDesconto(double percentDesconto) {
		this.percentDesconto = percentDesconto;
	}
}
