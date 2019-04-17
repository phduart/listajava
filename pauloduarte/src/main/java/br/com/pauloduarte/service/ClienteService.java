package br.com.pauloduarte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.pauloduarte.model.Cliente;
import br.com.pauloduarte.repository.ClienteRepository;




@Service
public class ClienteService {
	
	
	@Autowired
	private ClienteRepository repository;
	
	public Iterable<Cliente> obterTodos()
	{
		Iterable<Cliente> clientes = repository.findAll();
		return clientes;
	}
	
	public void salvar(Cliente cliente)
	{
		repository.save(cliente);
	}
	
	public void remover(Long id)
	{
		repository.delete(id);
	}
	
	public Cliente buscar(Long id)
	{
		return repository.findOne(id);
	}
}
