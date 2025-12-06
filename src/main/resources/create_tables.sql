CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(60) UNIQUE NOT NULL,
    password VARCHAR(255),
    created_at TIMESTAMP DEFAULT NOW(),
    updated_at TIMESTAMP DEFAULT NOW(),
    deleted_at BOOLEAN DEFAULT FALSE
);

CREATE TABLE categories (
    id SERIAL PRIMARY KEY,
    user_id INT NOT NULL REFERENCES users(id),--foreign key
    title VARCHAR(50) NOT NULL,
    color CHAR(7),
    created_at TIMESTAMP DEFAULT NOW(),
    updated_at TIMESTAMP DEFAULT NOW(),
    deleted_at BOOLEAN DEFAULT FALSE
);

CREATE TABLE todos (
    id SERIAL PRIMARY KEY,
    user_id INT NOT NULL REFERENCES users(id),--foreign key
    category_id INT NOT NULL REFERENCES categories(id),--foreign key
    title VARCHAR(300) NOT NULL,
    status VARCHAR(20) DEFAULT 'new',
    due_date TIMESTAMP,
    created_at TIMESTAMP DEFAULT NOW(),
    updated_at TIMESTAMP DEFAULT NOW(),
    deleted_at BOOLEAN DEFAULT FALSE
);

CREATE TABLE reminder (
    id SERIAL PRIMARY KEY,
    todos_id INT NOT NULL REFERENCES todos(id),--foreign key
    remind_at TIMESTAMP,
    sent BOOLEAN DEFAULT FALSE,
    created_at TIMESTAMP DEFAULT NOW(),
    updated_at TIMESTAMP DEFAULT NOW(),
    deleted_at BOOLEAN DEFAULT FALSE
);




