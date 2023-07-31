CREATE TABLE IF NOT EXISTS configurations (
    id                        SERIAL          PRIMARY KEY,
    conf_name                 VARCHAR(20)     NOT NULL,
    conf_url                  TEXT            NOT NULL,
    waiting_time              INTEGER         DEFAULT 20 NOT NULL,
    created_by                VARCHAR(50),
    created_at                TIMESTAMP,
    updated_by                VARCHAR(50),
    updated_at                TIMESTAMP
);