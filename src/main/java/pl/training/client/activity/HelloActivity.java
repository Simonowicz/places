package pl.training.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

import pl.training.client.ClientFactory;
import pl.training.client.Presenter;
import pl.training.client.place.HelloPlace;
import pl.training.client.ui.FirstView;

public class HelloActivity extends AbstractActivity implements Presenter {

    private ClientFactory clientFactory;
    private String name;

    public HelloActivity(ClientFactory clientFactory, HelloPlace place) {
        this.clientFactory = clientFactory;
        this.name = place.getName();
    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        FirstView firstView = clientFactory.getFirstView();
        firstView.setName(name);
        firstView.setPresenter(this);
        panel.setWidget(firstView.asWidget());
    }

    @Override
    public void goTo(Place place) {
        clientFactory.getPlaceController().goTo(place);
    }
}
