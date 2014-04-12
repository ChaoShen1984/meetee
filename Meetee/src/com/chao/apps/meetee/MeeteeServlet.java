package com.chao.apps.meetee;

import java.io.IOException;

import javax.servlet.http.*;

import com.chao.apps.meetee.datamodel.Address;
import com.chao.apps.meetee.datastore.AddressData;
import com.chao.apps.meetee.datastore.impl.AddressImpl;
import com.chao.apps.meetee.datastore.impl.test.AddressImplTest;

@SuppressWarnings("serial")
public class MeeteeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
//		resp.setContentType("text/plain");
//		resp.getWriter().println("Hello, world");
		AddressImplTest test = new AddressImplTest();
		//test.testSave();
		test.testGet();
		
		
		
	}
}
