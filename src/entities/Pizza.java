package entities;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pizza {
	public static Map<String, Integer> ingredientesGastos = new HashMap<String, Integer>();
	
	private List<String> ingredientes = new ArrayList<String>();

	public void adicionaIngrediente(String ingrediente) {
		this.ingredientes.add(ingrediente); 
		contabilizaIngrediente(ingrediente);
	}
	
	public int getPreco() {
		int numeroIngredientes = ingredientes.size();
		if (numeroIngredientes <= 2) {
			return 15;
		} else if (numeroIngredientes >= 3 && numeroIngredientes <= 5) {
			return 20;
		}
		return 23;
	}

	public static void contabilizaIngrediente(String ingrediente) {
		if (ingredientesGastos.containsKey(ingrediente)) {
			int numeroDeUsos = ingredientesGastos.get(ingrediente) + 1;
			ingredientesGastos.put(ingrediente, numeroDeUsos);
		} else {
			ingredientesGastos.put(ingrediente, 1);
		}
	}
	
	public List<String> getIngredientes() {
		return ingredientes;
	}
	
	public boolean temIngredientes() {
		return this.getIngredientes().size() > 0;
	}

	public static void imprimeQuantidadeIngredientesGastos() {
		for (String ingrediente : ingredientesGastos.keySet()) {
			Integer quantidadeGasta = ingredientesGastos.get(ingrediente);
			System.out.println("Foram gastos " + quantidadeGasta + " de " + ingrediente);
		}
	}

}
