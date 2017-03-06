package com.sample.joao.domain.features.task;

import com.sample.joao.domain.invoker.BaseInvoker;

/**
 * Invoker usado para intermediar a atualizaćão de uma tarefa no banco de dados
 */
public class UpdateTaskInvoker extends BaseInvoker<Long> {
    @Override
    public void onNext(Long aLong) {

    }
}
