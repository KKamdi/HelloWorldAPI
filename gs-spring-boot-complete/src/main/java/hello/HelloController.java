package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/helloWorld")
	public String index() {
		return "Hello World. Welcome to async Invocation";
	}

}
