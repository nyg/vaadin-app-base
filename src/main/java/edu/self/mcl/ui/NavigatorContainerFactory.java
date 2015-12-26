package edu.self.mcl.ui;

import java.util.logging.Logger;

import javax.inject.Inject;

import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Panel;
import com.vaadin.ui.SingleComponentContainer;
import com.vaadin.ui.UI;

import edu.self.mcl.view.error.ErrorView;

/**
 * Just to avoid having the Navigator or the CDIViewProvider in MyUI.
 *
 * @author nyg
 */
public class NavigatorContainerFactory {

    private static final Logger logger = Logger.getLogger(NavigatorContainerFactory.class.getSimpleName());

    @Inject
    MyViewProvider viewProvider;

    @Inject
    ErrorView errorView;

    public SingleComponentContainer buildContainer(UI ui) {

        Panel panel = new Panel();
        panel.setSizeFull();

        MyViewProvider provider = viewProvider;
        logger.info("UI instance: " + ui);
        logger.info("Provider instance: " + provider);

        Navigator navigator = new Navigator(ui, panel);
        navigator.addProvider(provider);
        navigator.setErrorView(errorView);

        return panel;
    }
}
