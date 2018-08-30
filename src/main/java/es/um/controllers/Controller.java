package es.um.controllers;

import java.text.MessageFormat;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/${project.version}")
public class Controller {

	private Logger LOGGER = Logger.getLogger(Controller.class);
	
	@RequestMapping(value = "/generictest/{test}", method = RequestMethod.GET)
	public @ResponseBody String genericController(@PathVariable(value="test") String test) throws Exception{
		LOGGER.info(MessageFormat.format("Entrando al metoo generictest del controlador con argumento [{0}]", test));
		return "Test";
	}

}
