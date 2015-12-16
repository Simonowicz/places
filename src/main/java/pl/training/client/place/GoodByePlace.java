package pl.training.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

/**
 * Created with IntelliJ IDEA. User: szepis01 Date: 2015-12-16 Time: 12:50
 */
public class GoodByePlace extends Place {

    private String name;

    public GoodByePlace(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static class Tokenizer implements PlaceTokenizer<GoodByePlace> {
        @Override
        public GoodByePlace getPlace(String token) {
            return new GoodByePlace(token);
        }

        @Override
        public String getToken(GoodByePlace place) {
            return place.getName();
        }
    }
}
