CREATE TABLE IF NOT EXISTS scenario_pages (
    id                SERIAL          PRIMARY KEY,
    project_id        BIGINT          NOT NULL,
    env_id            BIGINT          NOT NULL,
    scenario_id       BIGINT          NOT NULL,
    page_id           BIGINT          NOT NULL,
    order_no          INTEGER         NOT NULL,
    created_by        VARCHAR(50),
    created_at        TIMESTAMP,
    updated_by        VARCHAR(50),
    updated_at        TIMESTAMP
)
