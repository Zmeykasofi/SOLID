import java.util.HashMap;
import java.util.Map;

public class Purchase {
    private final Map<String, Integer> products;
    private final Map<String, Integer> purchases = new HashMap<>(); //Пришлось избавиться от массива и прийти
    // к единообразию. Так мы избавились от Magic Number 4.

    public Purchase() {
        Range range = ProductRange.getProductRange();
        products = range.getRange();
    }

    public void addPurchase(String title, int count) {
        purchases.put(title, purchases.getOrDefault(title, 0) + count);
    } //переделываем метод добавления покупки под HashMap.

    public void printBasket() {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (Map.Entry<String, Integer> entryMap : purchases.entrySet()) {
            System.out.println("\t" + entryMap.getKey() + " " + entryMap.getValue()
                    + " шт. в сумме " + (entryMap.getValue() * products.get(entryMap.getKey()) + " руб."));
            sum += (long) entryMap.getValue() * products.get(entryMap.getKey());
        }
        System.out.println("ИТОГО: " + sum);
    } //переделываем метод печати корзины под HashMap.
}