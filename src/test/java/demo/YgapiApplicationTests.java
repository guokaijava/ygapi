package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.pro.ygapi.YgapiApplication;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = YgapiApplication.class)
@WebAppConfiguration
public class YgapiApplicationTests {

	@Test
	public void contextLoads() {
	}

}
