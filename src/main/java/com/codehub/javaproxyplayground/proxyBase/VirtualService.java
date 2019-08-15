package com.codehub.javaproxyplayground.proxyBase;

import com.codehub.javaproxyplayground.proxyBase.decouple.ServiceStrategyFactory;
import com.codehub.javaproxyplayground.proxyBase.Service;
import com.codehub.javaproxyplayground.proxyBase.ServiceImpl;
import com.codehub.javaproxyplayground.proxyBase.decouple.ServiceStrategyFactoryImpl;

// create the delegator later because it's expansive
public class VirtualService implements Service {
	// delegator
	//private Service service = null;

	private ServiceStrategyFactory.ServiceFactory serviceFactory = ServiceImpl::new;
	private ServiceStrategyFactory strategyFactory = new ServiceStrategyFactoryImpl();

	//	@Override
//	public String work(String txt) {
//		if(service == null){           // problem1 not thread safe & null check
//			service = new ServiceImpl();  // problem2 fixed implementation
//		}
//		return service.work(txt);
//	}


	@Override
	public String work(String txt) {
		Service service = strategyFactory.realSubject(serviceFactory);
		
		return service.work(txt);
	}
}
 // problem1 use strategy pattern -- right time to do something (create the object)

 // problem2 use factory pattern -- right way to do something (hide the creation, change the implementation at runtime)