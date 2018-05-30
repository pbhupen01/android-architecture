package example.android.listsmvp.items;

import java.util.List;

import example.android.listsmvp.data.ItemsDataSource;
import example.android.listsmvp.data.ItemsRepository;
import example.android.listsmvp.items.domain.Item;

public class ItemsPresenter implements ItemsContract.Presenter {

    private ItemsContract.View itemsView;
    private final ItemsRepository itemsRepository;

    public ItemsPresenter(ItemsContract.View itemsView)
    {
        this.itemsView = itemsView;
        itemsRepository = ItemsRepository.getInstance();
        itemsView.setPresenter(this);
    }

    @Override
    public void addNewItem() {
        itemsRepository.addNewItem();
        doLoadItems();
    }

    @Override
    public void loadItems() {
        doLoadItems();
    }

    @Override
    public void clearItems() {
        itemsRepository.clearItems();
        itemsView.showNoItems();
    }

    @Override
    public void start() {
        doLoadItems();
    }

    private void doLoadItems()
    {
        itemsRepository.getItems(new ItemsDataSource.LoadItemsCallback() {
            @Override
            public void onItemsLoaded(List<Item> items) {
                processItems(items);
            }
        });
    }

    private void processItems(List<Item> items)
    {
        if(items.isEmpty())
        {
            processEmptyItems();
        }
        else {
            itemsView.showItems(items);
        }
    }

    private void processEmptyItems()
    {
        itemsView.showNoItems();
    }
}
