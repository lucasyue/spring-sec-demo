package cn;

import java.io.UnsupportedEncodingException;

import org.apache.tomcat.util.codec.binary.Base64;

public class Test {

	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] en = Base64.encodeBase64("张三".getBytes());
		System.out.println(new String(en));
		
		byte[] de = Base64.decodeBase64("YXNzeXJpb2xvZ3kgYXR0ZXN0IGJvcmRlcmxhbmQgYWVvbGlhbiBhc2luaW5lIGJhcnN0b3cg");
		System.out.println(new String(de,"utf-8"));
	}

	public void aa() {
		new Inner();
	}

	class Inner {

	}
}
