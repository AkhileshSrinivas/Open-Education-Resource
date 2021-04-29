/*
MySQL Data Transfer
Source Host: localhost
Source Database: learningframework
Target Host: localhost
Target Database: learningframework
Date: 3/26/2018 9:47:08 PM
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for feedback
-- ----------------------------
DROP TABLE IF EXISTS `feedback`;
CREATE TABLE `feedback` (
  `filename` varchar(20) default NULL,
  `rating` varchar(20) default NULL,
  `username` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for keywords
-- ----------------------------
DROP TABLE IF EXISTS `keywords`;
CREATE TABLE `keywords` (
  `keyword` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for learningobjects
-- ----------------------------
DROP TABLE IF EXISTS `learningobjects`;
CREATE TABLE `learningobjects` (
  `filename` varchar(100) default NULL,
  `keyword` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `name` varchar(20) default NULL,
  `password` varchar(20) default NULL,
  `role` varchar(20) default NULL,
  `address` varchar(20) default NULL,
  `sex` varchar(20) default NULL,
  `emailid` varchar(30) default NULL,
  `dob` varchar(20) default NULL,
  `bio` varchar(20) default NULL,
  `interests` varchar(40) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `feedback` VALUES ('abc.txt', 'very good', 'jhon@gmail.com');
INSERT INTO `feedback` VALUES ('row x column.txt', 'very good', 'jhon@gmail.com');
INSERT INTO `feedback` VALUES ('row x column.txt', 'very good', 'jhon@gmail.com');
INSERT INTO `feedback` VALUES ('game.csv', 'good', 'jhon@gmail.com');
INSERT INTO `feedback` VALUES ('game.csv', 'good', 'jhon@gmail.com');
INSERT INTO `keywords` VALUES ('study');
INSERT INTO `keywords` VALUES ('maths');
INSERT INTO `keywords` VALUES ('pdf');
INSERT INTO `keywords` VALUES ('algorithm');
INSERT INTO `keywords` VALUES ('add');
INSERT INTO `keywords` VALUES ('file');
INSERT INTO `keywords` VALUES ('column');
INSERT INTO `keywords` VALUES ('row');
INSERT INTO `keywords` VALUES ('play');
INSERT INTO `keywords` VALUES ('new');
INSERT INTO `keywords` VALUES ('sports');
INSERT INTO `keywords` VALUES ('games');
INSERT INTO `keywords` VALUES ('ga');
INSERT INTO `learningobjects` VALUES ('abc.txt', 'pdf,sdasdasd, column, row, ');
INSERT INTO `learningobjects` VALUES ('row x column.txt', 'pdf, maths, column, row, ');
INSERT INTO `learningobjects` VALUES ('QWERty.txt', 'pdf, maths,row, ');
INSERT INTO `learningobjects` VALUES ('game.csv', 'play, new, sports, maths, games, ga, ');
INSERT INTO `users` VALUES ('admin', 'admin', 'Lecturer', 'karwar', 'male', 'admin@gmail.com', '10-20-20', 'student', 'interest_development');
INSERT INTO `users` VALUES ('jhon', '123456', 'User', 'jdfkskjf', 'male', 'jhon@gmail.com', '12-12-12', 'svdfbdbfzx', 'interest_development');
