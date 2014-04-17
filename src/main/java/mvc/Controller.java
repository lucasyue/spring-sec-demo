package mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		return new ModelAndView("hello-world");
	}

	@RequestMapping("/bnResolver1")
	public ModelAndView beanNameViewResolver1() {
		return new ModelAndView("bnResolver1");
	}
}
