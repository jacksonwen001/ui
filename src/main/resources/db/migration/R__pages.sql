CREATE TABLE IF NOT EXISTS pages (
    id                SERIAL          PRIMARY KEY,
    project_id        BIGINT          NOT NULL,
    env               VARCHAR(10)     NOT NULL,
    page_id           BIGINT          NOT NULL,
    name              VARCHAR(50)     NOT NULL,
    description       TEXT,
    created_by        VARCHAR(50),
    created_at        TIMESTAMP,
    updated_by        VARCHAR(50),
    updated_at        TIMESTAMP
)
