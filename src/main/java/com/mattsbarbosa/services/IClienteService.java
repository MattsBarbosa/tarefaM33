package com.mattsbarbosa.services;

import com.mattsbarbosa.domain.ClienteJpa;
import com.mattsbarbosa.exceptions.DAOException;
import com.mattsbarbosa.services.generic.IGenericJpaService;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteService extends IGenericJpaService<ClienteJpa, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	ClienteJpa buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
