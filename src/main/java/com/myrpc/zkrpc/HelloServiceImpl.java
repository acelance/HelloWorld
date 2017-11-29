package com.myrpc.zkrpc;

@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

	@Override
	public String hello(String name) {
		return "Hello\t"+name;
	}

}
