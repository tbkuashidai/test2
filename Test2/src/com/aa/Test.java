package com.aa;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> params =new HashMap<String, String>();
		System.out.println(HttpUtils.sendPost("http:11//116.55.227.145:8070/trade/login","username=admin&password=123456","utf-8"));
	}

}
