package com.bean2;

import org.springframework.context.annotation.Bean;

public class CDplayer {

	@Bean
	public CDplayer cdplayer() {
		return new CDplayer();
	}
}
