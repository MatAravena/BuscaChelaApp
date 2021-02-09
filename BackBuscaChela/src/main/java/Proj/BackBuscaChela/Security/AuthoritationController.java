package Proj.BackBuscaChela.Security;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200",maxAge = 3600)
public class AuthoritationController {

	
	@GetMapping("/Authentificate")
	public AuthenticationBean Autentificate() {
		return new AuthenticationBean("AutentificateBean");
	}
	
	}
