/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables;


import de.samply.bbmri.negotiator.jooq.Keys;
import de.samply.bbmri.negotiator.jooq.Public;
import de.samply.bbmri.negotiator.jooq.tables.records.PersonOfferRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class PersonOffer extends TableImpl<PersonOfferRecord> {

	private static final long serialVersionUID = -1142354516;

	/**
	 * The reference instance of <code>public.person_offer</code>
	 */
	public static final PersonOffer PERSON_OFFER = new PersonOffer();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PersonOfferRecord> getRecordType() {
		return PersonOfferRecord.class;
	}

	/**
	 * The column <code>public.person_offer.person_id</code>.
	 */
	public final TableField<PersonOfferRecord, Integer> PERSON_ID = createField("person_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.person_offer.offer_id</code>.
	 */
	public final TableField<PersonOfferRecord, Integer> OFFER_ID = createField("offer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.person_offer.read</code>.
	 */
	public final TableField<PersonOfferRecord, Boolean> READ = createField("read", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>public.person_offer.date_read</code>.
	 */
	public final TableField<PersonOfferRecord, Timestamp> DATE_READ = createField("date_read", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * Create a <code>public.person_offer</code> table reference
	 */
	public PersonOffer() {
		this("person_offer", null);
	}

	/**
	 * Create an aliased <code>public.person_offer</code> table reference
	 */
	public PersonOffer(String alias) {
		this(alias, PERSON_OFFER);
	}

	private PersonOffer(String alias, Table<PersonOfferRecord> aliased) {
		this(alias, aliased, null);
	}

	private PersonOffer(String alias, Table<PersonOfferRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<PersonOfferRecord> getPrimaryKey() {
		return Keys.PERSON_OFFER_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<PersonOfferRecord>> getKeys() {
		return Arrays.<UniqueKey<PersonOfferRecord>>asList(Keys.PERSON_OFFER_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PersonOffer as(String alias) {
		return new PersonOffer(alias, this);
	}

	/**
	 * Rename this table
	 */
	public PersonOffer rename(String name) {
		return new PersonOffer(name, null);
	}
}
