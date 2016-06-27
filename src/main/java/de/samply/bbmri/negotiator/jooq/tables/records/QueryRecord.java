/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables.records;


import de.samply.bbmri.negotiator.jooq.tables.Query;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class QueryRecord extends UpdatableRecordImpl<QueryRecord> implements Record5<Integer, String, String, Timestamp, Integer> {

	private static final long serialVersionUID = 324060165;

	/**
	 * Setter for <code>public.query.id</code>. primary key
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.query.id</code>. primary key
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.query.title</code>. title of query
	 */
	public void setTitle(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.query.title</code>. title of query
	 */
	public String getTitle() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.query.text</code>. text of query
	 */
	public void setText(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.query.text</code>. text of query
	 */
	public String getText() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.query.query_creation_time</code>. date and time of query with out time zone
	 */
	public void setQueryCreationTime(Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.query.query_creation_time</code>. date and time of query with out time zone
	 */
	public Timestamp getQueryCreationTime() {
		return (Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>public.query.researcher_id</code>. Foreign key. Exists as primary key in the researcher table(which takes it in turn from the person table)
	 */
	public void setResearcherId(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.query.researcher_id</code>. Foreign key. Exists as primary key in the researcher table(which takes it in turn from the person table)
	 */
	public Integer getResearcherId() {
		return (Integer) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, String, String, Timestamp, Integer> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, String, String, Timestamp, Integer> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Query.QUERY.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Query.QUERY.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Query.QUERY.TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field4() {
		return Query.QUERY.QUERY_CREATION_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return Query.QUERY.RESEARCHER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getText();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value4() {
		return getQueryCreationTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getResearcherId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QueryRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QueryRecord value2(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QueryRecord value3(String value) {
		setText(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QueryRecord value4(Timestamp value) {
		setQueryCreationTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QueryRecord value5(Integer value) {
		setResearcherId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QueryRecord values(Integer value1, String value2, String value3, Timestamp value4, Integer value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached QueryRecord
	 */
	public QueryRecord() {
		super(Query.QUERY);
	}

	/**
	 * Create a detached, initialised QueryRecord
	 */
	public QueryRecord(Integer id, String title, String text, Timestamp queryCreationTime, Integer researcherId) {
		super(Query.QUERY);

		setValue(0, id);
		setValue(1, title);
		setValue(2, text);
		setValue(3, queryCreationTime);
		setValue(4, researcherId);
	}
}
