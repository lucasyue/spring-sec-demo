package cn.access;

import java.util.Collection;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.FilterInvocation;

public class UrlAccessManager implements AccessDecisionManager {

	public void decide(Authentication authentication, Object object,
			Collection<ConfigAttribute> configAttributes)
			throws AccessDeniedException, InsufficientAuthenticationException {
		String url = null;
		if (object instanceof FilterInvocation) {
			FilterInvocation fi = (FilterInvocation) object;
			url = fi.getRequestUrl();
		}
		boolean result = false;
		if (!configAttributes.isEmpty() && configAttributes.size() > 0) {
			for (ConfigAttribute cf : configAttributes) {
				if (cf != null && url.equals(cf.getAttribute())) {
					result = true;
					break;
				}
			}
		}
		if (!result) {
			throw new AccessDeniedException("access is denied");
		}
	}

	public boolean supports(ConfigAttribute attribute) {
		return true;
	}

	public boolean supports(Class<?> clazz) {
		return true;
	}

}
