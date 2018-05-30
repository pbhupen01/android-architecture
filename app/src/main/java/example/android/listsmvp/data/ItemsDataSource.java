package example.android.listsmvp.data;

import java.util.List;

import example.android.listsmvp.items.domain.Item;

public interface ItemsDataSource {

    interface LoadItemsCallback {

        void onItemsLoaded(List<Item> items);
    }

    void clearItems();

    void getItems(LoadItemsCallback callback);

    void addNewItem();
}
