package Proj.BackBuscaChela.TODO;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller Prueba !!
@RestController
@CrossOrigin(origins="http://localhost:4200",maxAge = 3600)

public class Prueba {

	@RequestMapping(method = RequestMethod.GET,path = "/wena")
	public String Hola() {
		return "wena shusheee";
	}

	@RequestMapping(path = "/wenabean")
	public HolaBean HolaBean() {
		return new HolaBean("wena shusheee Bean !!");
	}

	@RequestMapping(path = "/wena/var/{name}")
	public HolaBean HolaBean(@PathVariable String name) {
		return new HolaBean( String.format( "wena shusheee %s", name));
	}
}
