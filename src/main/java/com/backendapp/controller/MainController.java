package com.backendapp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendapp.model.Producto;
import com.backendapp.repository.ProductRepository;
import com.backendapp.responses.Response;
import com.backendapp.responses.ResponseAdd;

@RestController
@RequestMapping("/api")
public class MainController {

	@Autowired
	private ProductRepository productRepository;

	@GetMapping("/hello")
	public String hello() {
		return "hola bebe";
	}

	@PostMapping("/add-product")
	public ResponseAdd add(@Valid @RequestBody Producto product) {

		productRepository.save(product);
		ResponseAdd response = new ResponseAdd();
		response.setMessage("Registrado correctamente");
		return response;
	}

	@GetMapping("/getall")
	public List<Producto> getAll() {

		List<Producto> producto = productRepository.findAll();
		return producto;

	}

	@GetMapping("/getById/{key}")
	public Response getById(@PathVariable(value = "key") Long key) {

		Response response = new Response();
		Optional<Producto> product = productRepository.findById(key);

		if (productRepository.existsById(key)) {

			response.setProducto(product);
			response.setCode(200);

		} else {
			response.setCode(205);
			response.setMessage("Producto no encontrado con el codigo " + key);
		}

		return response;
	}

	@GetMapping("/delete/{key}")
	public Map<String, Boolean> delete(@PathVariable(value = "key") Long key) {

		Map<String, Boolean> response = new HashMap<String, Boolean>();
		if (productRepository.existsById(key)) {
			productRepository.deleteById(key);
			response.put("Eliminado correctamente",Boolean.TRUE);
			return response;
		} else {
			response.put("No encontrado",Boolean.FALSE);
			return response; 
		}

		
	}
}
