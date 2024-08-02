package com.jwt.ex.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.Base64;

@Configuration
public class AppConfig {

    @Bean
    public UserDetailsService userDetailsService(){

      UserDetails userCredential1 = User.builder()
              .username("admin")
              .password(passwordEncoder().encode("root"))
              .roles("ADMIN").build();
      UserDetails userCredential2 = User.builder()
              .username("user")
              .password(passwordEncoder().encode("user"))
              .roles("USER").build();


        return new InMemoryUserDetailsManager(userCredential1,userCredential2);
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
  }
   @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }
}