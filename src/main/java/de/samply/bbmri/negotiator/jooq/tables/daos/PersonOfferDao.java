/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables.daos;


import de.samply.bbmri.negotiator.jooq.tables.PersonOffer;
import de.samply.bbmri.negotiator.jooq.tables.records.PersonOfferRecord;

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
public class PersonOfferDao extends DAOImpl<PersonOfferRecord, de.samply.bbmri.negotiator.jooq.tables.pojos.PersonOffer, Record2<Integer, Integer>> {

	/**
	 * Create a new PersonOfferDao without any configuration
	 */
	public PersonOfferDao() {
		super(PersonOffer.PERSON_OFFER, de.samply.bbmri.negotiator.jooq.tables.pojos.PersonOffer.class);
	}

	/**
	 * Create a new PersonOfferDao with an attached configuration
	 */
	public PersonOfferDao(Configuration configuration) {
		super(PersonOffer.PERSON_OFFER, de.samply.bbmri.negotiator.jooq.tables.pojos.PersonOffer.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Record2<Integer, Integer> getId(de.samply.bbmri.negotiator.jooq.tables.pojos.PersonOffer object) {
		return compositeKeyRecord(object.getPersonId(), object.getOfferId());
	}

	/**
	 * Fetch records that have <code>person_id IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.PersonOffer> fetchByPersonId(Integer... values) {
		return fetch(PersonOffer.PERSON_OFFER.PERSON_ID, values);
	}

	/**
	 * Fetch records that have <code>offer_id IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.PersonOffer> fetchByOfferId(Integer... values) {
		return fetch(PersonOffer.PERSON_OFFER.OFFER_ID, values);
	}

	/**
	 * Fetch records that have <code>read IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.PersonOffer> fetchByRead(Boolean... values) {
		return fetch(PersonOffer.PERSON_OFFER.READ, values);
	}

	/**
	 * Fetch records that have <code>date_read IN (values)</code>
	 */
	public List<de.samply.bbmri.negotiator.jooq.tables.pojos.PersonOffer> fetchByDateRead(Timestamp... values) {
		return fetch(PersonOffer.PERSON_OFFER.DATE_READ, values);
	}
}
