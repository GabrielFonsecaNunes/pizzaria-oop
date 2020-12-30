package Application;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import entities.CarrinhoDeCompras;
import entities.Pizza;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, String> catalogo = new HashMap<Integer, String>();  // Cria um catalogo de ingredientes //
		
		catalogo.put(1, "Calabresa"); // Adiciona a chave 1 como ingrediente ao catalogo
		catalogo.put(2, "Portuguesa");
		catalogo.put(3, "Lombo");
		catalogo.put(4, "Muçarela");
		catalogo.put(5, "Frango");
		catalogo.put(6, "Margherita");
		catalogo.put(7, "Bacon");
		catalogo.put(8, "Atum");
		catalogo.put(9, "Tomate");
		catalogo.put(10, "4 queijos");
		
		Pizza pizza1 = new Pizza(); // Instancia pizza1 //
		pizza1.adicionaIngridiente(catalogo.get(1)); // Adiciona ingrediente do catalogo para lista de ingredientes do obj pizza1 //
		pizza1.adicionaIngridiente(catalogo.get(7)); 
		pizza1.adicionaIngridiente(catalogo.get(4)); 
				
		pizza1.setName(pizza1.lista.get(0)); /* Define o nome do obj pizza1 como o primeiro ingrediente*/
		pizza1.getPreco(pizza1.lista.size()); /*Calcula o preco do obj pizza1 */
			
		Pizza pizza2 = new Pizza(); 
		pizza2.adicionaIngridiente(catalogo.get(6));
		pizza2.adicionaIngridiente(catalogo.get(3)); 
		pizza2.adicionaIngridiente(catalogo.get(10)); 
		pizza2.adicionaIngridiente(catalogo.get(9));
		pizza2.adicionaIngridiente(catalogo.get(5));
		pizza2.adicionaIngridiente(catalogo.get(2));
				
		pizza2.setName(pizza2.lista.get(0));
		pizza2.getPreco(pizza2.lista.size());
		
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngridiente(catalogo.get(8));
		
		pizza3.setName(pizza3.lista.get(0));
		pizza3.getPreco(pizza3.lista.size());
		
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		
		c1.adicionaItemCarinho(pizza3);
		c1.adicionaItemCarinho(pizza1);
		c1.adicionaItemCarinho(pizza2);
		
		
		System.out.println("Ordem de pedidos: ");
		
		for(int i = 0; i < c1.itensNoCarrinho.size(); i++) {
			System.out.println(c1.itensNoCarrinho.get(i));
		}
		
		
		
		System.out.println("--------------------------------------------------------------------");
		System.out.printf("Valor total: R$ %.2f%n", c1.valorTotal());
		System.out.println("--------------------------------------------------------------------");
		
		for(int i = 0; i < c1.itensNoCarrinho.size(); i++) {
		System.out.println("Item " + (i+1) + " : " + String.format("%d ingredientes", c1.itensNoCarrinho.get(i).lista.size()));
		}
		sc.close();
		
	}

}
