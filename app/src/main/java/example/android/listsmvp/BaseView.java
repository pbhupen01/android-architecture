package example.android.listsmvp;

public interface BaseView<T extends BasePresenter> {

    void setPresenter(T presenter);

}
