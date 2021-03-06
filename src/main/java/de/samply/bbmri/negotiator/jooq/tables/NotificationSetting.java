/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq.tables;


import de.samply.bbmri.negotiator.jooq.Keys;
import de.samply.bbmri.negotiator.jooq.Public;
import de.samply.bbmri.negotiator.jooq.tables.records.NotificationSettingRecord;

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
public class NotificationSetting extends TableImpl<NotificationSettingRecord> {

	private static final long serialVersionUID = -896772448;

	/**
	 * The reference instance of <code>public.notification_setting</code>
	 */
	public static final NotificationSetting NOTIFICATION_SETTING = new NotificationSetting();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<NotificationSettingRecord> getRecordType() {
		return NotificationSettingRecord.class;
	}

	/**
	 * The column <code>public.notification_setting.notification_setting_id</code>.
	 */
	public final TableField<NotificationSettingRecord, Integer> NOTIFICATION_SETTING_ID = createField("notification_setting_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.notification_setting.person_id</code>.
	 */
	public final TableField<NotificationSettingRecord, Integer> PERSON_ID = createField("person_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.notification_setting.notification_type</code>.
	 */
	public final TableField<NotificationSettingRecord, String> NOTIFICATION_TYPE = createField("notification_type", org.jooq.impl.SQLDataType.VARCHAR.length(250), this, "");

	/**
	 * The column <code>public.notification_setting.send_settings</code>.
	 */
	public final TableField<NotificationSettingRecord, String> SEND_SETTINGS = createField("send_settings", org.jooq.impl.SQLDataType.VARCHAR.length(250), this, "");

	/**
	 * Create a <code>public.notification_setting</code> table reference
	 */
	public NotificationSetting() {
		this("notification_setting", null);
	}

	/**
	 * Create an aliased <code>public.notification_setting</code> table reference
	 */
	public NotificationSetting(String alias) {
		this(alias, NOTIFICATION_SETTING);
	}

	private NotificationSetting(String alias, Table<NotificationSettingRecord> aliased) {
		this(alias, aliased, null);
	}

	private NotificationSetting(String alias, Table<NotificationSettingRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<NotificationSettingRecord, Integer> getIdentity() {
		return Keys.IDENTITY_NOTIFICATION_SETTING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<NotificationSettingRecord> getPrimaryKey() {
		return Keys.NOTIFICATION_SETTING_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<NotificationSettingRecord>> getKeys() {
		return Arrays.<UniqueKey<NotificationSettingRecord>>asList(Keys.NOTIFICATION_SETTING_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NotificationSetting as(String alias) {
		return new NotificationSetting(alias, this);
	}

	/**
	 * Rename this table
	 */
	public NotificationSetting rename(String name) {
		return new NotificationSetting(name, null);
	}
}
