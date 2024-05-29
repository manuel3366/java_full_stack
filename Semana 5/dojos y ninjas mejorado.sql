-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema dojos
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema dojos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dojos` DEFAULT CHARACTER SET utf8 ;
USE `dojos` ;

-- -----------------------------------------------------
-- Table `dojos`.`dojo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dojos`.`dojo` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `location` VARCHAR(120) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dojos`.`ninja`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dojos`.`ninja` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `dojo_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_ninja_dojo_idx` (`dojo_id` ASC) VISIBLE,
  CONSTRAINT `fk_ninja_dojo`
    FOREIGN KEY (`dojo_id`)
    REFERENCES `dojos`.`dojo` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dojos`.`skill`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dojos`.`skill` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dojos`.`ninja_has_skill`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dojos`.`ninja_has_skill` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `ninja_id` INT NOT NULL,
  `skill_id` INT NOT NULL,
  PRIMARY KEY (`id`, `ninja_id`, `skill_id`),
  INDEX `fk_ninja_has_skill_skill1_idx` (`skill_id` ASC) VISIBLE,
  INDEX `fk_ninja_has_skill_ninja1_idx` (`ninja_id` ASC) VISIBLE,
  CONSTRAINT `fk_ninja_has_skill_ninja1`
    FOREIGN KEY (`ninja_id`)
    REFERENCES `dojos`.`ninja` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ninja_has_skill_skill1`
    FOREIGN KEY (`skill_id`)
    REFERENCES `dojos`.`skill` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
