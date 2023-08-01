CREATE TABLE IF NOT EXISTS page_steps (
    id                SERIAL          PRIMARY KEY,
    project_id        BIGINT          NOT NULL,
    env_id            BIGINT          NOT NULL,
    page_id           BIGINT          NOT NULL,
    page_operation_id BIGINT          NOT NULL,
    command           VARCHAR(50)     NOT NULL,
    element_id        BIGINT,
    target_value      TEXT,
    created_by        VARCHAR(50),
    created_at        TIMESTAMP,
    updated_by        VARCHAR(50),
    updated_at        TIMESTAMP
)
