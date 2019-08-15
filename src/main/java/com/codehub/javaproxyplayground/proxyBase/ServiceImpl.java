package com.codehub.javaproxyplayground.proxyBase;

import com.codehub.javaproxyplayground.proxyBase.Service;

public class ServiceImpl implements Service {

	@Override
	public String work(String txt) {
		return "ServiceImpl - " + txt;
	}
}
