/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables.daos;


import de.samply.bbmri.negotiator.jooq.tables.Flaggedquery;
import de.samply.bbmri.negotiator.jooq.tables.records.FlaggedqueryRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;


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
public class FlaggedqueryDao extends DAOImpl<FlaggedqueryRecord, de.samply.bbmri.negotiator.jooq.tables.pojos.Flaggedquery, Record2<Integer, Integer>> {

	/**
	 * Create a new FlaggedqueryDao without any configuration
	 */
	public FlaggedqueryDao() {
		super(Flaggedquery.FLAGGEDQUERY, de.samply.bbmri.negotiator.jooq.tables.pojos.Flaggedquery.class);
	}

	/**
	 * Create a new FlaggedqueryDao with an attached configuration
	 */
	public FlaggedqueryDao(Configuration configuration) {
		super(Flaggedquery.FLAGGEDQUERY, de.samply.bbmri.negotiator.jooq.tables.pojos.Flaggedquery.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Record2<Integer, Integer> getId(de.samply.bbmri.negotiator.jooq.tables.pojos.Flaggedquery object) {
		return compositeKeyRecord(object.getQueryid(), object.getPersonid());
	}

	/**
	 * Fetch records that have <code>queryId IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.Flaggedquery> fetchByQueryid(Integer... values) {
		return fetch(Flaggedquery.FLAGGEDQUERY.QUERYID, values);
	}

	/**
	 * Fetch records that have <code>personId IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.Flaggedquery> fetchByPersonid(Integer... values) {
		return fetch(Flaggedquery.FLAGGEDQUERY.PERSONID, values);
	}

	/**
	 * Fetch records that have <code>flag IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.Flaggedquery> fetchByFlag(String... values) {
		return fetch(Flaggedquery.FLAGGEDQUERY.FLAG, values);
	}
}
