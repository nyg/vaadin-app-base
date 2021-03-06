package edu.self.app.ui;

import com.vaadin.cdi.CDIViewProvider;

import edu.self.app.view.click.ClickView;

public class MyViewProvider extends CDIViewProvider {

    private static final long serialVersionUID = 1L;

    @Override
    public String getViewName(String viewAndParameters) {

        if (viewAndParameters.isEmpty()) {
            // basic redirection
            return super.getViewName(ClickView.VIEW_NAME);
        }

        return super.getViewName(viewAndParameters);
    }

}
