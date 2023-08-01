CREATE TABLE IF NOT EXISTS environments (
    id                        SERIAL          PRIMARY KEY,
    project_id                BIGINT          NOT NULL,
    env_name                  VARCHAR(20)     NOT NULL
)