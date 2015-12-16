package pl.training.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

import pl.training.client.place.GoodByePlace;
import pl.training.client.Presenter;

/**
 * Created with IntelliJ IDEA. User: szepis01 Date: 2015-12-16 Time: 12:45
 */
public class FirstViewImpl extends Composite implements FirstView {
    private static FirstViewImplUiBinder ourUiBinder = GWT.create(FirstViewImplUiBinder.class);
    @UiField
    Anchor goodByeLink;
    @UiField
    SpanElement name;
    private Presenter presenter;

    public FirstViewImpl() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }

    @Override
    public void setName(String name) {
        this.name.setInnerText(name);
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    interface FirstViewImplUiBinder extends UiBinder<HTMLPanel, FirstViewImpl> {
    }

    @UiHandler("goodByeLink")
    void onClickGoodBye(ClickEvent clickEvent) {
        presenter.goTo(new GoodByePlace(name.getInnerText()));
    }
}