/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * table to store the timestamp when the connector makes a get request for 
 * new queries
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConnectorLog implements Serializable {

	private static final long serialVersionUID = -1376711136;

	private Integer   collectionId;
	private Timestamp lastQueryTime;

	public ConnectorLog() {}

	public ConnectorLog(ConnectorLog value) {
		this.collectionId = value.collectionId;
		this.lastQueryTime = value.lastQueryTime;
	}

	public ConnectorLog(
		Integer   collectionId,
		Timestamp lastQueryTime
	) {
		this.collectionId = collectionId;
		this.lastQueryTime = lastQueryTime;
	}

	public Integer getCollectionId() {
		return this.collectionId;
	}

	public void setCollectionId(Integer collectionId) {
		this.collectionId = collectionId;
	}

	public Timestamp getLastQueryTime() {
		return this.lastQueryTime;
	}

	public void setLastQueryTime(Timestamp lastQueryTime) {
		this.lastQueryTime = lastQueryTime;
	}
}
