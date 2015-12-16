package pl.training.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

import pl.training.client.ClientFactory;
import pl.training.client.Presenter;
import pl.training.client.place.GoodByePlace;
import pl.training.client.ui.SecondView;

/**
 * Created with IntelliJ IDEA. User: szepis01 Date: 2015-12-16 Time: 13:16
 */
public class GoodByeActivity extends AbstractActivity {

    private ClientFactory clientFactory;
    private String name;

    public GoodByeActivity(ClientFactory clientFactory, GoodByePlace place) {
        this.clientFactory = clientFactory;
        this.name = place.getName();
    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        final SecondView secondView = clientFactory.getSecondView();
        secondView.setName(name);
        panel.setWidget(secondView.asWidget());
    }
}
