package pl.training.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.user.client.ui.*;

import pl.training.client.mvp.AppActivityMapper;
import pl.training.client.mvp.PlacesHistoryMapper;
import pl.training.client.place.HelloPlace;
import pl.training.client.ui.FirstViewImpl;

public class Places implements EntryPoint {

    public void onModuleLoad() {
        ClientFactory clientFactory = GWT.create(ClientFactory.class);
        SimplePanel mainPanel = new SimplePanel();

        ActivityMapper activityMapper = new AppActivityMapper(clientFactory);
        ActivityManager activityManager = new ActivityManager(activityMapper, clientFactory.getEventBus());
        activityManager.setDisplay(mainPanel);

        PlacesHistoryMapper placesHistoryMapper = GWT.create(PlacesHistoryMapper.class);
        PlaceHistoryHandler placeHistoryHandler = new PlaceHistoryHandler(placesHistoryMapper);
        placeHistoryHandler.register(clientFactory.getPlaceController(), clientFactory.getEventBus(), new HelloPlace("Adele"));

        RootPanel.get().add(mainPanel);
        placeHistoryHandler.handleCurrentHistory();
    }
}
