package br.ufg.inf.fs.ctrl;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufg.inf.fs.Messages;

@RestController
@RequestMapping(value="inicio")
public class HelloWorldCtrl {
	
	@GetMapping
	public ResponseEntity<String> inicio() {
		//return "Hello World";
		String str = Messages.get("0001");
		return new ResponseEntity<String>(
				str,
				HttpStatus.OK
				);
	}
	
	@GetMapping(value="/message")
	public ResponseEntity<List<String>> mensagem(){
		List<String> retorno = Arrays.asList("Harry", "Rony", "Hermione");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Enviando uma mensagem para o Front-End");
		
		return new ResponseEntity<List<String>>(
				retorno,
				headers,
				HttpStatus.OK
				);
		
	}

}
