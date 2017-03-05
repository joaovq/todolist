package com.sample.joao.todolist.others;

/**
 * Handle events from outside the ui
 */
public class CallbackEvents {
    /**
     * Interface to handle a click on a dialog list
     */
    public interface ListDialog {
        /**
         * Event called when an item is clicked in a dialog
         * @param item Item which has been clicked
         */
        void onItemClicked(String item);
    }

    /**
     * Interaface to handle a click on a date picker
     */
    public interface DatePicker {
        /**
         * Event called when a date is selected by the user
         * @param date Selected date
         */
        void onDatePickerClicked(String date);
    }
}
