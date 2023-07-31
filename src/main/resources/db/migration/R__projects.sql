CREATE TABLE IF NOT EXISTS projects (
    id                        SERIAL          PRIMARY KEY,
    project_name              VARCHAR(129)    NOT NULL,
    project_description       TEXT,
    created_by                VARCHAR(50),
    created_at                TIMESTAMP,
    updated_by                VARCHAR(50),
    updated_at                TIMESTAMP
);
--ALTER TABLE projects RENAME COLUMN name to project_name;
--ALTER TABLE projects RENAME COLUMN description to project_description;