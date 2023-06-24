CREATE TABLE [IF NOT EXISTS] order_tb (
   order_id VARCHAR(100) PRIMARY KEY,
   product_id VARCHAR (100) NOT NULL,
   quantity INT,
   price_per_quantity DECIMAL,
   order_date TIMESTAMP
);