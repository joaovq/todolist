package com.sample.joao.todolist.view;

/**
 * Base view used to define methods which must be implemented in any activity or fragment
 */
public interface IBaseView {
    /**
     * This is a general method used for showing some kind of progress during a background task. For example, this
     * method should show a progress bar and/or disable buttons before some background work starts.
     */
    void showProgress(String title, String message);

    /**
     * This is a general method used for hiding progress information after a background task finishes.
     */
    void hideProgress();

    /**
     * This method is used for showing error messages on the UI.
     *
     * @param error The error message to be displayed.
     */
    void showError(String error);

    /**
     * This method is used for showing messages on the UI.
     *
     * @param message The message to be displayed.
     */
    void showMessage(String message);
}
