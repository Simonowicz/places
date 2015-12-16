package pl.training.client.ui;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created with IntelliJ IDEA. User: szepis01 Date: 2015-12-16 Time: 12:54
 */
public class SecondViewImpl extends Composite implements SecondView {

    private SimplePanel panel = new SimplePanel();
    private Element span = DOM.createSpan();

    public SecondViewImpl() {
        panel.getElement().appendChild(span);
        initWidget(panel);
    }

    @Override
    public void setName(String name) {
        span.setInnerText(name);
    }
}
