package com.sample.joao.todolist.task;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.sample.joao.todolist.R;
import com.sample.joao.todolist.others.CallbackEvents;
import com.sample.joao.todolist.others.DateUtils;
import com.sample.joao.todolist.others.DialogsUtils;
import com.sample.joao.todolist.others.fragment.BaseFragment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Fragmento com formulário para adicionar ou atualizar uma tarefa
 */
public class AddTaskFragment extends BaseFragment<TaskPresenter> implements ITaskView,
        CallbackEvents.ListDialog, CallbackEvents.DatePicker {

    @Bind(R.id.edit_title)
    EditText editTitle;

    @Bind(R.id.edit_description)
    EditText editDescription;

    @Bind(R.id.edit_priority)
    EditText editPriority;

    @Bind(R.id.edit_end_date)
    EditText editEndDate;

    private Date endDate;

    @Override
    protected TaskPresenter createPresenter() {
        return new TaskPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_add_task;
    }

    @Override
    public void showProgress(String title, String message) {
        DialogsUtils.showProgress(getContext(),title,message);
    }

    @Override
    public void hideProgress() {
        DialogsUtils.hideProgress();
    }

    @Override
    public void showError(String error) {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public String getTitle() {
        return editTitle.getText().toString();
    }

    @Override
    public String getDescription() {
        return editDescription.getText().toString();
    }

    @Override
    public Integer getPriority() {
        String priority = editPriority.getText().toString();
        if(priority.equals(getString(R.string.item_priority_high)))
            return 1;
        else if(priority.equals(getString(R.string.item_priority_medium)))
            return 2;
        else if(priority.equals(getString(R.string.item_priority_low)))
            return 3;
        else
            return 0;

    }

    @Override
    public String getDate() {
        return editEndDate.getText().toString();
    }

    @Override
    public void saveSucessfully(Long taskId) {
        Toast toast = Toast.makeText(getContext(), "Tarefa salva com sucesso!", Toast.LENGTH_SHORT);
        toast.show();
        getActivity().onBackPressed();
    }

    @Override
    public void updateSucefully(Long taskId) {
        showMessage("Tarefa atualizada com sucesso!");
    }

    @Override
    public void onItemClicked(String item) {
        editPriority.setError(null);
        editPriority.setText(item);
    }

    @Override
    public void onDatePickerClicked(String date) {
        endDate = DateUtils.converter(date);
        editEndDate.setError(null);
        editEndDate.setText(date);
    }

    @OnClick(R.id.edit_end_date)
    public void onEditDateClicked(){
        DateUtils.showDatePicker(getContext(),this);
    }

    @OnClick(R.id.btn_save)
    public void onSaveButtonClicked(){
        String  title       = getTitle();
        Integer priority    = getPriority();
        String  date        = getDate();

        View    focusView = null;
        Boolean cancel = false;

        if(TextUtils.isEmpty(title)){
            editTitle.setError(getString(R.string.error_field_required));
            focusView = editTitle;
            cancel = true;
        } else if(priority == 0){
            editPriority.setError(getString(R.string.error_field_required));
            if(focusView == null){
                focusView = editTitle;
                cancel = true;
            }
        } else if(TextUtils.isEmpty(date)){
            editEndDate.setError(getString(R.string.error_field_required));
            if(focusView == null){
                focusView = editTitle;
                cancel = true;
            }
        }

        if(cancel)  focusView.requestFocus();
        else        presenter.saveTask();
    }

    @OnClick(R.id.edit_priority)
    public void onEditPriorityClicked(){
        List<String> priorities = new ArrayList<>();
        priorities.add(getString(R.string.item_priority_high));
        priorities.add(getString(R.string.item_priority_medium));
        priorities.add(getString(R.string.item_priority_low));

        DialogsUtils.showList(getContext(),"Prioridades",priorities,this);
    }
}
