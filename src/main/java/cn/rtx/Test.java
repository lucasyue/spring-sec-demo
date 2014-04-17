package cn.rtx;

import org.junit.Assert;

import rtx.RTXSvrApi;

public class Test {
	@org.junit.Test
	public void checkUserStatus() {
		// String serverIP = "127.0.0.1";
		// int port = 6000;
		RTXSvrApi rtxSvrObj = new RTXSvrApi();
		if (rtxSvrObj.Init()) {
			// rtxSvrObj.setServerIP(serverIP);
			// rtxSvrObj.setServerPort(port);
			int rs = rtxSvrObj.userIsExist("dong");
			Assert.assertTrue(rs == 0);
			int rs2 = rtxSvrObj.userIsExist("dong1");
			Assert.assertTrue(rs2 != 0);
		}
		rtxSvrObj.UnInit();
	}

	@org.junit.Test
	public void sendNotify() {
		RTXSvrApi rtxSvrObj = new RTXSvrApi();
		if (rtxSvrObj.Init()) {
			int rs3 = rtxSvrObj
					.sendNotify(
							"dong",
							"title",
							"hiLucas,[You have a task TODO!|http://hi.baidu.com/wicom]",
							"0", "0");
			Assert.assertTrue(rs3 == 0);
		}
		rtxSvrObj.UnInit();
	}
}
