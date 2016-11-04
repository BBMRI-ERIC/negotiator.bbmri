/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables;


import de.samply.bbmri.negotiator.jooq.Keys;
import de.samply.bbmri.negotiator.jooq.Public;
import de.samply.bbmri.negotiator.jooq.tables.records.QueryAttachmentRecord;

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
 * Table for queries that have one or more attachments uploaded.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QueryAttachment extends TableImpl<QueryAttachmentRecord> {

	private static final long serialVersionUID = 1170210394;

	/**
	 * The reference instance of <code>public.query_attachment</code>
	 */
	public static final QueryAttachment QUERY_ATTACHMENT = new QueryAttachment();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<QueryAttachmentRecord> getRecordType() {
		return QueryAttachmentRecord.class;
	}

	/**
	 * The column <code>public.query_attachment.id</code>.
	 */
	public final TableField<QueryAttachmentRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.query_attachment.query_id</code>. This column is a foreign key here, taken from query table
	 */
	public final TableField<QueryAttachmentRecord, Integer> QUERY_ID = createField("query_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "This column is a foreign key here, taken from query table");

	/**
	 * The column <code>public.query_attachment.attachment</code>. The name of the attached file stored in file system, not including the directory
	 */
	public final TableField<QueryAttachmentRecord, String> ATTACHMENT = createField("attachment", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "The name of the attached file stored in file system, not including the directory");

	/**
	 * Create a <code>public.query_attachment</code> table reference
	 */
	public QueryAttachment() {
		this("query_attachment", null);
	}

	/**
	 * Create an aliased <code>public.query_attachment</code> table reference
	 */
	public QueryAttachment(String alias) {
		this(alias, QUERY_ATTACHMENT);
	}

	private QueryAttachment(String alias, Table<QueryAttachmentRecord> aliased) {
		this(alias, aliased, null);
	}

	private QueryAttachment(String alias, Table<QueryAttachmentRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "Table for queries that have one or more attachments uploaded.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<QueryAttachmentRecord, Integer> getIdentity() {
		return Keys.IDENTITY_QUERY_ATTACHMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<QueryAttachmentRecord> getPrimaryKey() {
		return Keys.QUERY_ATTACHMENT_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<QueryAttachmentRecord>> getKeys() {
		return Arrays.<UniqueKey<QueryAttachmentRecord>>asList(Keys.QUERY_ATTACHMENT_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<QueryAttachmentRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<QueryAttachmentRecord, ?>>asList(Keys.QUERY_ATTACHMENT__QUERY_ATTACHMENT_QUERY_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QueryAttachment as(String alias) {
		return new QueryAttachment(alias, this);
	}

	/**
	 * Rename this table
	 */
	public QueryAttachment rename(String name) {
		return new QueryAttachment(name, null);
	}
}