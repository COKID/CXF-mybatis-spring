# Host: localhost  (Version 5.7.24-log)
# Date: 2019-01-23 16:20:04
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "yum_student"
#

DROP TABLE IF EXISTS `yum_student`;
CREATE TABLE `yum_student` (
  `Id` int(10) NOT NULL DEFAULT '0',
  `name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "yum_student"
#

INSERT INTO `yum_student` VALUES (20190001,'张三','男','上海市8080号'),(20190002,'李四','女','北京市3306号');
