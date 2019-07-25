/**
 * This class is generated by jOOQ
 */
package de.samply.bbmri.negotiator.jooq;


import de.samply.bbmri.negotiator.jooq.tables.Biobank;
import de.samply.bbmri.negotiator.jooq.tables.Collection;
import de.samply.bbmri.negotiator.jooq.tables.Comment;
import de.samply.bbmri.negotiator.jooq.tables.ConnectorLog;
import de.samply.bbmri.negotiator.jooq.tables.FlaggedQuery;
import de.samply.bbmri.negotiator.jooq.tables.JsonQuery;
import de.samply.bbmri.negotiator.jooq.tables.ListOfDirectories;
import de.samply.bbmri.negotiator.jooq.tables.Network;
import de.samply.bbmri.negotiator.jooq.tables.Offer;
import de.samply.bbmri.negotiator.jooq.tables.Person;
import de.samply.bbmri.negotiator.jooq.tables.PersonCollection;
import de.samply.bbmri.negotiator.jooq.tables.Query;
import de.samply.bbmri.negotiator.jooq.tables.QueryAttachment;
import de.samply.bbmri.negotiator.jooq.tables.QueryAttachmentPrivate;
import de.samply.bbmri.negotiator.jooq.tables.QueryCollection;
import de.samply.bbmri.negotiator.jooq.tables.SchemaVersion;
import de.samply.bbmri.negotiator.jooq.tables.records.BiobankRecord;
import de.samply.bbmri.negotiator.jooq.tables.records.CollectionRecord;
import de.samply.bbmri.negotiator.jooq.tables.records.CommentRecord;
import de.samply.bbmri.negotiator.jooq.tables.records.ConnectorLogRecord;
import de.samply.bbmri.negotiator.jooq.tables.records.FlaggedQueryRecord;
import de.samply.bbmri.negotiator.jooq.tables.records.JsonQueryRecord;
import de.samply.bbmri.negotiator.jooq.tables.records.ListOfDirectoriesRecord;
import de.samply.bbmri.negotiator.jooq.tables.records.NetworkRecord;
import de.samply.bbmri.negotiator.jooq.tables.records.OfferRecord;
import de.samply.bbmri.negotiator.jooq.tables.records.PersonCollectionRecord;
import de.samply.bbmri.negotiator.jooq.tables.records.PersonRecord;
import de.samply.bbmri.negotiator.jooq.tables.records.QueryAttachmentPrivateRecord;
import de.samply.bbmri.negotiator.jooq.tables.records.QueryAttachmentRecord;
import de.samply.bbmri.negotiator.jooq.tables.records.QueryCollectionRecord;
import de.samply.bbmri.negotiator.jooq.tables.records.QueryRecord;
import de.samply.bbmri.negotiator.jooq.tables.records.SchemaVersionRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<BiobankRecord, Integer> IDENTITY_BIOBANK = Identities0.IDENTITY_BIOBANK;
	public static final Identity<CollectionRecord, Integer> IDENTITY_COLLECTION = Identities0.IDENTITY_COLLECTION;
	public static final Identity<CommentRecord, Integer> IDENTITY_COMMENT = Identities0.IDENTITY_COMMENT;
	public static final Identity<ConnectorLogRecord, Integer> IDENTITY_CONNECTOR_LOG = Identities0.IDENTITY_CONNECTOR_LOG;
	public static final Identity<JsonQueryRecord, Integer> IDENTITY_JSON_QUERY = Identities0.IDENTITY_JSON_QUERY;
	public static final Identity<ListOfDirectoriesRecord, Integer> IDENTITY_LIST_OF_DIRECTORIES = Identities0.IDENTITY_LIST_OF_DIRECTORIES;
	public static final Identity<NetworkRecord, Integer> IDENTITY_NETWORK = Identities0.IDENTITY_NETWORK;
	public static final Identity<OfferRecord, Integer> IDENTITY_OFFER = Identities0.IDENTITY_OFFER;
	public static final Identity<PersonRecord, Integer> IDENTITY_PERSON = Identities0.IDENTITY_PERSON;
	public static final Identity<QueryRecord, Integer> IDENTITY_QUERY = Identities0.IDENTITY_QUERY;
	public static final Identity<QueryAttachmentRecord, Integer> IDENTITY_QUERY_ATTACHMENT = Identities0.IDENTITY_QUERY_ATTACHMENT;
	public static final Identity<QueryAttachmentPrivateRecord, Integer> IDENTITY_QUERY_ATTACHMENT_PRIVATE = Identities0.IDENTITY_QUERY_ATTACHMENT_PRIVATE;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<BiobankRecord> BIOBANK_PKEY = UniqueKeys0.BIOBANK_PKEY;
	public static final UniqueKey<CollectionRecord> COLLECTION_PKEY = UniqueKeys0.COLLECTION_PKEY;
	public static final UniqueKey<CommentRecord> COMMENT_PKEY = UniqueKeys0.COMMENT_PKEY;
	public static final UniqueKey<ConnectorLogRecord> CONNECTOR_LOG_PKEY = UniqueKeys0.CONNECTOR_LOG_PKEY;
	public static final UniqueKey<FlaggedQueryRecord> FLAGGED_QUERY_PKEY = UniqueKeys0.FLAGGED_QUERY_PKEY;
	public static final UniqueKey<JsonQueryRecord> JSON_QUERY_PKEY = UniqueKeys0.JSON_QUERY_PKEY;
	public static final UniqueKey<ListOfDirectoriesRecord> LIST_OF_DIRECTORIES_PKEY = UniqueKeys0.LIST_OF_DIRECTORIES_PKEY;
	public static final UniqueKey<NetworkRecord> NETWORK_PKEY = UniqueKeys0.NETWORK_PKEY;
	public static final UniqueKey<OfferRecord> OFFER_PKEY = UniqueKeys0.OFFER_PKEY;
	public static final UniqueKey<PersonRecord> PERSON_PKEY = UniqueKeys0.PERSON_PKEY;
	public static final UniqueKey<PersonRecord> PERSON_AUTH_SUBJECT_KEY = UniqueKeys0.PERSON_AUTH_SUBJECT_KEY;
	public static final UniqueKey<PersonCollectionRecord> PERSON_COLLECTION_PKEY = UniqueKeys0.PERSON_COLLECTION_PKEY;
	public static final UniqueKey<QueryRecord> QUERY_PKEY = UniqueKeys0.QUERY_PKEY;
	public static final UniqueKey<QueryRecord> QUERY_NEGOTIATOR_TOKEN_KEY = UniqueKeys0.QUERY_NEGOTIATOR_TOKEN_KEY;
	public static final UniqueKey<QueryAttachmentRecord> QUERY_ATTACHMENT_PKEY = UniqueKeys0.QUERY_ATTACHMENT_PKEY;
	public static final UniqueKey<QueryAttachmentPrivateRecord> QUERY_ATTACHMENT_PRIVATE_PKEY = UniqueKeys0.QUERY_ATTACHMENT_PRIVATE_PKEY;
	public static final UniqueKey<QueryCollectionRecord> QUERY_COLLECTION_PKEY = UniqueKeys0.QUERY_COLLECTION_PKEY;
	public static final UniqueKey<SchemaVersionRecord> SCHEMA_VERSION_PK = UniqueKeys0.SCHEMA_VERSION_PK;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<CollectionRecord, BiobankRecord> COLLECTION__COLLECTION_BIOBANK_ID_FKEY = ForeignKeys0.COLLECTION__COLLECTION_BIOBANK_ID_FKEY;
	public static final ForeignKey<CommentRecord, QueryRecord> COMMENT__COMMENT_QUERY_ID_FKEY = ForeignKeys0.COMMENT__COMMENT_QUERY_ID_FKEY;
	public static final ForeignKey<CommentRecord, PersonRecord> COMMENT__COMMENT_PERSON_ID_FKEY = ForeignKeys0.COMMENT__COMMENT_PERSON_ID_FKEY;
	public static final ForeignKey<FlaggedQueryRecord, QueryRecord> FLAGGED_QUERY__FLAGGED_QUERY_QUERY_ID_FKEY = ForeignKeys0.FLAGGED_QUERY__FLAGGED_QUERY_QUERY_ID_FKEY;
	public static final ForeignKey<FlaggedQueryRecord, PersonRecord> FLAGGED_QUERY__FLAGGED_QUERY_PERSON_ID_FKEY = ForeignKeys0.FLAGGED_QUERY__FLAGGED_QUERY_PERSON_ID_FKEY;
	public static final ForeignKey<OfferRecord, QueryRecord> OFFER__OFFER_QUERY_ID_FKEY = ForeignKeys0.OFFER__OFFER_QUERY_ID_FKEY;
	public static final ForeignKey<OfferRecord, PersonRecord> OFFER__OFFER_PERSON_ID_FKEY = ForeignKeys0.OFFER__OFFER_PERSON_ID_FKEY;
	public static final ForeignKey<OfferRecord, BiobankRecord> OFFER__OFFER_OFFER_FROM_FKEY = ForeignKeys0.OFFER__OFFER_OFFER_FROM_FKEY;
	public static final ForeignKey<PersonCollectionRecord, PersonRecord> PERSON_COLLECTION__PERSON_COLLECTION_PERSON_ID_FKEY = ForeignKeys0.PERSON_COLLECTION__PERSON_COLLECTION_PERSON_ID_FKEY;
	public static final ForeignKey<PersonCollectionRecord, CollectionRecord> PERSON_COLLECTION__PERSON_COLLECTION_COLLECTION_ID_FKEY = ForeignKeys0.PERSON_COLLECTION__PERSON_COLLECTION_COLLECTION_ID_FKEY;
	public static final ForeignKey<QueryRecord, PersonRecord> QUERY__QUERY_RESEARCHER_ID_FKEY = ForeignKeys0.QUERY__QUERY_RESEARCHER_ID_FKEY;
	public static final ForeignKey<QueryAttachmentRecord, QueryRecord> QUERY_ATTACHMENT__QUERY_ATTACHMENT_QUERY_ID_FKEY = ForeignKeys0.QUERY_ATTACHMENT__QUERY_ATTACHMENT_QUERY_ID_FKEY;
	public static final ForeignKey<QueryCollectionRecord, QueryRecord> QUERY_COLLECTION__QUERY_COLLECTION_QUERY_ID_FKEY = ForeignKeys0.QUERY_COLLECTION__QUERY_COLLECTION_QUERY_ID_FKEY;
	public static final ForeignKey<QueryCollectionRecord, CollectionRecord> QUERY_COLLECTION__QUERY_COLLECTION_COLLECTION_ID_FKEY = ForeignKeys0.QUERY_COLLECTION__QUERY_COLLECTION_COLLECTION_ID_FKEY;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<BiobankRecord, Integer> IDENTITY_BIOBANK = createIdentity(Biobank.BIOBANK, Biobank.BIOBANK.ID);
		public static Identity<CollectionRecord, Integer> IDENTITY_COLLECTION = createIdentity(Collection.COLLECTION, Collection.COLLECTION.ID);
		public static Identity<CommentRecord, Integer> IDENTITY_COMMENT = createIdentity(Comment.COMMENT, Comment.COMMENT.ID);
		public static Identity<ConnectorLogRecord, Integer> IDENTITY_CONNECTOR_LOG = createIdentity(ConnectorLog.CONNECTOR_LOG, ConnectorLog.CONNECTOR_LOG.ID);
		public static Identity<JsonQueryRecord, Integer> IDENTITY_JSON_QUERY = createIdentity(JsonQuery.JSON_QUERY, JsonQuery.JSON_QUERY.ID);
		public static Identity<ListOfDirectoriesRecord, Integer> IDENTITY_LIST_OF_DIRECTORIES = createIdentity(ListOfDirectories.LIST_OF_DIRECTORIES, ListOfDirectories.LIST_OF_DIRECTORIES.ID);
		public static Identity<NetworkRecord, Integer> IDENTITY_NETWORK = createIdentity(Network.NETWORK, Network.NETWORK.ID);
		public static Identity<OfferRecord, Integer> IDENTITY_OFFER = createIdentity(Offer.OFFER, Offer.OFFER.ID);
		public static Identity<PersonRecord, Integer> IDENTITY_PERSON = createIdentity(Person.PERSON, Person.PERSON.ID);
		public static Identity<QueryRecord, Integer> IDENTITY_QUERY = createIdentity(Query.QUERY, Query.QUERY.ID);
		public static Identity<QueryAttachmentRecord, Integer> IDENTITY_QUERY_ATTACHMENT = createIdentity(QueryAttachment.QUERY_ATTACHMENT, QueryAttachment.QUERY_ATTACHMENT.ID);
		public static Identity<QueryAttachmentPrivateRecord, Integer> IDENTITY_QUERY_ATTACHMENT_PRIVATE = createIdentity(QueryAttachmentPrivate.QUERY_ATTACHMENT_PRIVATE, QueryAttachmentPrivate.QUERY_ATTACHMENT_PRIVATE.ID);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<BiobankRecord> BIOBANK_PKEY = createUniqueKey(Biobank.BIOBANK, Biobank.BIOBANK.ID);
		public static final UniqueKey<CollectionRecord> COLLECTION_PKEY = createUniqueKey(Collection.COLLECTION, Collection.COLLECTION.ID);
		public static final UniqueKey<CommentRecord> COMMENT_PKEY = createUniqueKey(Comment.COMMENT, Comment.COMMENT.ID);
		public static final UniqueKey<ConnectorLogRecord> CONNECTOR_LOG_PKEY = createUniqueKey(ConnectorLog.CONNECTOR_LOG, ConnectorLog.CONNECTOR_LOG.ID);
		public static final UniqueKey<FlaggedQueryRecord> FLAGGED_QUERY_PKEY = createUniqueKey(FlaggedQuery.FLAGGED_QUERY, FlaggedQuery.FLAGGED_QUERY.QUERY_ID, FlaggedQuery.FLAGGED_QUERY.PERSON_ID);
		public static final UniqueKey<JsonQueryRecord> JSON_QUERY_PKEY = createUniqueKey(JsonQuery.JSON_QUERY, JsonQuery.JSON_QUERY.ID);
		public static final UniqueKey<ListOfDirectoriesRecord> LIST_OF_DIRECTORIES_PKEY = createUniqueKey(ListOfDirectories.LIST_OF_DIRECTORIES, ListOfDirectories.LIST_OF_DIRECTORIES.ID);
		public static final UniqueKey<NetworkRecord> NETWORK_PKEY = createUniqueKey(Network.NETWORK, Network.NETWORK.ID);
		public static final UniqueKey<OfferRecord> OFFER_PKEY = createUniqueKey(Offer.OFFER, Offer.OFFER.ID);
		public static final UniqueKey<PersonRecord> PERSON_PKEY = createUniqueKey(Person.PERSON, Person.PERSON.ID);
		public static final UniqueKey<PersonRecord> PERSON_AUTH_SUBJECT_KEY = createUniqueKey(Person.PERSON, Person.PERSON.AUTH_SUBJECT);
		public static final UniqueKey<PersonCollectionRecord> PERSON_COLLECTION_PKEY = createUniqueKey(PersonCollection.PERSON_COLLECTION, PersonCollection.PERSON_COLLECTION.PERSON_ID, PersonCollection.PERSON_COLLECTION.COLLECTION_ID);
		public static final UniqueKey<QueryRecord> QUERY_PKEY = createUniqueKey(Query.QUERY, Query.QUERY.ID);
		public static final UniqueKey<QueryRecord> QUERY_NEGOTIATOR_TOKEN_KEY = createUniqueKey(Query.QUERY, Query.QUERY.NEGOTIATOR_TOKEN);
		public static final UniqueKey<QueryAttachmentRecord> QUERY_ATTACHMENT_PKEY = createUniqueKey(QueryAttachment.QUERY_ATTACHMENT, QueryAttachment.QUERY_ATTACHMENT.ID);
		public static final UniqueKey<QueryAttachmentPrivateRecord> QUERY_ATTACHMENT_PRIVATE_PKEY = createUniqueKey(QueryAttachmentPrivate.QUERY_ATTACHMENT_PRIVATE, QueryAttachmentPrivate.QUERY_ATTACHMENT_PRIVATE.ID);
		public static final UniqueKey<QueryCollectionRecord> QUERY_COLLECTION_PKEY = createUniqueKey(QueryCollection.QUERY_COLLECTION, QueryCollection.QUERY_COLLECTION.QUERY_ID, QueryCollection.QUERY_COLLECTION.COLLECTION_ID);
		public static final UniqueKey<SchemaVersionRecord> SCHEMA_VERSION_PK = createUniqueKey(SchemaVersion.SCHEMA_VERSION, SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK);
	}

	private static class ForeignKeys0 extends AbstractKeys {
		public static final ForeignKey<CollectionRecord, BiobankRecord> COLLECTION__COLLECTION_BIOBANK_ID_FKEY = createForeignKey(de.samply.bbmri.negotiator.jooq.Keys.BIOBANK_PKEY, Collection.COLLECTION, Collection.COLLECTION.BIOBANK_ID);
		public static final ForeignKey<CommentRecord, QueryRecord> COMMENT__COMMENT_QUERY_ID_FKEY = createForeignKey(de.samply.bbmri.negotiator.jooq.Keys.QUERY_PKEY, Comment.COMMENT, Comment.COMMENT.QUERY_ID);
		public static final ForeignKey<CommentRecord, PersonRecord> COMMENT__COMMENT_PERSON_ID_FKEY = createForeignKey(de.samply.bbmri.negotiator.jooq.Keys.PERSON_PKEY, Comment.COMMENT, Comment.COMMENT.PERSON_ID);
		public static final ForeignKey<FlaggedQueryRecord, QueryRecord> FLAGGED_QUERY__FLAGGED_QUERY_QUERY_ID_FKEY = createForeignKey(de.samply.bbmri.negotiator.jooq.Keys.QUERY_PKEY, FlaggedQuery.FLAGGED_QUERY, FlaggedQuery.FLAGGED_QUERY.QUERY_ID);
		public static final ForeignKey<FlaggedQueryRecord, PersonRecord> FLAGGED_QUERY__FLAGGED_QUERY_PERSON_ID_FKEY = createForeignKey(de.samply.bbmri.negotiator.jooq.Keys.PERSON_PKEY, FlaggedQuery.FLAGGED_QUERY, FlaggedQuery.FLAGGED_QUERY.PERSON_ID);
		public static final ForeignKey<OfferRecord, QueryRecord> OFFER__OFFER_QUERY_ID_FKEY = createForeignKey(de.samply.bbmri.negotiator.jooq.Keys.QUERY_PKEY, Offer.OFFER, Offer.OFFER.QUERY_ID);
		public static final ForeignKey<OfferRecord, PersonRecord> OFFER__OFFER_PERSON_ID_FKEY = createForeignKey(de.samply.bbmri.negotiator.jooq.Keys.PERSON_PKEY, Offer.OFFER, Offer.OFFER.PERSON_ID);
		public static final ForeignKey<OfferRecord, BiobankRecord> OFFER__OFFER_OFFER_FROM_FKEY = createForeignKey(de.samply.bbmri.negotiator.jooq.Keys.BIOBANK_PKEY, Offer.OFFER, Offer.OFFER.BIOBANK_IN_PRIVATE_CHAT);
		public static final ForeignKey<PersonCollectionRecord, PersonRecord> PERSON_COLLECTION__PERSON_COLLECTION_PERSON_ID_FKEY = createForeignKey(de.samply.bbmri.negotiator.jooq.Keys.PERSON_PKEY, PersonCollection.PERSON_COLLECTION, PersonCollection.PERSON_COLLECTION.PERSON_ID);
		public static final ForeignKey<PersonCollectionRecord, CollectionRecord> PERSON_COLLECTION__PERSON_COLLECTION_COLLECTION_ID_FKEY = createForeignKey(de.samply.bbmri.negotiator.jooq.Keys.COLLECTION_PKEY, PersonCollection.PERSON_COLLECTION, PersonCollection.PERSON_COLLECTION.COLLECTION_ID);
		public static final ForeignKey<QueryRecord, PersonRecord> QUERY__QUERY_RESEARCHER_ID_FKEY = createForeignKey(de.samply.bbmri.negotiator.jooq.Keys.PERSON_PKEY, Query.QUERY, Query.QUERY.RESEARCHER_ID);
		public static final ForeignKey<QueryAttachmentRecord, QueryRecord> QUERY_ATTACHMENT__QUERY_ATTACHMENT_QUERY_ID_FKEY = createForeignKey(de.samply.bbmri.negotiator.jooq.Keys.QUERY_PKEY, QueryAttachment.QUERY_ATTACHMENT, QueryAttachment.QUERY_ATTACHMENT.QUERY_ID);
		public static final ForeignKey<QueryCollectionRecord, QueryRecord> QUERY_COLLECTION__QUERY_COLLECTION_QUERY_ID_FKEY = createForeignKey(de.samply.bbmri.negotiator.jooq.Keys.QUERY_PKEY, QueryCollection.QUERY_COLLECTION, QueryCollection.QUERY_COLLECTION.QUERY_ID);
		public static final ForeignKey<QueryCollectionRecord, CollectionRecord> QUERY_COLLECTION__QUERY_COLLECTION_COLLECTION_ID_FKEY = createForeignKey(de.samply.bbmri.negotiator.jooq.Keys.COLLECTION_PKEY, QueryCollection.QUERY_COLLECTION, QueryCollection.QUERY_COLLECTION.COLLECTION_ID);
	}
}
