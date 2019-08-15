package com.codehub.javaproxyplayground.chianProxy.hardWired;

import com.codehub.javaproxyplayground.proxyBase.Service;
import com.codehub.javaproxyplayground.proxyBase.VirtualService;

import java.time.Instant;

public class SecureVirtualProxy implements Service {
	private Service service = new VirtualService();

	
	public SecureVirtualProxy(){
		System.out.println("SecureVirtualProxy" + Instant.now());
	}

	@Override
	public String work(String txt) {
		if(txt.equals("hoppel")){
			return service.work(txt);
		}else {
			return "noooop";
		}
	}
}
