package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.Produto;

public class Principal {

	private ArrayList <Produto> produto = new ArrayList <Produto>();
	
	public void cadastrar(String cod, String nome, String marca, String descricao, double preco){
		Produto a = new Produto();
		
		a.setCod(cod);
		a.setNome(nome);
		a.setMarca(marca);
		a.setDescricao(descricao);
		a.setPreco(preco);
		
		produto.add(a);
		
		//System.out.println("a"+ produto.get(0).getCod()+ produto.get(0).getNome());
		
	}
	
	public Produto Pesquisar(String cod){
		
		Produto a= new Produto();
	//	cadastrar(11,"n","s","ffhf",2000);
	//System.out.println("c"+produto.get(0).getCod());
		for(int i=0;i<produto.size();i++){
			//cadastrar(cod, produto.get(i).getNome(),produto.get(i).getMarca(),produto.get(i).getDescricao(),produto.get(i).getPreco());
			//System.out.println("a"+ produto.get(0).getCod()+ produto.get(0).getNome());
			if(cod.equals(produto.get(i).getCod())){
				a.setCod(cod);
				a.setNome(produto.get(i).getNome());
				a.setMarca(produto.get(i).getMarca());
				a.setDescricao(produto.get(i).getDescricao());
				a.setPreco(produto.get(i).getPreco());
				
				
				
				return a;
		}
			}
		return null;				
		
		
	}
	
	public void excluir(String cod){
		;
				for(int i=0;i<produto.size();i++){
					if(cod.equals(produto.get(i).getCod())){
						produto.get(i).setCod("");
						produto.get(i).setNome("");
						produto.get(i).setMarca("");
						produto.get(i).setDescricao("");
						produto.get(i).setPreco(000000);
						
						JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
						return;
										
						
				}
					}
				
				JOptionPane.showMessageDialog(null, "Registro não encontrado!", "", JOptionPane.ERROR_MESSAGE);
				return;

			}

}
