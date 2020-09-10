package org.wrrrrrrry.evaluationteaching.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.wrrrrrrry.evaluationteaching.entity.Power;
import org.wrrrrrrry.evaluationteaching.entity.User;
import org.wrrrrrrry.evaluationteaching.mapper.UserMapper;

import java.util.List;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login/auth").permitAll()
                .defaultSuccessUrl("/login/success",true)
                .loginProcessingUrl("/login")
                .usernameParameter("username")
                .passwordParameter("password")
                .and()
            .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login/logout").permitAll()
                .and()
            .csrf().disable();
    }

    public void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(userDetailsService()).passwordEncoder(NoOpPasswordEncoder.getInstance());
    }

    @Bean
    public UserDetailsService userDetailsService(){
        return new UserDetailsService() {
            @Autowired
            UserMapper userMapper;
            @Override
            public UserDetails loadUserByUsername(String code) throws UsernameNotFoundException {
                User user = userMapper.queryUserAndAuthoritiesByCode(code);
                return new org.springframework.security.core.userdetails.User(code,user.getPassword(),true,true,true,true,translatePowerToGrantedAuthority(user.getPowers()));
            }
        };
    }

    private static List<GrantedAuthority> translatePowerToGrantedAuthority(List<Power> powers){
        return null;
    }
}
;