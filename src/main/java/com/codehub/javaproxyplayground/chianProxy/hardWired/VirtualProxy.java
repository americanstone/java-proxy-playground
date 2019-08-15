package com.codehub.javaproxyplayground.chianProxy.hardWired;

import com.codehub.javaproxyplayground.proxyBase.Service;
import com.codehub.javaproxyplayground.proxyBase.ServiceImpl;

import java.time.Instant;

public class VirtualProxy implements Service {
	private Service service = null;

	public VirtualProxy() {
		System.out.println("VirtualProxy" + Instant.now());
	}

	@Override
	public String work(String txt) {
		if(service == null){
			service = new ServiceImpl();
		}
		return service.work(txt);
	}
}
