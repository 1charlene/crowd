package com.atguigu.crowd.test;

import org.junit.Test;

import com.atguigu.crowd.util.CrowdUtil;

public class StringTest {

	@Test
	public void testMd5() {
		String md5 = CrowdUtil.md5("123321");
		System.out.println(md5);
	}
}
