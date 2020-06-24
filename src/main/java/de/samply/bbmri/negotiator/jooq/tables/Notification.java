/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables;


import de.samply.bbmri.negotiator.jooq.Keys;
import de.samply.bbmri.negotiator.jooq.Public;
import de.samply.bbmri.negotiator.jooq.tables.records.NotificationRecord;

import java.sql.Timestamp;
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
public class Notification extends TableImpl<NotificationRecord> {

	private static final long serialVersionUID = 1141007397;

	/**
	 * The reference instance of <code>public.notification</code>
	 */
	public static final Notification NOTIFICATION = new Notification();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<NotificationRecord> getRecordType() {
		return NotificationRecord.class;
	}

	/**
	 * The column <code>public.notification.notification_id</code>.
	 */
	public final TableField<NotificationRecord, Integer> NOTIFICATION_ID = createField("notification_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.notification.query_id</code>.
	 */
	public final TableField<NotificationRecord, Integer> QUERY_ID = createField("query_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.notification.comment_id</code>.
	 */
	public final TableField<NotificationRecord, Integer> COMMENT_ID = createField("comment_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.notification.person_id</code>.
	 */
	public final TableField<NotificationRecord, Integer> PERSON_ID = createField("person_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.notification.notification_type</code>.
	 */
	public final TableField<NotificationRecord, String> NOTIFICATION_TYPE = createField("notification_type", org.jooq.impl.SQLDataType.VARCHAR.length(250), this, "");

	/**
	 * The column <code>public.notification.create_date</code>.
	 */
	public final TableField<NotificationRecord, Timestamp> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * Create a <code>public.notification</code> table reference
	 */
	public Notification() {
		this("notification", null);
	}

	/**
	 * Create an aliased <code>public.notification</code> table reference
	 */
	public Notification(String alias) {
		this(alias, NOTIFICATION);
	}

	private Notification(String alias, Table<NotificationRecord> aliased) {
		this(alias, aliased, null);
	}

	private Notification(String alias, Table<NotificationRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<NotificationRecord, Integer> getIdentity() {
		return Keys.IDENTITY_NOTIFICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<NotificationRecord> getPrimaryKey() {
		return Keys.NOTIFICATION_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<NotificationRecord>> getKeys() {
		return Arrays.<UniqueKey<NotificationRecord>>asList(Keys.NOTIFICATION_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Notification as(String alias) {
		return new Notification(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Notification rename(String name) {
		return new Notification(name, null);
	}
}