CREATE TABLE State (
    id INT AUTO_INCREMENT PRIMARY KEY,
    state_code VARCHAR(10) NOT NULL,
    state_name VARCHAR(100) NOT NULL,
    UNIQUE(state_code)
);