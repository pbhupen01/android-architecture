package example.android.listsmvp.items;

import java.util.List;

import example.android.listsmvp.BasePresenter;
import example.android.listsmvp.BaseView;
import example.android.listsmvp.items.domain.Item;

public interface ItemsContract {

    interface View extends BaseView<Presenter> {

        boolean isActive();

        void setLoadingIndicator(boolean active);

        void showItems(List<Item> tasks);

        void showNoItems();

    }

    interface Presenter extends BasePresenter {

        void result(int requestCode, int resultCode);

        void addNewItem();

        void loadItems();

        void clearItems();

    }
}