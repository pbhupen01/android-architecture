package example.android.listsmvp.data;

import java.util.ArrayList;
import java.util.List;

import example.android.listsmvp.items.domain.Item;

public class ItemsList {

    private int counter = 1;

    private List<Item> items = new ArrayList<>();
    private static ItemsList itemsList = new ItemsList();

    private ItemsList()
    {

    }

    public static ItemsList getInstance()
    {
        return itemsList;
    }

    public void addItem()
    {
        items.add(new Item(String.format("Item %d", counter++)));
    }

    public void clear() {
        items.clear();
        counter = 1;
    }

    public List<Item> getItems()
    {
        return items;
    }
}
