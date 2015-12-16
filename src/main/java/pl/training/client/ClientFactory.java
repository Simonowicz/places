package pl.training.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;

import pl.training.client.ui.FirstView;
import pl.training.client.ui.SecondView;

public interface ClientFactory {
    EventBus getEventBus();

    PlaceController getPlaceController();

    FirstView getFirstView();

    SecondView getSecondView();
}
