package exercise8;

public class Exercise8PizzaParty {


    public String pizzaDivider(int numberOfPeople, int numberOfPizzas, int numberOfSlicesPerPizza) {
        int pizzaCalculator = (numberOfPizzas * numberOfSlicesPerPizza) / numberOfPeople;

        int leftOvers = leftoversCalculator(numberOfPeople, numberOfPizzas, numberOfSlicesPerPizza);


        return "Each person gets " + pizzaCalculator + " slices and there are " + leftOvers + " slices remaining.";


    }

    public int leftoversCalculator(int numberOfPeople, int numberOfPizzas, int numberOfSlicesPerPizza) {
        int leftovers = (numberOfPizzas * numberOfSlicesPerPizza) % numberOfPeople;


        return leftovers;

    }
}
