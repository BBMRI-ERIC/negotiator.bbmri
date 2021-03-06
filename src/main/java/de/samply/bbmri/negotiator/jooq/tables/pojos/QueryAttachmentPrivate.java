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
public class QueryAttachmentPrivate implements Serializable {

	private static final long serialVersionUID = -2054065296;

	private Integer   id;
	private Integer   queryId;
	private Integer   personId;
	private Integer   biobankInPrivateChat;
	private Timestamp attachmentTime;
	private String    attachment;
	private String    attachmentType;

	public QueryAttachmentPrivate() {}

	public QueryAttachmentPrivate(QueryAttachmentPrivate value) {
		this.id = value.id;
		this.queryId = value.queryId;
		this.personId = value.personId;
		this.biobankInPrivateChat = value.biobankInPrivateChat;
		this.attachmentTime = value.attachmentTime;
		this.attachment = value.attachment;
		this.attachmentType = value.attachmentType;
	}

	public QueryAttachmentPrivate(
		Integer   id,
		Integer   queryId,
		Integer   personId,
		Integer   biobankInPrivateChat,
		Timestamp attachmentTime,
		String    attachment,
		String    attachmentType
	) {
		this.id = id;
		this.queryId = queryId;
		this.personId = personId;
		this.biobankInPrivateChat = biobankInPrivateChat;
		this.attachmentTime = attachmentTime;
		this.attachment = attachment;
		this.attachmentType = attachmentType;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getBiobankInPrivateChat() {
		return this.biobankInPrivateChat;
	}

	public void setBiobankInPrivateChat(Integer biobankInPrivateChat) {
		this.biobankInPrivateChat = biobankInPrivateChat;
	}

	public Timestamp getAttachmentTime() {
		return this.attachmentTime;
	}

	public void setAttachmentTime(Timestamp attachmentTime) {
		this.attachmentTime = attachmentTime;
	}

	public String getAttachment() {
		return this.attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getAttachmentType() {
		return this.attachmentType;
	}

	public void setAttachmentType(String attachmentType) {
		this.attachmentType = attachmentType;
	}
}
