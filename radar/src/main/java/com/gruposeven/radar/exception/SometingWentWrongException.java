                                                      package com.gruposeven.radar.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_GATEWAY)
public class SometingWentWrongException extends Exception {
	
	public SometingWentWrongException() {
		super("SOmething went Wrong.");
	}
}
