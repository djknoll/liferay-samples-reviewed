package com.liferay.samples;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class ScriptUtilImpl implements ScriptUtil {

	public String operationOne() {

		return "Hello out there!";
	}

	public String operationTwo(String name) {

		_log.debug("Inside of Operation Two");

		return "Hello " + name + "!";
	}

	private static Log _log = LogFactoryUtil.getLog(ScriptUtilImpl.class);

}