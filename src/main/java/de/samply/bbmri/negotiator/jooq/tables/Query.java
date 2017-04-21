/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables;


import de.samply.bbmri.negotiator.jooq.Keys;
import de.samply.bbmri.negotiator.jooq.Public;
import de.samply.bbmri.negotiator.jooq.tables.records.QueryRecord;

import java.sql.Timestamp;
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
 * query table to contain all  queries
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Query extends TableImpl<QueryRecord> {

	private static final long serialVersionUID = -1172713166;

	/**
	 * The reference instance of <code>public.query</code>
	 */
	public static final Query QUERY = new Query();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<QueryRecord> getRecordType() {
		return QueryRecord.class;
	}

	/**
	 * The column <code>public.query.id</code>. primary key
	 */
	public final TableField<QueryRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "primary key");

	/**
	 * The column <code>public.query.title</code>. title of query
	 */
	public final TableField<QueryRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "title of query");

	/**
	 * The column <code>public.query.text</code>. text of query
	 */
	public final TableField<QueryRecord, String> TEXT = createField("text", org.jooq.impl.SQLDataType.CLOB, this, "text of query");

	/**
	 * The column <code>public.query.query_creation_time</code>. date and time of query with out time zone
	 */
	public final TableField<QueryRecord, Timestamp> QUERY_CREATION_TIME = createField("query_creation_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaulted(true), this, "date and time of query with out time zone");

	/**
	 * The column <code>public.query.researcher_id</code>. Foreign key. Exists as primary key in the researcher table(which takes it in turn from the person table)
	 */
	public final TableField<QueryRecord, Integer> RESEARCHER_ID = createField("researcher_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Foreign key. Exists as primary key in the researcher table(which takes it in turn from the person table)");

	/**
	 * The column <code>public.query.json_text</code>.
	 */
	public final TableField<QueryRecord, String> JSON_TEXT = createField("json_text", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>public.query.num_attachments</code>. number of attachments ever associated with this query - both existing and deleted, used as an index for naming future attachments
	 */
	public final TableField<QueryRecord, Integer> NUM_ATTACHMENTS = createField("num_attachments", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "number of attachments ever associated with this query - both existing and deleted, used as an index for naming future attachments");

	/**
	 * The column <code>public.query.negotiator_token</code>.
	 */
	public final TableField<QueryRecord, String> NEGOTIATOR_TOKEN = createField("negotiator_token", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>public.query.valid_query</code>.
	 */
	public final TableField<QueryRecord, Boolean> VALID_QUERY = createField("valid_query", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.query.request_description</code>.
	 */
	public final TableField<QueryRecord, String> REQUEST_DESCRIPTION = createField("request_description", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * Create a <code>public.query</code> table reference
	 */
	public Query() {
		this("query", null);
	}

	/**
	 * Create an aliased <code>public.query</code> table reference
	 */
	public Query(String alias) {
		this(alias, QUERY);
	}

	private Query(String alias, Table<QueryRecord> aliased) {
		this(alias, aliased, null);
	}

	private Query(String alias, Table<QueryRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "query table to contain all  queries");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<QueryRecord, Integer> getIdentity() {
		return Keys.IDENTITY_QUERY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<QueryRecord> getPrimaryKey() {
		return Keys.QUERY_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<QueryRecord>> getKeys() {
		return Arrays.<UniqueKey<QueryRecord>>asList(Keys.QUERY_PKEY, Keys.QUERY_NEGOTIATOR_TOKEN_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<QueryRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<QueryRecord, ?>>asList(Keys.QUERY__QUERY_RESEARCHER_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Query as(String alias) {
		return new Query(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Query rename(String name) {
		return new Query(name, null);
	}
}
