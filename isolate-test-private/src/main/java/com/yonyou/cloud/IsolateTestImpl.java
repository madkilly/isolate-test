package com.yonyou.cloud;

import com.yonyou.cloud.itf.IsolateTestItf;

public class IsolateTestImpl implements IsolateTestItf {
	private int i=0;
	@Override
	public String genTestSting(String str) {
		String s = "试试:" + str;
		i=i+1;
		System.out.println(i);
		return s;
	}
}
