package com.codehub.javaproxyplayground.genericProxy;

import com.codehub.javaproxyplayground.proxyBase.Service;
import com.codehub.javaproxyplayground.proxyBase.ServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.time.Instant;

public class DynamicProxy implements Service {

	private Service proxyInstance = Service.class.cast(
			Proxy.newProxyInstance(
					Service.class.getClassLoader(),
					new Class<?>[]{Service.class},
					new InvocationHandler() {
						private final ServiceImpl service = new ServiceImpl();
						@Override
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
							return method.invoke(service, args);
						}
					}
			));

	public DynamicProxy() {
		System.out.println("VirtualProxy" + Instant.now());
	}

	@Override
	public String work(String txt) {
		return proxyInstance.work(txt);
	}
}
