package ma.supdeco.pedagogie.ws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import ma.supdeco.pedagogie.service.util.AuditorAwareImpl;

@Configuration
@EnableJpaAuditing
public class AuditConfig {

	@Bean
	public AuditorAware<String> auditorAware() {
		return new AuditorAwareImpl();
	}
}
