CREATE DATABASE eboutique;

CREATE USER 'eboutique_user'@'localhost' IDENTIFIED BY 'password123';

GRANT ALL PRIVILEGES ON eboutique.* TO 'eboutique_user'@'localhost';

FLUSH PRIVILEGES;