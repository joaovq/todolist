package com.sample.joao.data.type;

import java.util.ArrayList;

/**
 * Interface que representa um repositório que gerencia os dados de um {@link TypeDBModel}
 */
public interface ITypeRepository {
    /**
     * Salva uma novo {@link TypeDBModel}
     * @param type Modelo com os dados que serão salvos
     */
    void save(TypeDBModel type);

    /**
     * Atualiza um {@link TypeDBModel}
     * @param type Modelo com os dados que serão atualizados
     */
    void update(TypeDBModel type);

    /**
     * Obtém o id de um {@link TypeDBModel}
     * @return Id do {@link TypeDBModel} selecionado
     */
    long getTypeId();

    /**
     * Obtém um {@link TypeDBModel} com um determinado id
     * @param id
     * @return
     */
    TypeDBModel getType(long id);

    /**
     * Obtém todos os {@link TypeDBModel} salvos na memória local
     * @return Lista de {@link TypeDBModel}
     */
    ArrayList<TypeDBModel> getAllTypes();
}
