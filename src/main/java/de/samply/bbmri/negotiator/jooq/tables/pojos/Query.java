/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * query table to contain all  queries
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Query implements Serializable {

	private static final long serialVersionUID = 970373764;

	private Integer   id;
	private String    title;
	private String    text;
	private Timestamp queryCreationTime;
	private Integer   researcherId;
	private String    jsonText;
	private Integer   numAttachments;
	private String    negotiatorToken;

	public Query() {}

	public Query(Query value) {
		this.id = value.id;
		this.title = value.title;
		this.text = value.text;
		this.queryCreationTime = value.queryCreationTime;
		this.researcherId = value.researcherId;
		this.jsonText = value.jsonText;
		this.numAttachments = value.numAttachments;
		this.negotiatorToken = value.negotiatorToken;
	}

	public Query(
		Integer   id,
		String    title,
		String    text,
		Timestamp queryCreationTime,
		Integer   researcherId,
		String    jsonText,
		Integer   numAttachments,
		String    negotiatorToken
	) {
		this.id = id;
		this.title = title;
		this.text = text;
		this.queryCreationTime = queryCreationTime;
		this.researcherId = researcherId;
		this.jsonText = jsonText;
		this.numAttachments = numAttachments;
		this.negotiatorToken = negotiatorToken;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Timestamp getQueryCreationTime() {
		return this.queryCreationTime;
	}

	public void setQueryCreationTime(Timestamp queryCreationTime) {
		this.queryCreationTime = queryCreationTime;
	}

	public Integer getResearcherId() {
		return this.researcherId;
	}

	public void setResearcherId(Integer researcherId) {
		this.researcherId = researcherId;
	}

	public String getJsonText() {
		return this.jsonText;
	}

	public void setJsonText(String jsonText) {
		this.jsonText = jsonText;
	}

	public Integer getNumAttachments() {
		return this.numAttachments;
	}

	public void setNumAttachments(Integer numAttachments) {
		this.numAttachments = numAttachments;
	}

	public String getNegotiatorToken() {
		return this.negotiatorToken;
	}

	public void setNegotiatorToken(String negotiatorToken) {
		this.negotiatorToken = negotiatorToken;
	}
}
