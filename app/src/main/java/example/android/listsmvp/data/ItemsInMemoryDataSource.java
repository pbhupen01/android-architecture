package example.android.listsmvp.data;

import java.util.List;

import example.android.listsmvp.items.domain.Item;

public class ItemsInMemoryDataSource implements ItemsDataSource{

    private ItemsList itemsList;
    static ItemsInMemoryDataSource itemsInMemoryDataSource = new ItemsInMemoryDataSource();

    private ItemsInMemoryDataSource()
    {
        itemsList = ItemsList.getInstance();
    }

    public static ItemsInMemoryDataSource getInstance()
    {
        return itemsInMemoryDataSource;
    }


    @Override
    public void clearItems() {
        itemsList.clear();
    }

    @Override
    public void getItems(LoadItemsCallback callback) {

        List<Item> items = itemsList.getItems();
        callback.onItemsLoaded(items);
    }
}
