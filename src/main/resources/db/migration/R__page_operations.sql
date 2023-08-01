CREATE TABLE IF NOT EXISTS page_operations (
    id                SERIAL          PRIMARY KEY,
    project_id        BIGINT          NOT NULL,
    env_id            BIGINT          NOT NULL,
    page_id           BIGINT          NOT NULL,
    name              VARCHAR(50)     NOT NULL,
    created_by        VARCHAR(50),
    created_at        TIMESTAMP,
    updated_by        VARCHAR(50),
    updated_at        TIMESTAMP
)
