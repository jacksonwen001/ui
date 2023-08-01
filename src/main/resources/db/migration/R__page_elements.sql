CREATE TABLE IF NOT EXISTS page_elements (
    id                SERIAL          PRIMARY KEY,
    project_id        BIGINT          NOT NULL,
    env_id            BIGINT          NOT NULL,
    page_id           BIGINT          NOT NULL,
    element_name      VARCHAR(120)    NOT NULL,
    element_selector  VARCHAR(20)     NOT NULL,
    element_value     TEXT            NOT NULL,
    created_by        VARCHAR(50),
    created_at        TIMESTAMP,
    updated_by        VARCHAR(50),
    updated_at        TIMESTAMP
)
