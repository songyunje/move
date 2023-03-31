-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema health
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema health
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `health` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `health` ;

-- -----------------------------------------------------
-- Table `health`.`video`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `health`.`video` (
  `id` VARCHAR(45) NOT NULL,
  `title` VARCHAR(45) NOT NULL,
  `part` VARCHAR(45) NOT NULL,
  `channelName` VARCHAR(45) NOT NULL,
  `url` VARCHAR(45) NOT NULL,
  `img` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `health`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `health`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR(45) NULL,
  `user_password` VARCHAR(45) NULL,
  `user_name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `user_id_UNIQUE` (`user_id` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `health`.`healthboard`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `health`.`healthboard` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `writer` VARCHAR(20) NOT NULL,
  `title` VARCHAR(50) NOT NULL,
  `content` TEXT NULL DEFAULT NULL,
  `view_cnt` INT NULL DEFAULT '0',
  `reg_date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  `videoid` VARCHAR(50) NOT NULL,
  `user_id` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `videoid_idx` (`videoid` ASC) VISIBLE,
  INDEX `userid_idx` (`user_id` ASC) VISIBLE,
  CONSTRAINT `videoid`
    FOREIGN KEY (`videoid`)
    REFERENCES `health`.`video` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `userid`
    FOREIGN KEY (`user_id`)
    REFERENCES `health`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 14
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
