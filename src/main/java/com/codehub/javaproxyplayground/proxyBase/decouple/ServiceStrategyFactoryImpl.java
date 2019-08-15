package com.codehub.javaproxyplayground.proxyBase.decouple;

import com.codehub.javaproxyplayground.proxyBase.decouple.ServiceStrategyFactory;
import com.codehub.javaproxyplayground.proxyBase.Service;

public class ServiceStrategyFactoryImpl implements ServiceStrategyFactory {
	private Service realSubject;

	@Override
	public Service realSubject(final ServiceFactory factory) {
		if(realSubject == null){
			realSubject = factory.createInstance();
		}
		return realSubject;
	}
}
