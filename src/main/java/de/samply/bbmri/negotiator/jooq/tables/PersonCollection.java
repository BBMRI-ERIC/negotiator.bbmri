/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables;


import de.samply.bbmri.negotiator.jooq.Keys;
import de.samply.bbmri.negotiator.jooq.Public;
import de.samply.bbmri.negotiator.jooq.tables.records.PersonCollectionRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * Table for connecting people with collections
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PersonCollection extends TableImpl<PersonCollectionRecord> {

	private static final long serialVersionUID = -902098714;

	/**
	 * The reference instance of <code>public.person_collection</code>
	 */
	public static final PersonCollection PERSON_COLLECTION = new PersonCollection();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PersonCollectionRecord> getRecordType() {
		return PersonCollectionRecord.class;
	}

	/**
	 * The column <code>public.person_collection.person_id</code>.
	 */
	public final TableField<PersonCollectionRecord, Integer> PERSON_ID = createField("person_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.person_collection.collection_id</code>.
	 */
	public final TableField<PersonCollectionRecord, Integer> COLLECTION_ID = createField("collection_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>public.person_collection</code> table reference
	 */
	public PersonCollection() {
		this("person_collection", null);
	}

	/**
	 * Create an aliased <code>public.person_collection</code> table reference
	 */
	public PersonCollection(String alias) {
		this(alias, PERSON_COLLECTION);
	}

	private PersonCollection(String alias, Table<PersonCollectionRecord> aliased) {
		this(alias, aliased, null);
	}

	private PersonCollection(String alias, Table<PersonCollectionRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "Table for connecting people with collections");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<PersonCollectionRecord> getPrimaryKey() {
		return Keys.PERSON_COLLECTION_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<PersonCollectionRecord>> getKeys() {
		return Arrays.<UniqueKey<PersonCollectionRecord>>asList(Keys.PERSON_COLLECTION_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<PersonCollectionRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<PersonCollectionRecord, ?>>asList(Keys.PERSON_COLLECTION__PERSON_COLLECTION_PERSON_ID_FKEY, Keys.PERSON_COLLECTION__PERSON_COLLECTION_COLLECTION_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PersonCollection as(String alias) {
		return new PersonCollection(alias, this);
	}

	/**
	 * Rename this table
	 */
	public PersonCollection rename(String name) {
		return new PersonCollection(name, null);
	}
}
