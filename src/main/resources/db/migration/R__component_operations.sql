CREATE TABLE IF NOT EXISTS component_operations (
    id                      SERIAL          PRIMARY KEY,
    project_id              BIGINT          NOT NULL,
    env_id                  BIGINT          NOT NULL,
    component_id            BIGINT          NOT NULL,
    description             TEXT            NOT NULL,
    created_by              VARCHAR(50),
    created_at              TIMESTAMP,
    updated_by              VARCHAR(50),
    updated_at              TIMESTAMP
)
