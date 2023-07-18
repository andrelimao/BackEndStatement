package br.com.banco.controllers;
import javax.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping('transferencias')
public class TransferenciaController {
	@Autowired
	private TrasnferenciaRepository tr;
	
@GetMapping
public List<Transferencia> mostraTransferencias{
	return tr.findAll();
}
}
