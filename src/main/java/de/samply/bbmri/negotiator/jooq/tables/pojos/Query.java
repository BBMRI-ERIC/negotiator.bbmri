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

	private static final long serialVersionUID = 949501937;

	private Integer   id;
	private String    title;
	private String    text;
	private Timestamp datetime;
	private Integer   researcherid;

	public Query() {}

	public Query(Query value) {
		this.id = value.id;
		this.title = value.title;
		this.text = value.text;
		this.datetime = value.datetime;
		this.researcherid = value.researcherid;
	}

	public Query(
		Integer   id,
		String    title,
		String    text,
		Timestamp datetime,
		Integer   researcherid
	) {
		this.id = id;
		this.title = title;
		this.text = text;
		this.datetime = datetime;
		this.researcherid = researcherid;
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

	public Timestamp getDatetime() {
		return this.datetime;
	}

	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}

	public Integer getResearcherid() {
		return this.researcherid;
	}

	public void setResearcherid(Integer researcherid) {
		this.researcherid = researcherid;
	}
}