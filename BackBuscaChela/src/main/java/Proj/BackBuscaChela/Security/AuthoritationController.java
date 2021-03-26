package Proj.BackBuscaChela.Security;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200",maxAge = 3600)
public class AuthoritationController {

	@PostMapping("/authenticate")
	public AuthenticationBean Autentificate() {
		return new AuthenticationBean("AutentificateBean");
	}

	@GetMapping(path = "/basicauth")
    public AuthenticationBean helloWorldBean() {
        //throw new RuntimeException("Some Error has Happened! Contact Support at ***-***");
        return new AuthenticationBean("You are authenticated");
    }
}