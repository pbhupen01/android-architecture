package example.android.listsmvp.items;

import android.support.v4.app.Fragment;

import java.util.List;

import example.android.listsmvp.items.domain.Item;

public class ItemsFragment extends Fragment implements ItemsContract.View{

    private ItemsContract.Presenter itemsPresenter;
    private ItemsAdapter itemsAdapter;

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public void setLoadingIndicator(boolean active) {

    }

    @Override
    public void showItems(List<Item> tasks) {

    }

    @Override
    public void showNoItems() {

    }

    @Override
    public void setPresenter(ItemsContract.Presenter presenter) {

    }
}
