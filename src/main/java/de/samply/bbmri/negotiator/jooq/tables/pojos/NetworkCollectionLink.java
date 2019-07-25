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
public class NetworkCollectionLink implements Serializable {

	private static final long serialVersionUID = -1911704043;

	private Integer collectionId;
	private Integer networkId;

	public NetworkCollectionLink() {}

	public NetworkCollectionLink(NetworkCollectionLink value) {
		this.collectionId = value.collectionId;
		this.networkId = value.networkId;
	}

	public NetworkCollectionLink(
		Integer collectionId,
		Integer networkId
	) {
		this.collectionId = collectionId;
		this.networkId = networkId;
	}

	public Integer getCollectionId() {
		return this.collectionId;
	}

	public void setCollectionId(Integer collectionId) {
		this.collectionId = collectionId;
	}

	public Integer getNetworkId() {
		return this.networkId;
	}

	public void setNetworkId(Integer networkId) {
		this.networkId = networkId;
	}
}
