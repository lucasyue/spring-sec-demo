package cn.access;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.access.vote.AuthenticatedVoter;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

public class UrlMetaSource implements FilterInvocationSecurityMetadataSource {

	public Collection<ConfigAttribute> getAttributes(Object object)
			throws IllegalArgumentException {
		String url = null;
		if (object instanceof FilterInvocation) {
			FilterInvocation fi = (FilterInvocation) object;
			url = fi.getRequestUrl();
		}
		if (safeUrl(url)) {
			return getSafeAttributes(url);
		}
		if (loginSafeUrl(url)) {
			return getLoginSafeAttributes(url);
		}
		Map<String, Collection<ConfigAttribute>> metaDataMap = initMetaData();

		return metaDataMap.get(url);
	}

	private Collection<ConfigAttribute> getSafeAttributes(String url) {
		Collection<ConfigAttribute> caCol1 = new ArrayList<ConfigAttribute>();
		SecurityConfig attribute = new SecurityConfig(
				AuthenticatedVoter.IS_AUTHENTICATED_ANONYMOUSLY);
		caCol1.add(attribute);
		return caCol1;
	}

	private Collection<ConfigAttribute> getLoginSafeAttributes(String url) {
		Collection<ConfigAttribute> caCol1 = new ArrayList<ConfigAttribute>();
		SecurityConfig attribute = new SecurityConfig(
				AuthenticatedVoter.IS_AUTHENTICATED_FULLY);
		caCol1.add(attribute);
		return caCol1;
	}

	private boolean safeUrl(String url) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("a.jsp", "a.jsp");
		map.put("b.jsp", "b.jsp");
		return map.containsKey(url);
	}

	private boolean loginSafeUrl(String url) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("c.jsp", "c.jsp");
		map.put("d.jsp", "d.jsp");
		return map.containsKey(url);
	}

	private Map<String, Collection<ConfigAttribute>> initMetaData() {
		Map<String, Collection<ConfigAttribute>> metaDataMap = new HashMap<String, Collection<ConfigAttribute>>();

		Collection<ConfigAttribute> caCol1 = new ArrayList<ConfigAttribute>();
		SecurityConfig sc1 = new SecurityConfig("user1");
		SecurityConfig sc2 = new SecurityConfig("user2");
		SecurityConfig sc3 = new SecurityConfig("admin");
		caCol1.add(sc1);
		caCol1.add(sc2);
		caCol1.add(sc3);
		metaDataMap.put("/authorize.jsp", caCol1);

		Collection<ConfigAttribute> caCol2 = new ArrayList<ConfigAttribute>();
		SecurityConfig sc21 = new SecurityConfig("user1");
		SecurityConfig sc22 = new SecurityConfig("admin");
		caCol2.add(sc21);
		caCol2.add(sc22);
		metaDataMap.put("/role1.jsp", caCol2);

		Collection<ConfigAttribute> caCol3 = new ArrayList<ConfigAttribute>();
		SecurityConfig sc31 = new SecurityConfig("user2");
		SecurityConfig sc32 = new SecurityConfig("admin");
		caCol2.add(sc31);
		caCol2.add(sc32);
		metaDataMap.put("/index.jsp", caCol3);
		return metaDataMap;
	}

	public Collection<ConfigAttribute> getAllConfigAttributes() {
		return null;
	}

	public boolean supports(Class<?> clazz) {
		return true;
	}

}
