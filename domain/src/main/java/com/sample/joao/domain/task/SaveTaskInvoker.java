package com.sample.joao.domain.task;

import com.sample.joao.domain.others.invoker.BaseInvoker;

/**
 * Invoker usado para intermediar a criaćão de uma tarefa no banco de dados
 */
public class SaveTaskInvoker extends BaseInvoker<Long>{
    @Override
    public void onNext(Long aLong) {

    }
}
