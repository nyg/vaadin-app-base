package edu.self.app.view.click;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.vaadin.cdi.CDIView;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import edu.self.app.presenter.click.ClickPresenter;

@CDIView(ClickView.VIEW_NAME)
public class ClickViewImpl extends CustomComponent implements ClickView {

    private static final long serialVersionUID = 1L;
    private static final Logger logger = Logger.getLogger(ClickViewImpl.class.getSimpleName());

    @Inject
    ClickPresenter presenter;

    @Override
    public void enter(ViewChangeEvent event) {}

    @PostConstruct
    private void postConstruct() {

        logger.info("Click view instance: " + super.toString());
        logger.info("Presenter instance: " + presenter);
        presenter.setView(this);

        Button button = new Button("Click me to get a random number!");

        VerticalLayout layout = new VerticalLayout(button);
        setCompositionRoot(layout);
        layout.setMargin(true);

        button.addClickListener(e -> {
            layout.addComponent(new Label("Thanks for clicking me, you got " + presenter.getRandomInt()));
        });
    }

    @Override
    public String toString() {
        return VIEW_NAME;
    }
}
