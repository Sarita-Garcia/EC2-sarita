package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Sarita  %s!";
	private static final String templates = "Sarita Garcia %s!";
	private static final String templat = "Pi72315573 %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/datos")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/id")
	public Greeting2 greeting2(@RequestParam(value = "codigo", defaultValue = "") String codigo) {
		return new Greeting2(String.format(templat, codigo));
	}

	@GetMapping("/nomcompleto")
	public Greeting3 greeting3(@RequestParam(value = "namecomp", defaultValue = "") String namecomp) {
		return new Greeting3(String.format(templates, namecomp));
	}
}