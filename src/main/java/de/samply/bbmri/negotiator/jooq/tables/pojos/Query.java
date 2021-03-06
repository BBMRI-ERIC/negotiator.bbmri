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

	private static final long serialVersionUID = 1331677481;

	private Integer   id;
	private String    title;
	private String    text;
	private String    queryXml;
	private Timestamp queryCreationTime;
	private Integer   researcherId;
	private String    jsonText;
	private Integer   numAttachments;
	private String    negotiatorToken;
	private Boolean   validQuery;
	private String    requestDescription;
	private String    ethicsVote;
	private Timestamp negotiationStartedTime;
	private String    researcherName;
	private String    researcherEmail;
	private String    researcherOrganization;
	private Boolean   testRequest;

	public Query() {}

	public Query(Query value) {
		this.id = value.id;
		this.title = value.title;
		this.text = value.text;
		this.queryXml = value.queryXml;
		this.queryCreationTime = value.queryCreationTime;
		this.researcherId = value.researcherId;
		this.jsonText = value.jsonText;
		this.numAttachments = value.numAttachments;
		this.negotiatorToken = value.negotiatorToken;
		this.validQuery = value.validQuery;
		this.requestDescription = value.requestDescription;
		this.ethicsVote = value.ethicsVote;
		this.negotiationStartedTime = value.negotiationStartedTime;
		this.researcherName = value.researcherName;
		this.researcherEmail = value.researcherEmail;
		this.researcherOrganization = value.researcherOrganization;
		this.testRequest = value.testRequest;
	}

	public Query(
		Integer   id,
		String    title,
		String    text,
		String    queryXml,
		Timestamp queryCreationTime,
		Integer   researcherId,
		String    jsonText,
		Integer   numAttachments,
		String    negotiatorToken,
		Boolean   validQuery,
		String    requestDescription,
		String    ethicsVote,
		Timestamp negotiationStartedTime,
		String    researcherName,
		String    researcherEmail,
		String    researcherOrganization,
		Boolean   testRequest
	) {
		this.id = id;
		this.title = title;
		this.text = text;
		this.queryXml = queryXml;
		this.queryCreationTime = queryCreationTime;
		this.researcherId = researcherId;
		this.jsonText = jsonText;
		this.numAttachments = numAttachments;
		this.negotiatorToken = negotiatorToken;
		this.validQuery = validQuery;
		this.requestDescription = requestDescription;
		this.ethicsVote = ethicsVote;
		this.negotiationStartedTime = negotiationStartedTime;
		this.researcherName = researcherName;
		this.researcherEmail = researcherEmail;
		this.researcherOrganization = researcherOrganization;
		this.testRequest = testRequest;
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

	public String getQueryXml() {
		return this.queryXml;
	}

	public void setQueryXml(String queryXml) {
		this.queryXml = queryXml;
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

	public Boolean getValidQuery() {
		return this.validQuery;
	}

	public void setValidQuery(Boolean validQuery) {
		this.validQuery = validQuery;
	}

	public String getRequestDescription() {
		return this.requestDescription;
	}

	public void setRequestDescription(String requestDescription) {
		this.requestDescription = requestDescription;
	}

	public String getEthicsVote() {
		return this.ethicsVote;
	}

	public void setEthicsVote(String ethicsVote) {
		this.ethicsVote = ethicsVote;
	}

	public Timestamp getNegotiationStartedTime() {
		return this.negotiationStartedTime;
	}

	public void setNegotiationStartedTime(Timestamp negotiationStartedTime) {
		this.negotiationStartedTime = negotiationStartedTime;
	}

	public String getResearcherName() {
		return this.researcherName;
	}

	public void setResearcherName(String researcherName) {
		this.researcherName = researcherName;
	}

	public String getResearcherEmail() {
		return this.researcherEmail;
	}

	public void setResearcherEmail(String researcherEmail) {
		this.researcherEmail = researcherEmail;
	}

	public String getResearcherOrganization() {
		return this.researcherOrganization;
	}

	public void setResearcherOrganization(String researcherOrganization) {
		this.researcherOrganization = researcherOrganization;
	}

	public Boolean getTestRequest() {
		return this.testRequest;
	}

	public void setTestRequest(Boolean testRequest) {
		this.testRequest = testRequest;
	}
}
