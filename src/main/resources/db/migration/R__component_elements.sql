CREATE TABLE IF NOT EXISTS component_elements (
    id                      SERIAL          PRIMARY KEY,
    project_id              BIGINT          NOT NULL,
    env_id                  BIGINT          NOT NULL,
    component_id            BIGINT          NOT NULL,
    element_name            VARCHAR(120)    NOT NULL,
    element_selector        VARCHAR(20)     NOT NULL,
    element_path            TEXT            NOT NULL,
    created_by              VARCHAR(50),
    created_at              TIMESTAMP,
    updated_by              VARCHAR(50),
    updated_at              TIMESTAMP
)
