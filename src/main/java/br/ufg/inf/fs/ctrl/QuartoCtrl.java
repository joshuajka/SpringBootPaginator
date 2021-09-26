package br.ufg.inf.fs.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufg.inf.fs.business.QuartoBusiness;
import br.ufg.inf.fs.entities.Quarto;

@RestController
@RequestMapping(value="quartos")
public class QuartoCtrl {

	@Autowired
	private QuartoBusiness business;
	
	@GetMapping
	public ResponseEntity<List<Quarto>> findAll(){
		List<Quarto> list = business.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Quarto> findById(@PathVariable Integer id){
		Quarto retorno = business.findById(id);
		return ResponseEntity.ok(retorno);
	}
	
	@PostMapping
	public ResponseEntity<Quarto> insert(@RequestBody Quarto quarto){
		quarto = business.insert(quarto);
		return ResponseEntity.ok(quarto);
	}
	
	@PutMapping
	public ResponseEntity<Quarto> update(@RequestBody Quarto quarto){
		quarto = business.update(quarto);
		return ResponseEntity.ok(quarto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		business.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
}
