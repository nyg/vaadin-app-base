package edu.self.mcl.presenter;

public class Presenter<T> {

    private T view;

    public T getView() {
        return view;
    }

    public void setView(T view) {
        this.view = view;
    }
}
