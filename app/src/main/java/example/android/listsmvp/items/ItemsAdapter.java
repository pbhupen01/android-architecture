package example.android.listsmvp.items;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import example.android.listsmvp.items.domain.Item;

public class ItemsAdapter extends BaseAdapter {

    private List<Item> items;

    private void setItems(List<Item> items)
    {
        this.items = items;
    }

    public void replaceData(List<Item> items) {
        setItems(items);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return convertView;
    }
}
