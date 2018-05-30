package example.android.listsmvp.items;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import example.android.listsmvp.data.ItemsList;
import example.android.listsmvp.R;

public class ItemsActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ItemsPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);

        ItemsFragment itemsFragment = (ItemsFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);

        ListView itemsListView = findViewById(R.id.items_list);
        adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, android.R.id.text1,
                ItemsList.getInstance().getItems());

        itemsListView.setAdapter(adapter);
    }

    public void onAddButtonClick(View view)
    {
        ItemsList.getInstance().addItem();
        adapter.notifyDataSetChanged();
    }

    public void onClearButtonClick(View view)
    {
        ItemsList.getInstance().clear();
        adapter.notifyDataSetChanged();
    }

}
