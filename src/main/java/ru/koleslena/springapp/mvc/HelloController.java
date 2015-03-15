package ru.koleslena.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.koleslena.springapp.model.Model;

import javax.validation.Valid;

@Controller
//@RequestMapping("xxx")
public class HelloController {
	@RequestMapping(value = "/")
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
        model.addAttribute("mod", new Model());
		return "hello";
	}

    @RequestMapping(value = "/xx", method = RequestMethod.POST)
	public String postWelcome(@Valid Model mod, BindingResult bindingResult, ModelMap modelMap) {

        if (bindingResult.hasErrors()) {
            modelMap.addAttribute("message", "!!!!!");
            modelMap.addAttribute("mod", new Model());
            return "hello";
        }

        modelMap.addAttribute("message", mod.getHello());
        modelMap.addAttribute("mod", mod);

		return "hello";
	}
}