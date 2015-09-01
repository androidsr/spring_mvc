package org.sr.work.system;

import java.util.Hashtable;
import java.util.Map;

public class Application {
	public static Map<String, String> loginMap = new Hashtable<String, String>();

	/**
	 * 判断是否已经登陆
	 * 
	 * @param loginName
	 *            登陆用户名
	 * @return true 已登陆，false 未登陆
	 */
	public static boolean checkLogin(String loginName) {
		String sessionId = loginMap.get(loginName);
		if (sessionId != null && !"".equals(sessionId)) {
			return true;
		}
		return false;
	}

}
