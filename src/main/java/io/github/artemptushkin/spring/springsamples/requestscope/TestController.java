package io.github.artemptushkin.spring.springsamples.requestscope;

import java.util.function.Supplier;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class TestController {

	private final Supplier<String> headerValueProvider;

	@GetMapping("/fromHeader")
	public String valueFromYourHeader() {
		return headerValueProvider.get();
	}
}
