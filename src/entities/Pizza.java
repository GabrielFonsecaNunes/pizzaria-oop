package entities;

import java.util.ArrayList;

public class Pizza {
	
	static int totalDeIngredientes = 0;
	
	private double preco;
	private String name;
	public ArrayList<String> lista = new ArrayList<>();
	
	public Pizza(){
	}
		
	public void setName(String name) {
		this.name = name;
	}
	
	public int quantidadeDeIngredientePorPizza(ArrayList<String> lista) {
		return lista.size();
	}
	
	public void adicionaIngridiente(String ingrediente) {
		this.lista.add(ingrediente);
		totalDeIngredientes++;
	}
	
	public double getPreco(int x) {
		if(x <= 2) {
			this.preco = 15.00;
		}
		else if(x >= 3 && x <= 5) {
			this.preco = 20.00;
		}
		else {
			this.preco = 23.00;
		}
		return preco;
	}

	public String toString() {
		System.out.print("Pizza de " + name);
		
		if(lista.size() > 1) {
			System.out.print(" com ");
			for(int i = 1; i < lista.size() - 1; i++) {
				System.out.printf("%s, ", lista.get(i));
			}
			System.out.printf("e %s", lista.get(lista.size() - 1));
		}
		
		System.out.printf(", Preço: R$ %.2f", preco);
		return "";
	}
	
	
	
}
