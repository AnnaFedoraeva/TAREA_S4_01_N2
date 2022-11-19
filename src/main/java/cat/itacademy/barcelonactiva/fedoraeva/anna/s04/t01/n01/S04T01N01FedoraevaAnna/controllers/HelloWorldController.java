package cat.itacademy.barcelonactiva.fedoraeva.anna.s04.t01.n01.S04T01N01FedoraevaAnna.controllers;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class HelloWorldController {
		
		//@GetMapping("/HelloWorld")
		@RequestMapping(value = "/HelloWorld", method = RequestMethod.GET)
		public String saluda(@RequestParam (defaultValue = "UNKNOWN") String nom) {
			return "Hola, " + nom + ". Estàs executant un projecte Maven.";
		}
		
		
		//@GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{nom}"})
		@RequestMapping(value = {"/HelloWorld2", "/HelloWorld2/{nom}"})
		public String saluda2(@PathVariable(required = false) String nom) {
			String string;
			if (nom != null) {
				string = "Hola, " + nom + ". Estàs executant un projecte Maven.";
			}else {
				string = "Hola. Estàs executant un projecte Maven.";
			}
			return string;
		}
		
		

	}


