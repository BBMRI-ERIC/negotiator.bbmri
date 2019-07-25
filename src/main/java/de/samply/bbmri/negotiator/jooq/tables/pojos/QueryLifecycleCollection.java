/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QueryLifecycleCollection implements Serializable {

	private static final long serialVersionUID = -1345025188;

	private Integer   queryId;
	private Integer   personId;
	private Integer   biobankId;
	private String    status;
	private Timestamp lifecycleTime;

	public QueryLifecycleCollection() {}

	public QueryLifecycleCollection(QueryLifecycleCollection value) {
		this.queryId = value.queryId;
		this.personId = value.personId;
		this.biobankId = value.biobankId;
		this.status = value.status;
		this.lifecycleTime = value.lifecycleTime;
	}

	public QueryLifecycleCollection(
		Integer   queryId,
		Integer   personId,
		Integer   biobankId,
		String    status,
		Timestamp lifecycleTime
	) {
		this.queryId = queryId;
		this.personId = personId;
		this.biobankId = biobankId;
		this.status = status;
		this.lifecycleTime = lifecycleTime;
	}

	public Integer getQueryId() {
		return this.queryId;
	}

	public void setQueryId(Integer queryId) {
		this.queryId = queryId;
	}

	public Integer getPersonId() {
		return this.personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public Integer getBiobankId() {
		return this.biobankId;
	}

	public void setBiobankId(Integer biobankId) {
		this.biobankId = biobankId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getLifecycleTime() {
		return this.lifecycleTime;
	}

	public void setLifecycleTime(Timestamp lifecycleTime) {
		this.lifecycleTime = lifecycleTime;
	}
}
