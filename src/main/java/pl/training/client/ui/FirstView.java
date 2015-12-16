package pl.training.client.ui;

import com.google.gwt.user.client.ui.IsWidget;

import pl.training.client.Presenter;

/**
 * Created with IntelliJ IDEA. User: szepis01 Date: 2015-12-16 Time: 12:43
 */
public interface FirstView extends IsWidget {
    void setName(String name);
    void setPresenter(Presenter presenter);
}
