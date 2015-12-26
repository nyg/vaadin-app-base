package edu.self.app.presenter.click;

import java.util.logging.Logger;

import javax.inject.Inject;

import edu.self.app.business.simple.SimpleService;
import edu.self.app.presenter.Presenter;
import edu.self.app.view.click.ClickView;

public class ClickPresenter extends Presenter<ClickView> {

    private static final Logger logger = Logger.getLogger(ClickPresenter.class.getSimpleName());

    @Inject
    SimpleService simpleService;

    public int getRandomInt() {
        logger.info("Service instance: " + simpleService.hashCode());
        return simpleService.getRandomInt();
    }
}
