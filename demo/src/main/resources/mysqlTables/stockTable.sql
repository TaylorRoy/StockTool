CREATE TABLE IF NOT EXISTS stock(
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  buyDate DATE,
  shares INT
);