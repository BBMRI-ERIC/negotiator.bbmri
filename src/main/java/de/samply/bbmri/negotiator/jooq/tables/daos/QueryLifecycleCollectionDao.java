/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables.daos;


import de.samply.bbmri.negotiator.jooq.tables.QueryLifecycleCollection;
import de.samply.bbmri.negotiator.jooq.tables.records.QueryLifecycleCollectionRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class QueryLifecycleCollectionDao extends DAOImpl<QueryLifecycleCollectionRecord, de.samply.bbmri.negotiator.jooq.tables.pojos.QueryLifecycleCollection, Integer> {

	/**
	 * Create a new QueryLifecycleCollectionDao without any configuration
	 */
	public QueryLifecycleCollectionDao() {
		super(QueryLifecycleCollection.QUERY_LIFECYCLE_COLLECTION, de.samply.bbmri.negotiator.jooq.tables.pojos.QueryLifecycleCollection.class);
	}

	/**
	 * Create a new QueryLifecycleCollectionDao with an attached configuration
	 */
	public QueryLifecycleCollectionDao(Configuration configuration) {
		super(QueryLifecycleCollection.QUERY_LIFECYCLE_COLLECTION, de.samply.bbmri.negotiator.jooq.tables.pojos.QueryLifecycleCollection.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(de.samply.bbmri.negotiator.jooq.tables.pojos.QueryLifecycleCollection object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>query_id IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.QueryLifecycleCollection> fetchByQueryId(Integer... values) {
		return fetch(QueryLifecycleCollection.QUERY_LIFECYCLE_COLLECTION.QUERY_ID, values);
	}

	/**
	 * Fetch records that have <code>status_user_id IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.QueryLifecycleCollection> fetchByStatusUserId(Integer... values) {
		return fetch(QueryLifecycleCollection.QUERY_LIFECYCLE_COLLECTION.STATUS_USER_ID, values);
	}

	/**
	 * Fetch records that have <code>collection_id IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.QueryLifecycleCollection> fetchByCollectionId(Integer... values) {
		return fetch(QueryLifecycleCollection.QUERY_LIFECYCLE_COLLECTION.COLLECTION_ID, values);
	}

	/**
	 * Fetch records that have <code>status IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.QueryLifecycleCollection> fetchByStatus(String... values) {
		return fetch(QueryLifecycleCollection.QUERY_LIFECYCLE_COLLECTION.STATUS, values);
	}

	/**
	 * Fetch records that have <code>status_date IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.QueryLifecycleCollection> fetchByStatusDate(Timestamp... values) {
		return fetch(QueryLifecycleCollection.QUERY_LIFECYCLE_COLLECTION.STATUS_DATE, values);
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.QueryLifecycleCollection> fetchById(Integer... values) {
		return fetch(QueryLifecycleCollection.QUERY_LIFECYCLE_COLLECTION.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public de.samply.bbmri.negotiator.jooq.tables.pojos.QueryLifecycleCollection fetchOneById(Integer value) {
		return fetchOne(QueryLifecycleCollection.QUERY_LIFECYCLE_COLLECTION.ID, value);
	}

	/**
	 * Fetch records that have <code>status_type IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.QueryLifecycleCollection> fetchByStatusType(String... values) {
		return fetch(QueryLifecycleCollection.QUERY_LIFECYCLE_COLLECTION.STATUS_TYPE, values);
	}

	/**
	 * Fetch records that have <code>status_json IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.QueryLifecycleCollection> fetchByStatusJson(String... values) {
		return fetch(QueryLifecycleCollection.QUERY_LIFECYCLE_COLLECTION.STATUS_JSON, values);
	}
}
