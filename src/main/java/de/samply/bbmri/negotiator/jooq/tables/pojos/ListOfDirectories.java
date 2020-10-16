/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * Table to store directories
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ListOfDirectories implements Serializable {

	private static final long serialVersionUID = 782410780;

	private Integer id;
	private String  name;
	private String  url;
	private String  restUrl;
	private String  username;
	private String  password;
	private String  apiUsername;
	private String  apiPassword;
	private String  resourceBiobanks;
	private String  resourceCollections;
	private String  description;
	private Boolean syncActive;
	private String  directoryPrefix;
	private String  resourceNetworks;
	private Boolean bbmriEricNationalNodes;

	public ListOfDirectories() {}

	public ListOfDirectories(ListOfDirectories value) {
		this.id = value.id;
		this.name = value.name;
		this.url = value.url;
		this.restUrl = value.restUrl;
		this.username = value.username;
		this.password = value.password;
		this.apiUsername = value.apiUsername;
		this.apiPassword = value.apiPassword;
		this.resourceBiobanks = value.resourceBiobanks;
		this.resourceCollections = value.resourceCollections;
		this.description = value.description;
		this.syncActive = value.syncActive;
		this.directoryPrefix = value.directoryPrefix;
		this.resourceNetworks = value.resourceNetworks;
		this.bbmriEricNationalNodes = value.bbmriEricNationalNodes;
	}

	public ListOfDirectories(
		Integer id,
		String  name,
		String  url,
		String  restUrl,
		String  username,
		String  password,
		String  apiUsername,
		String  apiPassword,
		String  resourceBiobanks,
		String  resourceCollections,
		String  description,
		Boolean syncActive,
		String  directoryPrefix,
		String  resourceNetworks,
		Boolean bbmriEricNationalNodes
	) {
		this.id = id;
		this.name = name;
		this.url = url;
		this.restUrl = restUrl;
		this.username = username;
		this.password = password;
		this.apiUsername = apiUsername;
		this.apiPassword = apiPassword;
		this.resourceBiobanks = resourceBiobanks;
		this.resourceCollections = resourceCollections;
		this.description = description;
		this.syncActive = syncActive;
		this.directoryPrefix = directoryPrefix;
		this.resourceNetworks = resourceNetworks;
		this.bbmriEricNationalNodes = bbmriEricNationalNodes;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRestUrl() {
		return this.restUrl;
	}

	public void setRestUrl(String restUrl) {
		this.restUrl = restUrl;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getApiUsername() {
		return this.apiUsername;
	}

	public void setApiUsername(String apiUsername) {
		this.apiUsername = apiUsername;
	}

	public String getApiPassword() {
		return this.apiPassword;
	}

	public void setApiPassword(String apiPassword) {
		this.apiPassword = apiPassword;
	}

	public String getResourceBiobanks() {
		return this.resourceBiobanks;
	}

	public void setResourceBiobanks(String resourceBiobanks) {
		this.resourceBiobanks = resourceBiobanks;
	}

	public String getResourceCollections() {
		return this.resourceCollections;
	}

	public void setResourceCollections(String resourceCollections) {
		this.resourceCollections = resourceCollections;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getSyncActive() {
		return this.syncActive;
	}

	public void setSyncActive(Boolean syncActive) {
		this.syncActive = syncActive;
	}

	public String getDirectoryPrefix() {
		return this.directoryPrefix;
	}

	public void setDirectoryPrefix(String directoryPrefix) {
		this.directoryPrefix = directoryPrefix;
	}

	public String getResourceNetworks() {
		return this.resourceNetworks;
	}

	public void setResourceNetworks(String resourceNetworks) {
		this.resourceNetworks = resourceNetworks;
	}

	public Boolean getBbmriEricNationalNodes() {
		return this.bbmriEricNationalNodes;
	}

	public void setBbmriEricNationalNodes(Boolean bbmriEricNationalNodes) {
		this.bbmriEricNationalNodes = bbmriEricNationalNodes;
	}
}
