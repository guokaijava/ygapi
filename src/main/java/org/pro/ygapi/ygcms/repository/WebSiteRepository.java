package org.pro.ygapi.ygcms.repository;

import org.pro.ygapi.ygcms.entity.WebSite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebSiteRepository extends JpaRepository<WebSite,String>,JpaSpecificationExecutor<WebSite>{

	
}
