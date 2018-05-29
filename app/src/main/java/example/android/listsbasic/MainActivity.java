package example.android.listsbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView itemsListView = findViewById(R.id.items_list);
        adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, android.R.id.text1,
                ListData.getInstance().getItems());

        itemsListView.setAdapter(adapter);
    }

    public void onAddButtonClick(View view)
    {
        ListData.getInstance().addItem();
        adapter.notifyDataSetChanged();
    }

    public void onClearButtonClick(View view)
    {
        ListData.getInstance().clear();
        adapter.notifyDataSetChanged();
    }

}
