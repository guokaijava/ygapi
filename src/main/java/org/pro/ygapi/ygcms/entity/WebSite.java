package org.pro.ygapi.ygcms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * 站点实体类
 * 
 * @author 郭凯
 * 
 */
@Entity
@Table(name = "cms_site")
public class WebSite implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	private String id;

	@Version
	@Column(name = "VERSION")
	private int version;

	@Column(name = "config_id")
	private int configid;

	@Column(name = "ftp_upload_id")
	private int ftpuploadid;

	@Column(name = "domain")
	private String domain;

	@Column(name = "site_path")
	private String sitepath;

	@Column(name = "site_name")
	private String sitename;

	@Column(name = "short_name")
	private String shortname;

	@Column(name = "protocol")
	private String protocol;

	@Column(name = "dynamic_suffix")
	private String dynamicsuffix;

	@Column(name = "static_suffix")
	private String staticsuffix;

	@Column(name = "static_dir")
	private String staticdir;

	@Column(name = "is_index_to_root")
	private String isindextoroot;

	@Column(name = "is_static_index")
	private String isstaticindex;

	@Column(name = "locale_admin")
	private String localeadmin;

	@Column(name = "locale_front")
	private String localefront;

	@Column(name = "tpl_solution")
	private String tplsolution;

	@Column(name = "final_step")
	private int finalstep;

	@Column(name = "after_check")
	private int aftercheck;

	@Column(name = "is_relative_path")
	private String isrelativepath;

	@Column(name = "is_recycle_on")
	private String isrecycleon;

	@Column(name = "domain_alias")
	private String domainAlias;

	@Column(name = "domain_redirect")
	private String domainredirect;

	@Column(name = "tpl_index")
	private String tplindex;

	@Column(name = "keywords")
	private String keywords;

	@Column(name = "description")
	private String description;


	public int getConfigid() {
		return configid;
	}

	public void setConfigid(int configid) {
		this.configid = configid;
	}

	public int getFtpuploadid() {
		return ftpuploadid;
	}

	public void setFtpuploadid(int ftpuploadid) {
		this.ftpuploadid = ftpuploadid;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getSitepath() {
		return sitepath;
	}

	public void setSitepath(String sitepath) {
		this.sitepath = sitepath;
	}

	public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getDynamicsuffix() {
		return dynamicsuffix;
	}

	public void setDynamicsuffix(String dynamicsuffix) {
		this.dynamicsuffix = dynamicsuffix;
	}

	public String getStaticsuffix() {
		return staticsuffix;
	}

	public void setStaticsuffix(String staticsuffix) {
		this.staticsuffix = staticsuffix;
	}

	public String getStaticdir() {
		return staticdir;
	}

	public void setStaticdir(String staticdir) {
		this.staticdir = staticdir;
	}

	public String getIsindextoroot() {
		return isindextoroot;
	}

	public void setIsindextoroot(String isindextoroot) {
		this.isindextoroot = isindextoroot;
	}

	public String getIsstaticindex() {
		return isstaticindex;
	}

	public void setIsstaticindex(String isstaticindex) {
		this.isstaticindex = isstaticindex;
	}

	public String getLocaleadmin() {
		return localeadmin;
	}

	public void setLocaleadmin(String localeadmin) {
		this.localeadmin = localeadmin;
	}

	public String getLocalefront() {
		return localefront;
	}

	public void setLocalefront(String localefront) {
		this.localefront = localefront;
	}

	public String getTplsolution() {
		return tplsolution;
	}

	public void setTplsolution(String tplsolution) {
		this.tplsolution = tplsolution;
	}

	public int getFinalstep() {
		return finalstep;
	}

	public void setFinalstep(int finalstep) {
		this.finalstep = finalstep;
	}

	public int getAftercheck() {
		return aftercheck;
	}

	public void setAftercheck(int aftercheck) {
		this.aftercheck = aftercheck;
	}

	public String getIsrelativepath() {
		return isrelativepath;
	}

	public void setIsrelativepath(String isrelativepath) {
		this.isrelativepath = isrelativepath;
	}

	public String getIsrecycleon() {
		return isrecycleon;
	}

	public void setIsrecycleon(String isrecycleon) {
		this.isrecycleon = isrecycleon;
	}

	public String getDomainAlias() {
		return domainAlias;
	}

	public void setDomainAlias(String domainAlias) {
		this.domainAlias = domainAlias;
	}

	public String getDomainredirect() {
		return domainredirect;
	}

	public void setDomainredirect(String domainredirect) {
		this.domainredirect = domainredirect;
	}

	public String getTplindex() {
		return tplindex;
	}

	public void setTplindex(String tplindex) {
		this.tplindex = tplindex;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
