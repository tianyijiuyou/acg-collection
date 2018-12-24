package cn.tianyi.acg.config;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AcgConfigApplication.class)
public class JasyptTest {
	@Autowired
	private StringEncryptor stringEncryptor;
	@Test
	public void encryptPwd() {
		String pwd = stringEncryptor.encrypt("TianYiGIT4444");
		System.out.println(pwd);
	}
	
	@Test
	public void decryptPwd() {
		String decrypt = stringEncryptor.decrypt("");
		System.out.println(decrypt);
	}
	
}
