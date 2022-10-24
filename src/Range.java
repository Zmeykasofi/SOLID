import java.util.Map;

public interface Range { //добавляем интерфейс для работы с ассортиментов товаров - Interface segregation principle.
    //В ассортименте магазина могут быть как продукты, так и хозтовары. За каждый ассортимент будет отвечать свой отдел.
    Map<String, Integer> getRange();
}
