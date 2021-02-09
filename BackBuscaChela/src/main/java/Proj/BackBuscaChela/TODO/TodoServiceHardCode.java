package Proj.BackBuscaChela.TODO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceHardCode {

	private static List<TODO> lstTodos = new ArrayList<>();
	private static int idCounter = 0 ;
	
	static {
		lstTodos.add( new TODO( ++idCounter, "Tute0", "un guapeton", new Date(), false));
		lstTodos.add( new TODO( ++idCounter, "Tute1", "Learn Java", new Date(), false));
		lstTodos.add( new TODO( ++idCounter, "Tute2", "Learn React", new Date(), false));
	}
	
	/*.add( new TODO( ++idCounter, "Tute3", "Learn Python", new Date(), false));
	lstTodos.add( new TODO( ++idCounter, "Tute4", "Learn Everything else", new Date(), false));
	lstTodos.add( new TODO( ++idCounter, "Tute4", "Learn Everything else", new Date(), false));*/
	
	public List<TODO> findAll(){
		return lstTodos;
	}

	public TODO deleteById(String username, int id) {
		TODO todo =  findById(id);
		
		if (lstTodos.remove(todo)) {
			return todo;
		} 
				
		return null;
	}

	public TODO findById(int id) {
		for (TODO todo : lstTodos) {
			if (todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}

	public TODO saveTodo(TODO todo) {
		if (todo.getId()<= 0) {
			todo.setId(++idCounter);
			todo.setUser( String.join(" ","Tute", Integer.toString(++idCounter)));
			lstTodos.add(todo);
		}else {
			deleteById(todo.getUser(), todo.getId());
			lstTodos.add(todo);
		}
		return todo;
	}
}
