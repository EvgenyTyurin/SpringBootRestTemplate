package evgenyt.springboot;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestConsumer {
	RestConsumer() {
		RestTemplate rest = new RestTemplate();
		// Getting object from another spring boot app
		Ingredient ingredient = 
				rest.getForObject("http://localhost:8080/ingredients/LAV", 
						Ingredient.class);
		System.out.println(ingredient.getName()); // LAVASH
	}
		
}
