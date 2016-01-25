package org.pro.ygapi.ygcms.service.impl;

import org.pro.ygapi.ygcms.entity.WebSite;
import org.pro.ygapi.ygcms.repository.WebSiteRepository;
import org.pro.ygapi.ygcms.service.WebSiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class WebSiteServiceImpl implements WebSiteService {

	@Autowired
	private  WebSiteRepository webSiteRepository;
	
	@Override
	public String getAllWebSite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebSite getWebSiteById(String id) {
		return webSiteRepository.getOne(id);
	}

}
