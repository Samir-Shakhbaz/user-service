package co.codingnomads.spring.usermicroservice;

import org.springframework.context.annotation.Bean;

public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(auth -> auth
                        .antMatchers("/", "/register").permitAll()
                        .anyRequest().authenticated())
                .formLogin(login -> login.loginPage("/login").permitAll());

        return http.build();
    }

}
