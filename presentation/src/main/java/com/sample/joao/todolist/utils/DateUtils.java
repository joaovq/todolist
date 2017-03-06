package com.sample.joao.todolist.utils;

import android.app.DatePickerDialog;
import android.content.Context;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Class to make interaction with date picker easier
 */
public class DateUtils {
    private static CallbackEvents.DatePicker mCallback;
    /**
     * Convert a string to a date object
     * @param sDate String's date which will be converted
     * @return Object Date
     */
    public static Date converter(String sDate){
        Date date;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = format.parse(sDate);
        } catch (Exception e) {
            format = new SimpleDateFormat("MM/yyyy");
            try {
                date = format.parse(sDate);
            } catch (ParseException e1) {
                return new Date();
            }
            return date;
        }
        return date;
    }

    /**
     * Format a date from the day, month and year
     * @param day Day of year
     * @param month Month year
     * @param year Year
     * @return String formatted into a date
     */
    public static String create(Integer day, Integer month, Integer year){
        String monthOfYear;
        if(month < 10)
            monthOfYear = "0" + month;
        else
            monthOfYear = String.valueOf(month);
        String dayOfMonth;
        if(day < 10)
            dayOfMonth = "0" + day;
        else
            dayOfMonth = String.valueOf(day);
        String data = dayOfMonth + "/" + monthOfYear + "/" + String.valueOf(year);
        return data;
    }


    /**
     * Build and show a date picker to the user
     * @param context Context from which the method was called
     * @param callback Callback used to handle the click event
     */
    public static void showDatePicker(Context context, CallbackEvents.DatePicker callback) {
        mCallback   = callback;
        Calendar c  = Calendar.getInstance();
        int year    = c.get(Calendar.YEAR);
        int month   = c.get(Calendar.MONTH);
        int day     = c.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog mDatePickerDialog = new DatePickerDialog(context, dateSetListener1, year, month, day);
        android.widget.DatePicker datePicker = mDatePickerDialog.getDatePicker();
        datePicker.setMinDate(c.getTimeInMillis());
        mDatePickerDialog.setTitle("");
        mDatePickerDialog.show();
    }
    /**
     * Method called when the date is selected
     */
    private static DatePickerDialog.OnDateSetListener dateSetListener1 = new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            String data = DateUtils.create(dayOfMonth,monthOfYear+1,year);
            mCallback.onDatePickerClicked(data);
        }
    };
}
