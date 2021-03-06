/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * query table to contain json text queries
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonQuery implements Serializable {

	private static final long serialVersionUID = -519255132;

	private Integer   id;
	private String    jsonText;
	private Timestamp queryCreateTime;
	private Integer   queryId;

	public JsonQuery() {}

	public JsonQuery(JsonQuery value) {
		this.id = value.id;
		this.jsonText = value.jsonText;
		this.queryCreateTime = value.queryCreateTime;
		this.queryId = value.queryId;
	}

	public JsonQuery(
		Integer   id,
		String    jsonText,
		Timestamp queryCreateTime,
		Integer   queryId
	) {
		this.id = id;
		this.jsonText = jsonText;
		this.queryCreateTime = queryCreateTime;
		this.queryId = queryId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getJsonText() {
		return this.jsonText;
	}

	public void setJsonText(String jsonText) {
		this.jsonText = jsonText;
	}

	public Timestamp getQueryCreateTime() {
		return this.queryCreateTime;
	}

	public void setQueryCreateTime(Timestamp queryCreateTime) {
		this.queryCreateTime = queryCreateTime;
	}

	public Integer getQueryId() {
		return this.queryId;
	}

	public void setQueryId(Integer queryId) {
		this.queryId = queryId;
	}
}
