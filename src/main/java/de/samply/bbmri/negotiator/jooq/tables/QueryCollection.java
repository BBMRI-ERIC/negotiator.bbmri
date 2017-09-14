/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables;


import de.samply.bbmri.negotiator.jooq.Keys;
import de.samply.bbmri.negotiator.jooq.Public;
import de.samply.bbmri.negotiator.jooq.tables.records.QueryCollectionRecord;

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
 * Table for connecting queries with collections
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QueryCollection extends TableImpl<QueryCollectionRecord> {

	private static final long serialVersionUID = 321035951;

	/**
	 * The reference instance of <code>public.query_collection</code>
	 */
	public static final QueryCollection QUERY_COLLECTION = new QueryCollection();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<QueryCollectionRecord> getRecordType() {
		return QueryCollectionRecord.class;
	}

	/**
	 * The column <code>public.query_collection.query_id</code>.
	 */
	public final TableField<QueryCollectionRecord, Integer> QUERY_ID = createField("query_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.query_collection.collection_id</code>.
	 */
	public final TableField<QueryCollectionRecord, Integer> COLLECTION_ID = createField("collection_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.query_collection.expect_connector_result</code>. Column that tells the negotiator to expect results from the given connector
	 */
	public final TableField<QueryCollectionRecord, Boolean> EXPECT_CONNECTOR_RESULT = createField("expect_connector_result", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaulted(true), this, "Column that tells the negotiator to expect results from the given connector");

	/**
	 * The column <code>public.query_collection.donors</code>. result of query: amount of donors
	 */
	public final TableField<QueryCollectionRecord, Integer> DONORS = createField("donors", org.jooq.impl.SQLDataType.INTEGER, this, "result of query: amount of donors");

	/**
	 * The column <code>public.query_collection.samples</code>. result of query: amount of samples
	 */
	public final TableField<QueryCollectionRecord, Integer> SAMPLES = createField("samples", org.jooq.impl.SQLDataType.INTEGER, this, "result of query: amount of samples");

	/**
	 * Create a <code>public.query_collection</code> table reference
	 */
	public QueryCollection() {
		this("query_collection", null);
	}

	/**
	 * Create an aliased <code>public.query_collection</code> table reference
	 */
	public QueryCollection(String alias) {
		this(alias, QUERY_COLLECTION);
	}

	private QueryCollection(String alias, Table<QueryCollectionRecord> aliased) {
		this(alias, aliased, null);
	}

	private QueryCollection(String alias, Table<QueryCollectionRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "Table for connecting queries with collections");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<QueryCollectionRecord> getPrimaryKey() {
		return Keys.QUERY_COLLECTION_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<QueryCollectionRecord>> getKeys() {
		return Arrays.<UniqueKey<QueryCollectionRecord>>asList(Keys.QUERY_COLLECTION_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<QueryCollectionRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<QueryCollectionRecord, ?>>asList(Keys.QUERY_COLLECTION__QUERY_COLLECTION_QUERY_ID_FKEY, Keys.QUERY_COLLECTION__QUERY_COLLECTION_COLLECTION_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QueryCollection as(String alias) {
		return new QueryCollection(alias, this);
	}

	/**
	 * Rename this table
	 */
	public QueryCollection rename(String name) {
		return new QueryCollection(name, null);
	}
}
