public class Barman {
    public void order(Person person, Drink drink) {
        if ((person.getAge() < 18) && (drink.isAlcoholic() == true))
            System.out.println(person.getName() + ", refusal to release the drink.");
        else
            System.out.println(person.getName() + ", your order has been accepted. Price: $" + drink.getPrice());
    }
}
