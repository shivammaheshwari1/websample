package websample;

import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

public class calculatorTest {
	
	@Test
	 public void check() throws ServletException, IOException {
		MockHttpServletRequest req = new MockHttpServletRequest();
		MockHttpServletResponse res = new MockHttpServletResponse();
		req.addParameter("first", "2");
		req.addParameter("second", "2");
		new websample.calculator().doPost(req, res);
		System.out.println(res.getContentAsString());
				//new Project().doPost(req, res);
	    Assert.assertTrue(res.getContentAsString().contains("Sum is 4"));
		//Assert.assertEquals("yes","yes");
	}
}
