package pl.training.client;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;

import pl.training.client.ui.FirstView;
import pl.training.client.ui.FirstViewImpl;
import pl.training.client.ui.SecondView;
import pl.training.client.ui.SecondViewImpl;

/**
 * Created with IntelliJ IDEA. User: szepis01 Date: 2015-12-16 Time: 13:06
 */
public class ClientFactoryImpl implements ClientFactory {

    private static final EventBus EVENT_BUS = new SimpleEventBus();
    private static final PlaceController PLACE_CONTROLLER = new PlaceController(EVENT_BUS);
    private static final FirstView FIRST_VIEW = new FirstViewImpl();
    private static final SecondView SECOND_VIEW = new SecondViewImpl();

    @Override
    public EventBus getEventBus() {
        return EVENT_BUS;
    }

    @Override
    public PlaceController getPlaceController() {
        return PLACE_CONTROLLER;
    }

    @Override
    public FirstView getFirstView() {
        return FIRST_VIEW;
    }

    @Override
    public SecondView getSecondView() {
        return SECOND_VIEW;
    }
}
