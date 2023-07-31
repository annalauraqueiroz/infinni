package Model;

public class Produto {
	
	String cod;
	String nome;
	String marca;
	String descricao;
	double preco;
	
	
	public Produto(){
		
	}


	public String getCod() {
		return cod;
	}


	public void setCod(String cod) {
		this.cod = cod;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}




}
