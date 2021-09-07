package com.aique.solid.lsp.l3.coffeemachine;

public interface CoffeeMachine {
	
	CoffeeDrink brewCoffee(CoffeeSelection selection) throws CoffeeException;
}