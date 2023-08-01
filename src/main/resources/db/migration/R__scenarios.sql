CREATE TABLE IF NOT EXISTS scenarios (
    id                SERIAL          PRIMARY KEY,
    project_id        BIGINT          NOT NULL,
    env_id            BIGINT          NOT NULL,
    name              VARCHAR(50)     NOT NULL,
    description       TEXT,
    created_by        VARCHAR(50),
    created_at        TIMESTAMP,
    updated_by        VARCHAR(50),
    updated_at        TIMESTAMP
)
