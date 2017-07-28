package org.postgetman.cinema.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.postgetman.cinema.app.service.*")
public class CoreContextConfiguration {

}
