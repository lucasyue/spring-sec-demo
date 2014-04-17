package cn.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.authority.mapping.GrantedAuthoritiesMapper;
import org.springframework.security.core.authority.mapping.NullAuthoritiesMapper;

public class FormAuthentication implements AuthenticationProvider {
	private GrantedAuthoritiesMapper authoritiesMapper = new NullAuthoritiesMapper();

	public Authentication authenticate(Authentication auth)
			throws AuthenticationException {

		UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(
				auth.getPrincipal(), auth.getCredentials(),
				authoritiesMapper.mapAuthorities(auth.getAuthorities()));
		if (auth.getPrincipal().equals("user1")) {
			Collection<SimpleGrantedAuthority> authorityCol1 = new ArrayList<SimpleGrantedAuthority>();
			SimpleGrantedAuthority role1 = new SimpleGrantedAuthority(
					"ROLE_TEST");
			authorityCol1.add(role1);
			result.setDetails(authorityCol1);
		}
		if (auth.getPrincipal().equals("admin")) {
			Collection<SimpleGrantedAuthority> authorityCol1 = new ArrayList<SimpleGrantedAuthority>();
			SimpleGrantedAuthority role1 = new SimpleGrantedAuthority(
					"ROLE_ADMIN");
			authorityCol1.add(role1);
			result.setDetails(authorityCol1);
		}
		return result;
	}

	public boolean supports(Class<?> arg0) {
		return (UsernamePasswordAuthenticationToken.class
				.isAssignableFrom(arg0));
	}

}
