package example.android.listsmvp.items;

public class ItemsPresenter implements ItemsContract.Presenter {

    ItemsContract.View itemsView;

    public ItemsPresenter(ItemsContract.View itemsView)
    {
        this.itemsView = itemsView;
        itemsView.setPresenter(this);
    }


    @Override
    public void result(int requestCode, int resultCode) {

    }

    @Override
    public void addNewItem() {

    }

    @Override
    public void loadItems() {

    }

    @Override
    public void clearItems() {

    }

    @Override
    public void start() {

    }
}
