/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables.pojos;


import java.io.Serializable;

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
public class Network implements Serializable {

	private static final long serialVersionUID = -1165681124;

	private Integer id;
	private String  name;
	private String  description;
	private String  acronym;
	private String  directoryId;

	public Network() {}

	public Network(Network value) {
		this.id = value.id;
		this.name = value.name;
		this.description = value.description;
		this.acronym = value.acronym;
		this.directoryId = value.directoryId;
	}

	public Network(
		Integer id,
		String  name,
		String  description,
		String  acronym,
		String  directoryId
	) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.acronym = acronym;
		this.directoryId = directoryId;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAcronym() {
		return this.acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public String getDirectoryId() {
		return this.directoryId;
	}

	public void setDirectoryId(String directoryId) {
		this.directoryId = directoryId;
	}
}
