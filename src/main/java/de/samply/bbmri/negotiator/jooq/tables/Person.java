/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables;


import de.samply.bbmri.negotiator.jooq.Keys;
import de.samply.bbmri.negotiator.jooq.Public;
import de.samply.bbmri.negotiator.jooq.enums.Persontype;
import de.samply.bbmri.negotiator.jooq.tables.records.PersonRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * person table which is parent of researcher and owner
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Person extends TableImpl<PersonRecord> {

	private static final long serialVersionUID = -856191333;

	/**
	 * The reference instance of <code>public.person</code>
	 */
	public static final Person PERSON = new Person();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PersonRecord> getRecordType() {
		return PersonRecord.class;
	}

	/**
	 * The column <code>public.person.id</code>. primary key
	 */
	public final TableField<PersonRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "primary key");

	/**
	 * The column <code>public.person.personType</code>. describes wether the person is researcher or owner - one of the the two child classes. 
	 */
	public final TableField<PersonRecord, Persontype> PERSONTYPE = createField("personType", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(de.samply.bbmri.negotiator.jooq.enums.Persontype.class), this, "describes wether the person is researcher or owner - one of the the two child classes. ");

	/**
	 * The column <code>public.person.authSubject</code>. authentication string that comes from the authentication service
	 */
	public final TableField<PersonRecord, String> AUTHSUBJECT = createField("authSubject", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "authentication string that comes from the authentication service");

	/**
	 * The column <code>public.person.authName</code>. the real name of the user, value comes from the authentication service
	 */
	public final TableField<PersonRecord, String> AUTHNAME = createField("authName", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "the real name of the user, value comes from the authentication service");

	/**
	 * The column <code>public.person.authEmail</code>. the email of the user, value comes from the authentication service
	 */
	public final TableField<PersonRecord, String> AUTHEMAIL = createField("authEmail", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "the email of the user, value comes from the authentication service");

	/**
	 * The column <code>public.person.personImage</code>. image/avatar of the person
	 */
	public final TableField<PersonRecord, byte[]> PERSONIMAGE = createField("personImage", org.jooq.impl.SQLDataType.BLOB, this, "image/avatar of the person");

	/**
	 * The column <code>public.person.locationId</code>. only valid for biobank owners, the ID of the location he belongs to
	 */
	public final TableField<PersonRecord, Integer> LOCATIONID = createField("locationId", org.jooq.impl.SQLDataType.INTEGER, this, "only valid for biobank owners, the ID of the location he belongs to");

	/**
	 * Create a <code>public.person</code> table reference
	 */
	public Person() {
		this("person", null);
	}

	/**
	 * Create an aliased <code>public.person</code> table reference
	 */
	public Person(String alias) {
		this(alias, PERSON);
	}

	private Person(String alias, Table<PersonRecord> aliased) {
		this(alias, aliased, null);
	}

	private Person(String alias, Table<PersonRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "person table which is parent of researcher and owner");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<PersonRecord, Integer> getIdentity() {
		return Keys.IDENTITY_PERSON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<PersonRecord> getPrimaryKey() {
		return Keys.PERSON_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<PersonRecord>> getKeys() {
		return Arrays.<UniqueKey<PersonRecord>>asList(Keys.PERSON_PKEY, Keys.PERSON_AUTHSUBJECT_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<PersonRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<PersonRecord, ?>>asList(Keys.PERSON__PERSON_LOCATIONID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Person as(String alias) {
		return new Person(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Person rename(String name) {
		return new Person(name, null);
	}
}
