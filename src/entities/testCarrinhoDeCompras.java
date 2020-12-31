package entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class testCarrinhoDeCompras {
	
	@Test
	public void testVerificaPrecoCarrinho(){
		
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
		
		assertEquals(carrinhoDeCompras.valorTotal(), 50);
	}
	
	@Test(expected = RuntimeException.class) // É esperado uma RuntimeException
	public void testVerificaPizzaSemIngrediente() {
		Pizza p = new Pizza(); // Pizza sem ingrediente
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaPizza(p); // Adiciona pizza sem ingredientes no Carrinho
	}

}
