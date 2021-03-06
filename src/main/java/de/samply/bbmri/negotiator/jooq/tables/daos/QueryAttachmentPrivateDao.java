/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables.daos;


import de.samply.bbmri.negotiator.jooq.tables.QueryAttachmentPrivate;
import de.samply.bbmri.negotiator.jooq.tables.records.QueryAttachmentPrivateRecord;

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
public class QueryAttachmentPrivateDao extends DAOImpl<QueryAttachmentPrivateRecord, de.samply.bbmri.negotiator.jooq.tables.pojos.QueryAttachmentPrivate, Integer> {

	/**
	 * Create a new QueryAttachmentPrivateDao without any configuration
	 */
	public QueryAttachmentPrivateDao() {
		super(QueryAttachmentPrivate.QUERY_ATTACHMENT_PRIVATE, de.samply.bbmri.negotiator.jooq.tables.pojos.QueryAttachmentPrivate.class);
	}

	/**
	 * Create a new QueryAttachmentPrivateDao with an attached configuration
	 */
	public QueryAttachmentPrivateDao(Configuration configuration) {
		super(QueryAttachmentPrivate.QUERY_ATTACHMENT_PRIVATE, de.samply.bbmri.negotiator.jooq.tables.pojos.QueryAttachmentPrivate.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(de.samply.bbmri.negotiator.jooq.tables.pojos.QueryAttachmentPrivate object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.QueryAttachmentPrivate> fetchById(Integer... values) {
		return fetch(QueryAttachmentPrivate.QUERY_ATTACHMENT_PRIVATE.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public de.samply.bbmri.negotiator.jooq.tables.pojos.QueryAttachmentPrivate fetchOneById(Integer value) {
		return fetchOne(QueryAttachmentPrivate.QUERY_ATTACHMENT_PRIVATE.ID, value);
	}

	/**
	 * Fetch records that have <code>query_id IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.QueryAttachmentPrivate> fetchByQueryId(Integer... values) {
		return fetch(QueryAttachmentPrivate.QUERY_ATTACHMENT_PRIVATE.QUERY_ID, values);
	}

	/**
	 * Fetch records that have <code>person_id IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.QueryAttachmentPrivate> fetchByPersonId(Integer... values) {
		return fetch(QueryAttachmentPrivate.QUERY_ATTACHMENT_PRIVATE.PERSON_ID, values);
	}

	/**
	 * Fetch records that have <code>biobank_in_private_chat IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.QueryAttachmentPrivate> fetchByBiobankInPrivateChat(Integer... values) {
		return fetch(QueryAttachmentPrivate.QUERY_ATTACHMENT_PRIVATE.BIOBANK_IN_PRIVATE_CHAT, values);
	}

	/**
	 * Fetch records that have <code>attachment_time IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.QueryAttachmentPrivate> fetchByAttachmentTime(Timestamp... values) {
		return fetch(QueryAttachmentPrivate.QUERY_ATTACHMENT_PRIVATE.ATTACHMENT_TIME, values);
	}

	/**
	 * Fetch records that have <code>attachment IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.QueryAttachmentPrivate> fetchByAttachment(String... values) {
		return fetch(QueryAttachmentPrivate.QUERY_ATTACHMENT_PRIVATE.ATTACHMENT, values);
	}

	/**
	 * Fetch records that have <code>attachment_type IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.QueryAttachmentPrivate> fetchByAttachmentType(String... values) {
		return fetch(QueryAttachmentPrivate.QUERY_ATTACHMENT_PRIVATE.ATTACHMENT_TYPE, values);
	}
}
