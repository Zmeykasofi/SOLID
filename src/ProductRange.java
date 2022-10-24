import java.util.HashMap;
import java.util.Map;

public class ProductRange implements Range { //создаём отдельный класс для ассортимента продуктов питания - Interface
    // segregation principle.
    public static final ProductRange PRODUCT_RANGE = new ProductRange();

    private static final Map<String, Integer> products = new HashMap<>() {{
        put("Хлеб", 56);
        put("Масло", 153);
        put("Колбаса", 211);
        put("Пирожок", 45);
    }}; //Open-closed principle: ассортимент отдела продуктов питания может изменять только ответственный за него.

    protected ProductRange() {
    }

    public static ProductRange getProductRange() {
        return PRODUCT_RANGE;
    }

    @Override
    public Map<String, Integer> getRange() {
        return products;
    }

    public void printProductRange() { //Single Responsibility Principle. Раз на печать выводим ассортимент, то метод
        //принадлежит классу Ассортимент.
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
    }
}
