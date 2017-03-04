package com.sample.joao.common;

/**
 * Interface que representa um Mapper responsável por converter modelos de dados
 */
public interface Mapper<F, T> {
    T map(F model);
}
