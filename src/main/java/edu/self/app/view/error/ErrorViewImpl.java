package edu.self.app.view.error;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

public class ErrorViewImpl extends CustomComponent implements ErrorView {

    private static final long serialVersionUID = 1L;

    @Override
    public void enter(ViewChangeEvent event) {

        Label eventLabel = new Label("ViewChangeEvent");
        eventLabel.addStyleName(ValoTheme.LABEL_BOLD);

        Label parametersLabel = new Label("Parameters: " + event.getParameters());
        Label viewNamelabel = new Label("View name: " + event.getViewName());
        Label newViewLabel = new Label("New view: " + event.getNewView());
        Label oldViewLabel = new Label("Old view: " + event.getOldView());

        ((VerticalLayout) getCompositionRoot())
            .addComponents(new Label(), eventLabel, parametersLabel, viewNamelabel, newViewLabel, oldViewLabel);
    }

    @PostConstruct
    private void postConstruct() {
        VerticalLayout layout = new VerticalLayout(new Label("The page you're looking for doesn't exists!"));
        setCompositionRoot(layout);
        layout.setMargin(true);
    }

    @Override
    public String toString() {
        return VIEW_NAME;
    }
}
