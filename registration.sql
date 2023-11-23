create database employees;
CREATE TABLE `employee` (
    `id` INT AUTO_INCREMENT PRIMARY KEY,
    `first_name` VARCHAR(20) DEFAULT NULL,
    `last_name` VARCHAR(20) DEFAULT NULL,
    `username` VARCHAR(99) DEFAULT NULL,
    `address` VARCHAR(45) DEFAULT NULL,
    `contact` VARCHAR(45) DEFAULT NULL,
    `password` VARCHAR(20) DEFAULT NULL,
    INDEX (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

