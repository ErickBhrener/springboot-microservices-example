package br.com.springboot.microservices.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class CounterServiceController {
	
	private static AtomicLong count = new AtomicLong(0L);
	
	/**
	 * Pega a mensagem de configuração
	 */
	@Value(value = "${counter.prefixMessage}")
    private String prefixMessage;
	
	/**
	 * Retorna o próximo número da sequência estatica
	 * @return {@link AtomicLong}
	 */
    @GetMapping(path = "/count")
    public String getCount(){
        return prefixMessage + count.getAndIncrement();
    }
}
