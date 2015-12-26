package edu.self.app.ui;

import javax.inject.Inject;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.cdi.CDIUI;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@CDIUI("")
@Theme("mytheme")
@Widgetset("edu.self.app.MyAppWidgetset")
public class MyUI extends UI {

    private static final long serialVersionUID = 1L;

    @Inject
    NavigatorContainerFactory navigatorContainerFactory;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        initContent();
    }

    private void initContent() {

        VerticalLayout mainLayout = new VerticalLayout(
            new Label("Welcome!"),
            navigatorContainerFactory.buildContainer(this));

        mainLayout.setHeight(100, Unit.PERCENTAGE);
        mainLayout.setExpandRatio(mainLayout.getComponent(1), 1);
        mainLayout.setMargin(true);
        mainLayout.setSpacing(true);

        setContent(mainLayout);
    }
}
