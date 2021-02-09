package Proj.BackBuscaChela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//ignore uncaught org.springframework.boot.devtools.restart.SilentExceptionHandler.SilentExitException

@SpringBootApplication
public class ApiBcApplication {

	public static void main(String[] args) {
		        SpringApplication.run(ApiBcApplication.class, args);
				//try {
				//} catch (Throwable e) {
				// if(e.getClass().getName().contains("SilentExitException")) {
				//      LOGGER.debug("Spring is restarting the main thread - See spring-boot-devtools");
				//  } else {
				//     LOGGER.error("Application crashed!", e);
				//}
				//}
	}

	/*@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**");
            }
        };
    }*/
}
