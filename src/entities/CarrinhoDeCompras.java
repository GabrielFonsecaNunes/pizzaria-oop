package entities;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
	private List<Pizza> pizzas = new ArrayList<Pizza>();

	public void adicionaPizza(Pizza pizza) {
		if (pizza.temIngredientes() == false) {
			throw new RuntimeException("Nao e possivel adicionar uma pizza sem ingredientes.");
		}
		this.pizzas.add(pizza);
	}

	public int valorTotal() {
		int result = 0;
		for (int i = 0; i < this.pizzas.size(); i++) {
			result += this.pizzas.get(i).getPreco();
		}
		return result;
	}

	public void imprime() {
		System.out.println(
				"O valor total do carrinho de compras considerando todas as pizzas adicionadas é de " + valorTotal()+" reais");
	}
}
