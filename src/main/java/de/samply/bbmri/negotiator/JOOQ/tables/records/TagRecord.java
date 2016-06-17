/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.JOOQ.tables.records;


import de.samply.bbmri.negotiator.JOOQ.tables.Tag;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TagRecord extends UpdatableRecordImpl<TagRecord> implements Record3<Integer, Integer, String> {

	private static final long serialVersionUID = -1557371348;

	/**
	 * Setter for <code>public.tag.id</code>. Primary key
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.tag.id</code>. Primary key
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.tag.queryId</code>. Foreign key which exists in the query table as primary key
	 */
	public void setQueryid(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.tag.queryId</code>. Foreign key which exists in the query table as primary key
	 */
	public Integer getQueryid() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.tag.text</code>. Text for the given tag id
	 */
	public void setText(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.tag.text</code>. Text for the given tag id
	 */
	public String getText() {
		return (String) getValue(2);
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
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, String> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, String> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Tag.TAG.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Tag.TAG.QUERYID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Tag.TAG.TEXT;
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
	public Integer value2() {
		return getQueryid();
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
	public TagRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TagRecord value2(Integer value) {
		setQueryid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TagRecord value3(String value) {
		setText(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TagRecord values(Integer value1, Integer value2, String value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TagRecord
	 */
	public TagRecord() {
		super(Tag.TAG);
	}

	/**
	 * Create a detached, initialised TagRecord
	 */
	public TagRecord(Integer id, Integer queryid, String text) {
		super(Tag.TAG);

		setValue(0, id);
		setValue(1, queryid);
		setValue(2, text);
	}
}
