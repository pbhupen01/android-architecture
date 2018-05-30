package example.android.listsmvp.items;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import example.android.listsmvp.data.ItemsList;
import example.android.listsmvp.R;
import example.android.listsmvp.util.ActivityUtils;

public class ItemsActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ItemsPresenter itemsPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);

        ItemsFragment itemsFragment = (ItemsFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);

        if(itemsFragment == null)
        {
            itemsFragment = ItemsFragment.newInstance();
            ActivityUtils.addFragmentToActivity( getSupportFragmentManager(), itemsFragment, R.id.contentFrame);
        }

        itemsPresenter = new ItemsPresenter(itemsFragment);

        ListView itemsListView = findViewById(R.id.items_list);

        itemsListView.setAdapter(adapter);
    }

    public void onAddButtonClick(View view)
    {
        itemsPresenter.addNewItem();
    }

    public void onClearButtonClick(View view)
    {
        itemsPresenter.clearItems();
    }
}
