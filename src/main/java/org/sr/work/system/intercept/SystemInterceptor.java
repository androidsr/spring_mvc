package org.sr.work.system.intercept;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Session;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SystemInterceptor extends HandlerInterceptorAdapter {

	public void afterCompletion(HttpServletRequest req,
			HttpServletResponse res, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("回调执行");
	}

	public void postHandle(HttpServletRequest req, HttpServletResponse res,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("调用controller后进入");
	}

	public boolean preHandle(HttpServletRequest req, HttpServletResponse res,
			Object arg2) throws Exception {
		
		System.out.println("拦截开始：");
		System.out.println("***");
		System.out.println("&&&:" + arg2.getClass().getCanonicalName());
		System.out.println(arg2.getClass().getSimpleName());
		return false;
	}

}