/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * Table for queries that are flagged/bookmarked. bookmark options are starred, 
 * archived and ignored.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Flaggedquery implements Serializable {

	private static final long serialVersionUID = -412036429;

	private Integer queryid;
	private Integer personid;
	private String  flag;

	public Flaggedquery() {}

	public Flaggedquery(Flaggedquery value) {
		this.queryid = value.queryid;
		this.personid = value.personid;
		this.flag = value.flag;
	}

	public Flaggedquery(
		Integer queryid,
		Integer personid,
		String  flag
	) {
		this.queryid = queryid;
		this.personid = personid;
		this.flag = flag;
	}

	public Integer getQueryid() {
		return this.queryid;
	}

	public void setQueryid(Integer queryid) {
		this.queryid = queryid;
	}

	public Integer getPersonid() {
		return this.personid;
	}

	public void setPersonid(Integer personid) {
		this.personid = personid;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
}