CREATE TABLE payment (
   payment_id INT PRIMARY KEY,
   order_id VARCHAR (100) NOT NULL,
   quantity INT,
   amount DECIMAL,
   status VARCHAR(100),
   transaction_id VARCHAR(100),
   transaction_date TIMESTAMP
);