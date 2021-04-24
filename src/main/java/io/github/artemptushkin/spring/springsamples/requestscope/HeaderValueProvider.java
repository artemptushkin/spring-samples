package io.github.artemptushkin.spring.springsamples.requestscope;

import java.util.function.Supplier;

import javax.servlet.http.HttpServletRequest;

import lombok.RequiredArgsConstructor;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class HeaderValueProvider implements Supplier<String> {
	private final HttpServletRequest httpServletRequest;

	@Override
	public String get() {
		return httpServletRequest.getHeader("someHeader");
	}
}
