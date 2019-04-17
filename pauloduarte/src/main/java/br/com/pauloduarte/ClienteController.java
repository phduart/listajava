package br.com.pauloduarte;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.pauloduarte.model.Cliente;
import br.com.pauloduarte.service.ClienteService;
import br.com.pauloduarte.service.EmailService;




@Controller
public class ClienteController {

	
	@Autowired
	private ClienteService service;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("listaclientes")
	public String listaClientes(Model model)
	{
		Iterable<Cliente> clientes = service.obterTodos();
		model.addAttribute("clientes", clientes);
		return "listaclientes";
	}
	
	
	@RequestMapping(value= "salvar", method = RequestMethod.POST)
	public String salvar(@RequestParam("nome") String nome, @RequestParam("email") String email,
			@RequestParam("cpf") String cpf, @RequestParam("plano") char plano, @RequestParam("vencimentofat") int vencimentofat,
			@RequestParam("valorplano") double valorplano, Model model)
	{
		
		Cliente novoCliente = new Cliente(nome, cpf, plano, vencimentofat, email, valorplano);  
		service.salvar(novoCliente);
		new EmailService().enviarNew(nome, email, valorplano, vencimentofat);
		Iterable<Cliente> clientes = service.obterTodos();
		model.addAttribute("clientes", clientes);
		return "listaclientes";
	}
	
	@RequestMapping(value= "cancelar", method = RequestMethod.POST)
	public String cancelar(@RequestParam("id") Long id, Model model)
	{
		Cliente cliente = service.buscar(id);
		service.remover(id);
		new EmailService().enviarDelete(cliente.getNome(), cliente.getEmail());
		Iterable<Cliente> clientes = service.obterTodos();
		model.addAttribute("clientes", clientes);
		return "listaclientes";
	}
	
	@RequestMapping(value= "remover", method = RequestMethod.POST)
	public String remover(@RequestParam("id") Long id, Model model)
	{
		service.remover(id);
		Iterable<Cliente> clientes = service.obterTodos();
		model.addAttribute("clientes", clientes);
		return "listaclientes";
	}
}
