package Application;

import entities.CarrinhoDeCompras;
import entities.Pizza;

public class Principal {

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("calabresa");
		pizza1.adicionaIngrediente("cebola");

		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("palmito");
		
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("bacon");
		pizza3.adicionaIngrediente("ovo");
		pizza3.adicionaIngrediente("milho");
		pizza3.adicionaIngrediente("cebola");
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.adicionaPizza(pizza1);
		carrinhoDeCompras.adicionaPizza(pizza2);
		carrinhoDeCompras.adicionaPizza(pizza3);
		carrinhoDeCompras.imprime();
		
		Pizza.imprimeQuantidadeIngredientesGastos();
	}

}
