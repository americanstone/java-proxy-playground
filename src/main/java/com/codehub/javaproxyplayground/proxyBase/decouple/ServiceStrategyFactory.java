package com.codehub.javaproxyplayground.proxyBase.decouple;

import com.codehub.javaproxyplayground.proxyBase.Service;

public interface ServiceStrategyFactory {
	Service realSubject(ServiceFactory factory);

	interface ServiceFactory {
		Service createInstance();
	}
}
