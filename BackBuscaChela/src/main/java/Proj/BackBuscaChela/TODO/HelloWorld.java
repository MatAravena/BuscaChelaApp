package Proj.BackBuscaChela.TODO;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	public String WelcomeWorld(){
		return "Hola po mundo ctmre";
	}
	@RequestMapping(path = "/hola")
	public String HolaMundo(){
		return "Hola po mundo ctmre";
	}

}