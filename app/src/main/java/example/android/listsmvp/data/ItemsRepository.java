package example.android.listsmvp.data;

public class ItemsRepository implements ItemsDataSource {

    private static ItemsRepository itemsRepository = new ItemsRepository();
    private ItemsDataSource itemsDataSource;

    private ItemsRepository()
    {
        itemsDataSource = ItemsInMemoryDataSource.getInstance();
    }

    public static ItemsRepository getInstance()
    {
        return itemsRepository;
    }

    @Override
    public void clearItems() {
        itemsDataSource.clearItems();
    }

    @Override
    public void getItems(LoadItemsCallback callback) {
        itemsDataSource.getItems(callback);
    }
}
