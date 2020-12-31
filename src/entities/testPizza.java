package entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class testPizza extends Pizza{
	
	@Before
	public void start() {
		zeraRegristros();
	}
	
	@Test
	public void testPreco() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("calabresa");
		p.adicionaIngrediente("cebola");
		
		assertEquals(p.getPreco(), 15);
		
		p.adicionaIngrediente("cebola");
		
		assertEquals(p.getPreco(), 20);
		
		p.adicionaIngrediente("bacon");
		p.adicionaIngrediente("ovo");
		p.adicionaIngrediente("milho");
		
		assertEquals(p.getPreco(), 23);
	}
	
	@Test
	public void testRegistroIngredientes() {
		
		Pizza p = new Pizza();
		p.adicionaIngrediente("calabresa");
		p.adicionaIngrediente("cebola");
		p.adicionaIngrediente("bacon");
		p.adicionaIngrediente("ovo");
		p.adicionaIngrediente("milho");
		
		List<String> v = new ArrayList<>();
		v.add("calabresa");
		v.add("cebola");
		v.add("bacon");
		v.add("ovo");
		v.add("milho");

		assertEquals(p.getIngredientes(), v);
	}
	
	
}