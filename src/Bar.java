public class Bar {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        Ingredient ingr1 = new Ingredient();
        Ingredient ingr2 = new Ingredient();
        Ingredient ingr3 = new Ingredient();

        drink1.name = "Diquiri";
        drink1.price = 20.5;
        drink1.isAlcoholic = true;

        drink1.ingredient1 = ingr1;
        drink1.ingredient2 = ingr2;
        drink1.ingredient3 = ingr3;

        ingr1.name = "Rum";
        ingr1.amount = 50;
        ingr2.name = "Sok z limonki";
        ingr2.amount = 30;
        ingr3.name = "Syrop cukrowy";
        ingr3.amount = 30;

        double vol = ingr1.amount + ingr2.amount + ingr3.amount;

        System.out.println("Nazwa drinka: " + drink1.name);
        System.out.println("Cena drinka: " + drink1.price + "zł");
        System.out.println("Czy drink zawiera alkohol?: " + drink1.isAlcoholic);
        System.out.println("Składniki: " + drink1.ingredient1.name + ", " + drink1.ingredient2.name + ", " + drink1.ingredient3.name);
        System.out.println("Objęość drinka: " + vol + "ml");
    }
}
