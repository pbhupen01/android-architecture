package example.android.listsbasic;

import java.util.ArrayList;
import java.util.List;

public class ListData {

    private int counter = 1;

    private List<String> items = new ArrayList<>();
    private static ListData listData = new ListData();

    private ListData()
    {

    }

    public static ListData getInstance()
    {
        return listData;
    }

    public void addItem()
    {
        items.add(String.format("Item %d", counter++));
    }

    public void clear() {
        items.clear();
        counter = 1;
    }

    public List<String> getItems()
    {
        return items;
    }
}
