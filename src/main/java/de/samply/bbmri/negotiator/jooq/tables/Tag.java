/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables;


import de.samply.bbmri.negotiator.jooq.Keys;
import de.samply.bbmri.negotiator.jooq.Public;
import de.samply.bbmri.negotiator.jooq.tables.records.TagRecord;

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
 * Table that contains tags for queries
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tag extends TableImpl<TagRecord> {

	private static final long serialVersionUID = -1366751790;

	/**
	 * The reference instance of <code>public.tag</code>
	 */
	public static final Tag TAG = new Tag();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TagRecord> getRecordType() {
		return TagRecord.class;
	}

	/**
	 * The column <code>public.tag.id</code>. Primary key
	 */
	public final TableField<TagRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "Primary key");

	/**
	 * The column <code>public.tag.queryId</code>. Foreign key which exists in the query table as primary key
	 */
	public final TableField<TagRecord, Integer> QUERYID = createField("queryId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Foreign key which exists in the query table as primary key");

	/**
	 * The column <code>public.tag.text</code>. Text for the given tag id
	 */
	public final TableField<TagRecord, String> TEXT = createField("text", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "Text for the given tag id");

	/**
	 * Create a <code>public.tag</code> table reference
	 */
	public Tag() {
		this("tag", null);
	}

	/**
	 * Create an aliased <code>public.tag</code> table reference
	 */
	public Tag(String alias) {
		this(alias, TAG);
	}

	private Tag(String alias, Table<TagRecord> aliased) {
		this(alias, aliased, null);
	}

	private Tag(String alias, Table<TagRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "Table that contains tags for queries");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<TagRecord, Integer> getIdentity() {
		return Keys.IDENTITY_TAG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TagRecord> getPrimaryKey() {
		return Keys.TAG_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TagRecord>> getKeys() {
		return Arrays.<UniqueKey<TagRecord>>asList(Keys.TAG_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<TagRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<TagRecord, ?>>asList(Keys.TAG__TAG_QUERYID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Tag as(String alias) {
		return new Tag(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Tag rename(String name) {
		return new Tag(name, null);
	}
}