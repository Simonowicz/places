package pl.training.client.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

import pl.training.client.place.GoodByePlace;
import pl.training.client.place.HelloPlace;

@WithTokenizers({HelloPlace.Tokenizer.class, GoodByePlace.Tokenizer.class})
public interface PlacesHistoryMapper extends PlaceHistoryMapper {
}
