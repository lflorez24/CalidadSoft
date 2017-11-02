/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Security;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author User
 */
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();

        if (("user".equals(username) && "user".equals(password))
                || ("admin".equals(username) && "admin".equals(password))) {

            return new UsernamePasswordAuthenticationToken(username, password, new ArrayList<GrantedAuthority>());
        }
        return null;
    }

    public boolean supports(Class<?> arg0) {
        return true;
    }

}
