package pl.training.client.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceHistoryMapper;

import pl.training.client.ClientFactory;
import pl.training.client.activity.GoodByeActivity;
import pl.training.client.activity.HelloActivity;
import pl.training.client.place.GoodByePlace;
import pl.training.client.place.HelloPlace;

/**
 * Created with IntelliJ IDEA. User: szepis01 Date: 2015-12-16 Time: 13:21
 */
public class AppActivityMapper implements ActivityMapper {

    private ClientFactory clientFactory;

    public AppActivityMapper(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public Activity getActivity(Place place) {
        if (place instanceof HelloPlace) {
            return new HelloActivity(clientFactory, (HelloPlace) place);
        } else if(place instanceof GoodByePlace) {
            return new GoodByeActivity(clientFactory, (GoodByePlace) place);
        }
        return null;
    }
}
