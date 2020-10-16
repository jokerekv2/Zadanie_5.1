public class Test {
    public static void main(String[] args) {
        Barman barman = new Barman();
        Drink drink = new Drink("Mohito", 20, true);
        barman.order(new Person("Mati", "Padamiak", 21), drink);
        barman.order(new Person("Zosia", "Mikol", 16), drink);

    }
}
