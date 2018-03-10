package initilalizer;

import config.RootConfig;
import config.WebSecurityConfig;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityWebApplicationInitializer
        extends AbstractSecurityWebApplicationInitializer {

    public SecurityWebApplicationInitializer() {
        //super(WebSecurityConfig.class, RootConfig.class);
    }
}