/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq;


import de.samply.bbmri.negotiator.jooq.tables.Comment;
import de.samply.bbmri.negotiator.jooq.tables.FlaggedQuery;
import de.samply.bbmri.negotiator.jooq.tables.Location;
import de.samply.bbmri.negotiator.jooq.tables.Person;
import de.samply.bbmri.negotiator.jooq.tables.Query;
import de.samply.bbmri.negotiator.jooq.tables.Tag;
import de.samply.bbmri.negotiator.jooq.tables.TaggedQuery;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * table to store comments on a query
	 */
	public static final Comment COMMENT = de.samply.bbmri.negotiator.jooq.tables.Comment.COMMENT;

	/**
	 * Table for queries that are flagged/bookmarked. bookmark options are starred, archived and ignored.
	 */
	public static final FlaggedQuery FLAGGED_QUERY = de.samply.bbmri.negotiator.jooq.tables.FlaggedQuery.FLAGGED_QUERY;

	/**
	 * Table to store locations of researchers
	 */
	public static final Location LOCATION = de.samply.bbmri.negotiator.jooq.tables.Location.LOCATION;

	/**
	 * person table which is parent of researcher and owner
	 */
	public static final Person PERSON = de.samply.bbmri.negotiator.jooq.tables.Person.PERSON;

	/**
	 * query table to contain all  queries
	 */
	public static final Query QUERY = de.samply.bbmri.negotiator.jooq.tables.Query.QUERY;

	/**
	 * Table that contains tags for queries
	 */
	public static final Tag TAG = de.samply.bbmri.negotiator.jooq.tables.Tag.TAG;

	/**
	 * Table for queries that are tagged by names e.g. colonCancer,SkinCancer etc. Tag names need to be decided .
	 */
	public static final TaggedQuery TAGGED_QUERY = de.samply.bbmri.negotiator.jooq.tables.TaggedQuery.TAGGED_QUERY;
}
