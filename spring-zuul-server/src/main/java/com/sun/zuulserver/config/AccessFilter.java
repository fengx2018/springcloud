package com.sun.zuulserver.config;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * @author maxiao
 *
 */
public class AccessFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();

		System.out.println("send {" + request.getMethod() + "} request to" + request.getRequestURL().toString());

		Object accessToken = request.getParameter("test");
		if (accessToken == null) {
			System.out.println("access token is empty");
			ctx.setSendZuulResponse(false);
			ctx.setResponseStatusCode(401);
			return null;
		}
		System.out.println("access token ok");
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
