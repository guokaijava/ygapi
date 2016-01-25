package org.pro.ygapi.ygcms.controller;

import org.pro.ygapi.util.JsonUtil;
import org.pro.ygapi.ygcms.entity.WebSite;
import org.pro.ygapi.ygcms.service.WebSiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class WebSiteController {

	@Autowired
	private WebSiteService webSiteService;

	@RequestMapping(value="/website/{id}",method=RequestMethod.GET)
	String home(@PathVariable String id) {
		WebSite site = webSiteService.getWebSiteById(id);
		return JsonUtil.bean2json(site);
	}

	
	
}
