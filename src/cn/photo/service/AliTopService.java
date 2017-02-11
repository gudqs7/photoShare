package cn.photo.service;

import java.util.Random;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

public class AliTopService {

	private Logger logger = Logger.getLogger("Regist");

	@Test
	public void test() throws Exception {
		String msg = send("17673047212");
		System.out.println(msg);
	}

	private Random random = new Random();

	public String send(String phone) throws Exception {
		String url = "http://gw.api.taobao.com/router/rest";
		String appkey = "23632208";
		String secret = "8406bd81160ebbe3e1372c0cb951b98d";

		int randomNum = random.nextInt(9000) + 1000;
		System.out.println("our num:" + randomNum);
		TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
		req.setExtend("9999");
		req.setSmsType("normal");
		req.setSmsFreeSignName("图想");
		req.setSmsParamString("{\"code\":\"" + randomNum + "\"}");
		req.setRecNum(phone);
		req.setSmsTemplateCode("SMS_46395094");
		AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);
		logger.info("our num:" + randomNum);
		return rsp.getBody();
	}

}
