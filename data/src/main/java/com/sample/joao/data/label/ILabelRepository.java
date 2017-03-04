package com.sample.joao.data.label;

import java.util.ArrayList;

/**
 * Interface que representa um repositório que gerencia os dados de uma {@link LabelDBModel}
 */
public interface ILabelRepository {
    /**
     * Salva uma nova {@link LabelDBModel}
     * @param label Modelo com os dados que serão salvos
     */
    void save(LabelDBModel label);

    /**
     * Atualiza uma {@link LabelDBModel}
     * @param label Modelo com os dados que serão atualizados
     */
    void update(LabelDBModel label);

    /**
     * Obtém o id de uma {@link LabelDBModel}
     * @return Id da {@link LabelDBModel} selecionada
     */
    long getLabelId();

    /**
     * Obtém uma {@link LabelDBModel} com um determinado id
     * @param id
     * @return
     */
    LabelDBModel getLabel(long id);

    /**
     * Obtém todas as {@link LabelDBModel} salvas na memória local
     * @return Lista de {@link LabelDBModel}
     */
    ArrayList<LabelDBModel> getAllLabels();
}
