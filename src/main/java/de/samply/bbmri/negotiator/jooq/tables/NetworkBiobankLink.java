/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables;


import de.samply.bbmri.negotiator.jooq.Keys;
import de.samply.bbmri.negotiator.jooq.Public;
import de.samply.bbmri.negotiator.jooq.tables.records.NetworkBiobankLinkRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NetworkBiobankLink extends TableImpl<NetworkBiobankLinkRecord> {

	private static final long serialVersionUID = 69140062;

	/**
	 * The reference instance of <code>public.network_biobank_link</code>
	 */
	public static final NetworkBiobankLink NETWORK_BIOBANK_LINK = new NetworkBiobankLink();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<NetworkBiobankLinkRecord> getRecordType() {
		return NetworkBiobankLinkRecord.class;
	}

	/**
	 * The column <code>public.network_biobank_link.biobank_id</code>.
	 */
	public final TableField<NetworkBiobankLinkRecord, Integer> BIOBANK_ID = createField("biobank_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.network_biobank_link.network_id</code>.
	 */
	public final TableField<NetworkBiobankLinkRecord, Integer> NETWORK_ID = createField("network_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>public.network_biobank_link</code> table reference
	 */
	public NetworkBiobankLink() {
		this("network_biobank_link", null);
	}

	/**
	 * Create an aliased <code>public.network_biobank_link</code> table reference
	 */
	public NetworkBiobankLink(String alias) {
		this(alias, NETWORK_BIOBANK_LINK);
	}

	private NetworkBiobankLink(String alias, Table<NetworkBiobankLinkRecord> aliased) {
		this(alias, aliased, null);
	}

	private NetworkBiobankLink(String alias, Table<NetworkBiobankLinkRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<NetworkBiobankLinkRecord> getPrimaryKey() {
		return Keys.NETWORK_BIOBANK_LINK_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<NetworkBiobankLinkRecord>> getKeys() {
		return Arrays.<UniqueKey<NetworkBiobankLinkRecord>>asList(Keys.NETWORK_BIOBANK_LINK_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NetworkBiobankLink as(String alias) {
		return new NetworkBiobankLink(alias, this);
	}

	/**
	 * Rename this table
	 */
	public NetworkBiobankLink rename(String name) {
		return new NetworkBiobankLink(name, null);
	}
}
