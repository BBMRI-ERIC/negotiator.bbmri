/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables.daos;


import de.samply.bbmri.negotiator.jooq.tables.PersonComment;
import de.samply.bbmri.negotiator.jooq.tables.records.PersonCommentRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
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
public class PersonCommentDao extends DAOImpl<PersonCommentRecord, de.samply.bbmri.negotiator.jooq.tables.pojos.PersonComment, Record2<Integer, Integer>> {

	/**
	 * Create a new PersonCommentDao without any configuration
	 */
	public PersonCommentDao() {
		super(PersonComment.PERSON_COMMENT, de.samply.bbmri.negotiator.jooq.tables.pojos.PersonComment.class);
	}

	/**
	 * Create a new PersonCommentDao with an attached configuration
	 */
	public PersonCommentDao(Configuration configuration) {
		super(PersonComment.PERSON_COMMENT, de.samply.bbmri.negotiator.jooq.tables.pojos.PersonComment.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Record2<Integer, Integer> getId(de.samply.bbmri.negotiator.jooq.tables.pojos.PersonComment object) {
		return compositeKeyRecord(object.getPersonId(), object.getCommentId());
	}

	/**
	 * Fetch records that have <code>person_id IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.PersonComment> fetchByPersonId(Integer... values) {
		return fetch(PersonComment.PERSON_COMMENT.PERSON_ID, values);
	}

	/**
	 * Fetch records that have <code>comment_id IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.PersonComment> fetchByCommentId(Integer... values) {
		return fetch(PersonComment.PERSON_COMMENT.COMMENT_ID, values);
	}

	/**
	 * Fetch records that have <code>read IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.PersonComment> fetchByRead(Boolean... values) {
		return fetch(PersonComment.PERSON_COMMENT.READ, values);
	}

	/**
	 * Fetch records that have <code>date_read IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.PersonComment> fetchByDateRead(Timestamp... values) {
		return fetch(PersonComment.PERSON_COMMENT.DATE_READ, values);
	}
}
