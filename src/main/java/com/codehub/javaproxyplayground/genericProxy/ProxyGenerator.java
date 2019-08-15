package com.codehub.javaproxyplayground.genericProxy;

import java.lang.reflect.Proxy;

public class ProxyGenerator {
	public static <P> P makeProxy(Class<P> subject, P realSubject){
		Object proxyInstance = Proxy.newProxyInstance(
				subject.getClassLoader(),
				new Class<?>[]{subject},
				(proxy, m, args) -> m.invoke(realSubject, args)
		);
		return subject.cast(proxyInstance);
	}
}
