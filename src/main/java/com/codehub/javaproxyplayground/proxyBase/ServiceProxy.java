package com.codehub.javaproxyplayground.proxyBase;

import com.codehub.javaproxyplayground.proxyBase.Service;
import com.codehub.javaproxyplayground.proxyBase.ServiceImpl;

public class ServiceProxy implements Service {
	private Service service = new ServiceImpl();

	public String work(String txt){
		return service.work(txt);
	}
}
