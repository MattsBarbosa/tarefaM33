
package com.mattsbarbosa.services;

import com.mattsbarbosa.dao.IProdutoJpaDAO;
import com.mattsbarbosa.domain.ProdutoJpa;
import com.mattsbarbosa.services.generic.GenericJpaService;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoService extends GenericJpaService<ProdutoJpa, String> implements IProdutoService {

	public ProdutoService(IProdutoJpaDAO dao) {
		super(dao);
	}

}
