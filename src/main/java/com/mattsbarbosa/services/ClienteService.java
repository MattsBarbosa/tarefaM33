package com.mattsbarbosa.services;


import com.mattsbarbosa.dao.IClienteJpaDAO;
import com.mattsbarbosa.domain.ClienteJpa;
import com.mattsbarbosa.exceptions.DAOException;
import com.mattsbarbosa.exceptions.MaisDeUmRegistroException;
import com.mattsbarbosa.exceptions.TableException;
import com.mattsbarbosa.services.generic.GenericJpaService;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteService extends GenericJpaService<ClienteJpa, Long> implements IClienteService {
	
	//private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteJpaDAO clienteDAO) {
		super(clienteDAO);
		//this.clienteDAO = clienteDAO;
	}

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}

	@Override
	public ClienteJpa buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

//	@Override
//	public void excluir(Long cpf) {
//		clienteDAO.excluir(cpf);
//	}
//
//	@Override
//	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
//		clienteDAO.alterar(cliente);
//	}

}
