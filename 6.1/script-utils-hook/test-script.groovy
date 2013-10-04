// To see the ScriptUtil code in action, navigate to the
// control panel → Server Administration → Script.
// Change the script type to Groovy and enter the following script:

myUtil = com.liferay.portal.kernel.bean.PortletBeanLocatorUtil.locate("script-utils-hook", "com.liferay.samples.ScriptUtil")

println(myUtil.operationOne())