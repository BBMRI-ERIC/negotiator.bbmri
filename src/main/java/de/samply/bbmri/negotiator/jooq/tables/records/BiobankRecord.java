/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables.records;


import de.samply.bbmri.negotiator.jooq.tables.Biobank;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class BiobankRecord extends UpdatableRecordImpl<BiobankRecord> implements Record5<Integer, String, String, String, Integer> {

	private static final long serialVersionUID = -2139851216;

	/**
	 * Setter for <code>public.biobank.id</code>. primary key
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.biobank.id</code>. primary key
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.biobank.name</code>. The biobank name
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.biobank.name</code>. The biobank name
	 */
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.biobank.description</code>. The description for this biobank
	 */
	public void setDescription(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.biobank.description</code>. The description for this biobank
	 */
	public String getDescription() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.biobank.directory_id</code>. The directory ID, e.g. eu_bbmri_eric_biobank:NL45
	 */
	public void setDirectoryId(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.biobank.directory_id</code>. The directory ID, e.g. eu_bbmri_eric_biobank:NL45
	 */
	public String getDirectoryId() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>public.biobank.list_of_directories_id</code>. The directorie Id where the biobank belongs to
	 */
	public void setListOfDirectoriesId(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.biobank.list_of_directories_id</code>. The directorie Id where the biobank belongs to
	 */
	public Integer getListOfDirectoriesId() {
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
	public Row5<Integer, String, String, String, Integer> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, String, String, String, Integer> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Biobank.BIOBANK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Biobank.BIOBANK.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Biobank.BIOBANK.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Biobank.BIOBANK.DIRECTORY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return Biobank.BIOBANK.LIST_OF_DIRECTORIES_ID;
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
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getDirectoryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getListOfDirectoriesId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BiobankRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BiobankRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BiobankRecord value3(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BiobankRecord value4(String value) {
		setDirectoryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BiobankRecord value5(Integer value) {
		setListOfDirectoriesId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BiobankRecord values(Integer value1, String value2, String value3, String value4, Integer value5) {
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
	 * Create a detached BiobankRecord
	 */
	public BiobankRecord() {
		super(Biobank.BIOBANK);
	}

	/**
	 * Create a detached, initialised BiobankRecord
	 */
	public BiobankRecord(Integer id, String name, String description, String directoryId, Integer listOfDirectoriesId) {
		super(Biobank.BIOBANK);

		setValue(0, id);
		setValue(1, name);
		setValue(2, description);
		setValue(3, directoryId);
		setValue(4, listOfDirectoriesId);
	}
}
