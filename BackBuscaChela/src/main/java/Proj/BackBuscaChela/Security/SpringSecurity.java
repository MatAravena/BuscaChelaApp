package Proj.BackBuscaChela.Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurity extends WebSecurityConfigurerAdapter {
	 
		/*protected void configure(HttpSecurity http) throws Exception {
			
			 //this.logger.debug("Using default configure(HttpSecurity). "
			//		+ "If subclassed this will potentially override subclass configure(HttpSecurity).");
			
			http.csrf().disable() 
			
			 .authorizeRequests((requests) -> requests.anyRequest().authenticated()) 
			 .antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
			//http.antMatcher(HttpMethod.OPTIONS, "/**");
			
			//http.formLogin();
			 .httpBasic();
		}*/
	
		protected void configure(HttpSecurity http) throws Exception {
		        http
		        .csrf().disable()   
		        .authorizeRequests()
		        .antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
		    .anyRequest().authenticated()
		    .and()
		    //.formLogin().and()
	        .httpBasic();
		}

}
