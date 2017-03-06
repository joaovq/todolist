package com.sample.joao.todolist.utils;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

import com.afollestad.materialdialogs.MaterialDialog;

import java.util.List;

/**
 * Set of dialogs used to give some feedback to the user
 */
public class DialogsUtils {
    private static MaterialDialog mProgress;

    /**
     * Show a progress bar
     */
    public static void showProgress(Context context, String title, String message) {
        mProgress = new MaterialDialog.Builder(context)
                .title(title)
                .content(message)
                .cancelable(false)
                .progress(true, 0)
                .show();
    }
    /**
     * Hide the progress bar
     */
    public static void hideProgress(){
        mProgress.hide();
        mProgress = null;
    }

    /**
     * Show a dialog list
     */
    public static void showList(Context context, String title, List<String> itens, final CallbackEvents.ListDialog callback){
        MaterialDialog.Builder builder = new MaterialDialog.Builder(context)
                .title(title)
                .items(itens)
                .itemsCallback(new MaterialDialog.ListCallback() {
                    @Override
                    public void onSelection(MaterialDialog dialog, View view, int which, CharSequence text) {
                        String selectedItem = text.toString();
                        callback.onItemClicked(selectedItem);
                    }
                })
                .dividerColor(Color.BLACK);
        MaterialDialog dialog = builder.build();
        dialog.show();
    }
}
