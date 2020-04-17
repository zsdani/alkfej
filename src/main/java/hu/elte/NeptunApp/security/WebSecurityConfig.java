package hu.elte.NeptunApp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .cors()
                .and()
                .csrf().disable()
                .authorizeRequests()
                //.anyRequest().authenticated()
                    .antMatchers("users/*").hasRole("ADMIN")
                    .antMatchers("exams/*").hasAnyRole("USER","ADMIN")
                    .antMatchers("subjects/*").hasAnyRole("USER","ADMIN")
                .and()
                .httpBasic()
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);

    }

    @Autowired
    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("user").password("$2y$12$EXV.8bEP0vcOvOogDGtoSurSAZufiThS6jWZXyRSsRxDL7a0acidm")
                .authorities("USER")
                .and().withUser("admin").password("$2y$12$ayJfLMePpAzTSgzcPelC7ewumMdFxDap4FRoCiSImieV8ZiYw0QZ.")
                .authorities("ADMIN");
                /*
                .inMemoryAuthentication()
                .withUser("admin").password("$2y$12$60CKsVSaNhelRap/TjTVG.w2itoylb3eWILV5DPorOEOQIhGty9J6").roles("ADMIN")
                .and()
                .withUser("user").password("$2y$12$KyTi9ZWN.B5e43qXbQS9W.dPm8ff6QQ/8O7CkZu10pLHHVxuw8E5e").roles("ADMIN");

                 */
    }



    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
