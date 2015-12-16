package pl.training.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

/**
 * Created with IntelliJ IDEA. User: szepis01 Date: 2015-12-16 Time: 12:59
 */
public class HelloPlace extends Place {

    private String name;

    public HelloPlace(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static class Tokenizer implements PlaceTokenizer<HelloPlace> {
        @Override
        public HelloPlace getPlace(String token) {
            return new HelloPlace(token);
        }

        @Override
        public String getToken(HelloPlace place) {
            return place.getName();
        }
    }
}
