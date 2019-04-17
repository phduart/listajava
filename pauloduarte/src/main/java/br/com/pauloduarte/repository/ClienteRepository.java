package br.com.pauloduarte.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.pauloduarte.model.Cliente;


public interface ClienteRepository extends CrudRepository<Cliente, Long> {


}
