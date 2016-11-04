/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables;


import de.samply.bbmri.negotiator.jooq.Keys;
import de.samply.bbmri.negotiator.jooq.Public;
import de.samply.bbmri.negotiator.jooq.tables.records.BiobankRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * Table to store biobanks from the directory
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Biobank extends TableImpl<BiobankRecord> {

	private static final long serialVersionUID = -1596845748;

	/**
	 * The reference instance of <code>public.biobank</code>
	 */
	public static final Biobank BIOBANK = new Biobank();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<BiobankRecord> getRecordType() {
		return BiobankRecord.class;
	}

	/**
	 * The column <code>public.biobank.id</code>. primary key
	 */
	public final TableField<BiobankRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "primary key");

	/**
	 * The column <code>public.biobank.name</code>. The biobank name
	 */
	public final TableField<BiobankRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "The biobank name");

	/**
	 * The column <code>public.biobank.description</code>. The description for this biobank
	 */
	public final TableField<BiobankRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "The description for this biobank");

	/**
	 * The column <code>public.biobank.directory_id</code>. The directory ID, e.g. eu_bbmri_eric_biobank:NL45
	 */
	public final TableField<BiobankRecord, String> DIRECTORY_ID = createField("directory_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "The directory ID, e.g. eu_bbmri_eric_biobank:NL45");

	/**
	 * Create a <code>public.biobank</code> table reference
	 */
	public Biobank() {
		this("biobank", null);
	}

	/**
	 * Create an aliased <code>public.biobank</code> table reference
	 */
	public Biobank(String alias) {
		this(alias, BIOBANK);
	}

	private Biobank(String alias, Table<BiobankRecord> aliased) {
		this(alias, aliased, null);
	}

	private Biobank(String alias, Table<BiobankRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "Table to store biobanks from the directory");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<BiobankRecord, Integer> getIdentity() {
		return Keys.IDENTITY_BIOBANK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<BiobankRecord> getPrimaryKey() {
		return Keys.BIOBANK_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<BiobankRecord>> getKeys() {
		return Arrays.<UniqueKey<BiobankRecord>>asList(Keys.BIOBANK_PKEY, Keys.BIOBANK_DIRECTORY_ID_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Biobank as(String alias) {
		return new Biobank(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Biobank rename(String name) {
		return new Biobank(name, null);
	}
}