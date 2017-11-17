package com.yonyou.cloud.itf;

import com.yonyou.cloud.mw.serv.Implement;

@Implement(value = "com.yonyou.cloud.IsolateTestImpl",singleton = true)
public interface IsolateTestItf {
	public String genTestSting(String str);

}
