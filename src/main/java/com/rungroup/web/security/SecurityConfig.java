//package com.rungroup.web.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//        http
//                .csrf(csrf -> csrf.disable()) // Disable CSRF protection (if needed)
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/login", "/register", "/clubs", "/css/**", "/js/**")
//                        .permitAll()
//                        .anyRequest().authenticated()
//                )
//                .formLogin(form -> form
//                        .loginPage("/login")
//                        .defaultSuccessUrl("/clubs")
//                        .loginProcessingUrl("/login")
//                        .failureUrl("/login?error=true")
//                        .permitAll()
//                )
//                .logout(logout -> logout
//                        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                        .permitAll()
//                );
//
//        return http.build();
//    }
//
//}