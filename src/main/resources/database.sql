﻿
CREATE TABLE "person" (
    "id" SERIAL NOT NULL,
    "authData" TEXT NOT NULL,
    "personType" CHARACTER(1) NOT NULL,
    "personImage" BYTEA,
    PRIMARY KEY ("id")
);


COMMENT ON TABLE "person" IS 'person table which is parent of researcher and owner';


COMMENT ON COLUMN "person"."id" IS 'primary key';


COMMENT ON COLUMN "person"."authData" IS 'authentication string that comes from ''samply auth''';


COMMENT ON COLUMN "person"."personType" IS 'describes wether the person is researcher or owner - one of the the two child classes. ';


COMMENT ON COLUMN "person"."personImage" IS 'image/avatar of the person';


CREATE TABLE "researcher" (
    "id" SERIAL NOT NULL,
    PRIMARY KEY("id"),
    FOREIGN KEY ("id") REFERENCES "person"("id") ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE INDEX "idIndexResearcher" ON "researcher" ("id");


COMMENT ON TABLE "researcher" IS 'researcher table - one of the child''s of the person table ';


COMMENT ON COLUMN "researcher"."id" IS 'This id is the primary key of person table which is used here as both primary key and foreign key for the table';


CREATE TABLE "location" (
    "id" SERIAL NOT NULL,
    "name" CHARACTER VARYING(255) NOT NULL,
    PRIMARY KEY ("id")
);


COMMENT ON TABLE "location" IS 'Table to store locations of researchers';


COMMENT ON COLUMN "location"."id" IS 'primary key';


COMMENT ON COLUMN "location"."name" IS 'location name';


CREATE TABLE "owner" (
    "id" SERIAL NOT NULL,
    "locationId" INTEGER NOT NULL,
    PRIMARY KEY ("id"),
    FOREIGN KEY ("id") REFERENCES "person"("id") ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY ("locationId") REFERENCES "location"("id") ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE INDEX "locationIdIndexOwner" ON "owner" ("locationId");


COMMENT ON TABLE "owner" IS 'Owner table is one of the child of person table  ';


COMMENT ON COLUMN "owner"."id" IS 'This foreign key is the primary key of person table';


COMMENT ON COLUMN "owner"."locationId" IS 'This foreign key is the primary key of person table';


CREATE TABLE "query" (
    "id" SERIAL NOT NULL,
    "title" CHARACTER VARYING(255) NOT NULL,
    "text" TEXT,
    "dateTime" TIMESTAMP WITHOUT TIME ZONE,
    "researcherId" INTEGER NOT NULL,
    PRIMARY KEY ("id"),
    FOREIGN KEY ("researcherId") REFERENCES "researcher"("id") ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE INDEX "researcherIdIndexQuery" ON "query" ("researcherId");


COMMENT ON TABLE "query" IS 'query table to contain all  queries';


COMMENT ON COLUMN "query"."id" IS 'primary key';


COMMENT ON COLUMN "query"."title" IS 'title of query';


COMMENT ON COLUMN "query"."text" IS 'text of query';


COMMENT ON COLUMN "query"."dateTime" IS 'date and time of query with out time zone';


COMMENT ON COLUMN "query"."researcherId" IS 'Foreign key. Exists as primary key in the researcher table(which takes it in turn from the person table)';


CREATE TABLE "tag" (
    "id" SERIAL NOT NULL,
    "queryId" INTEGER NOT NULL,
    "text" CHARACTER VARYING(255) NOT NULL,
    PRIMARY KEY("id"),
    FOREIGN KEY ("queryId") REFERENCES "query"("id") ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE INDEX "queryIdIndexTag" ON "tag" ("queryId");


COMMENT ON TABLE "tag" IS 'Table that contains tags for queries';


COMMENT ON COLUMN "tag"."id" IS 'Primary key';


COMMENT ON COLUMN "tag"."queryId" IS 'Foreign key which exists in the query table as primary key';


COMMENT ON COLUMN "tag"."text" IS 'Text for the given tag id';


CREATE TABLE "comment" (
    "id" SERIAL NOT NULL,
    "queryId" INTEGER NOT NULL,
    "personId" INTEGER NOT NULL,
    "timeStamp" TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    "text" TEXT NOT NULL,
    PRIMARY KEY("id"),
    FOREIGN KEY ("queryId") REFERENCES "query"("id") ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY ("personId") REFERENCES "person"("id") ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE INDEX "queryIdIndexComment" ON "comment" ("queryId");
CREATE INDEX "personIdIndexComment" ON "comment" ("personId");


COMMENT ON TABLE "comment" IS 'table to store comments on a query';


COMMENT ON COLUMN "comment"."id" IS 'Primary key';


COMMENT ON COLUMN "comment"."queryId" IS 'Foreign key which exists as primary key in the query table. ';


COMMENT ON COLUMN "comment"."timeStamp" IS 'timestamp of when the comment was made.';


COMMENT ON COLUMN "comment"."personId" IS 'Foreign key which exists as primary key in the person table. describes the person who made the comment.';


COMMENT ON COLUMN "comment"."text" IS 'Text of the comment.';


CREATE TABLE "taggedQuery" (
    "queryId" INTEGER NOT NULL,
    "tagId" INTEGER NOT NULL,
    PRIMARY KEY("queryId", "tagId"),
    FOREIGN KEY ("tagId") REFERENCES "tag"("id") ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY ("queryId") REFERENCES "query"("id") ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE INDEX "tagIdIndexTaggedQuery" ON "taggedQuery" ("tagId");
CREATE INDEX "queryIdIndexTaggedQuery" ON "taggedQuery" ("queryId");


COMMENT ON TABLE "taggedQuery" IS 'Table for queries that are tagged by names e.g. colonCancer,SkinCancer etc. Tag names need to be decided .';


COMMENT ON COLUMN "taggedQuery"."queryId" IS 'This column along with tagId will make the primary key. Its also a foreign key here, taken from query table';


COMMENT ON COLUMN "taggedQuery"."tagId" IS 'This column along with the Queryid column will make the primary key. Its also a foreign key here, taken from "tag" table';


CREATE TABLE "flaggedQuery" (
    "queryId" INTEGER NULL,
    "ownerId" INTEGER NULL,
    "flag" CHARACTER(1),
    PRIMARY KEY("queryId", "ownerId"),
    FOREIGN KEY ("ownerId") REFERENCES "owner"("id") ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY ("queryId") REFERENCES "query"("id") ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE INDEX "ownerIdIndexFlaggedQuery" ON "flaggedQuery" ("ownerId");
CREATE INDEX "queryIdIndexFlaggedQuery" ON "flaggedQuery" ("queryId");


COMMENT ON TABLE "flaggedQuery" IS 'Table for queries that are flagged/bookmarked. bookmark options are starred, archived and ignored.';


COMMENT ON COLUMN "flaggedQuery"."queryId" IS 'This column along with ownerId will make the primary key. Its also a foreign key here, taken from query table';


COMMENT ON COLUMN "flaggedQuery"."ownerId" IS 'This column along with the id column will make the primary key. Its also a foreign key here, taken from owner(which itself takes it from person) table';


COMMENT ON COLUMN "flaggedQuery"."flag" IS 'The flag of the comment. One character letter. (A) archived, (I) ignored, (S) starred';
