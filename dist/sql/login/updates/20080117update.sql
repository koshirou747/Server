ALTER TABLE `accounts` CHANGE `access_level` `accessLevel` TINYINT NOT NULL DEFAULT '0';
ALTER TABLE `accounts` MODIFY `lastIP` CHAR(15) NULL DEFAULT NULL;
ALTER TABLE `accounts` MODIFY `lastServer` TINYINT UNSIGNED NULL DEFAULT '1';