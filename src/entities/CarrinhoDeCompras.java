package entities;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	private double total;
	public ArrayList<Pizza> itensNoCarrinho = new ArrayList<>();
	
	public CarrinhoDeCompras() {
	}
	
	public void adicionaItemCarinho(Pizza obj) {
		if(obj.lista.size() != 0) {
			itensNoCarrinho.add(obj);
		}
	}
	
	public int quantidadeDePizzas(ArrayList<Pizza> listaDePizzas) {
		return listaDePizzas.size();
	}
	
	public double valorTotal() {
		for(int i = 0; i < itensNoCarrinho.size(); i++) {
			this.total += itensNoCarrinho.get(i).getPreco(itensNoCarrinho.get(i).lista.size()); 
		}
		
		return total;
	}
	
}
