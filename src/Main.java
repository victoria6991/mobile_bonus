public class Main {
    public static void main(String[] args) {
        int current_balance = 100;
        int refill = 1000;
        int new_balance = current_balance + refill;
        int bonus = refill / 100;
        if (refill >= 1000) {
            System.out.println("Итоговый счёт: " + new_balance);
            System.out.println("Кол-во бонусных рублей: " + bonus);
        } else {
            System.out.println("Итоговый счёт: " + new_balance);
        }

    }
}
