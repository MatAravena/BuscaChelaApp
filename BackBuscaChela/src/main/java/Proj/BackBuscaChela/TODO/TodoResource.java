package Proj.BackBuscaChela.TODO;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@CrossOrigin(origins="http://localhost:4200",maxAge = 3600)
public class TodoResource {

	@Autowired
	private TodoServiceHardCode todoService;

	//@RequestMapping(path = "/hola")
	@GetMapping("/users/{username}/todos")
	public List<TODO>  getAllTodos(@PathVariable String username){
		return todoService.findAll();
	}

	@GetMapping("/prueba")
	public List<TODO>  getAllPruebaTodos(){
		return todoService.findAll();
	}

	@GetMapping("/users/{username}/todos/{id}")
	public TODO  getTodo(@PathVariable String username, @PathVariable int id){
		return todoService.findById(id);
	}

	@DeleteMapping("/users/{username}/todos/{id}")
	public ResponseEntity<Void>  DeleteById(@PathVariable String username,@PathVariable int id){
		if (todoService.deleteById(username, id) != null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}

	@PutMapping("/users/{username}/todos/{id}")
	public ResponseEntity<TODO> updateTodo(@PathVariable String username, @PathVariable int id, @RequestBody TODO todo){
		return new ResponseEntity<TODO>( todoService.saveTodo(todo) , HttpStatus.OK);
	}

	@PostMapping("/users/{username}/todos")
	public ResponseEntity<Void> createTodo(@PathVariable String username, @RequestBody TODO todo){
		TODO t = todoService.saveTodo(todo); 
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(t.getId()).toUri();
		return  ResponseEntity.created(uri).build();  // new ResponseEntity<Void>( t , HttpStatus.OK);
	}
}