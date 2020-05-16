/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50024
Source Host           : localhost:3306
Source Database       : tax

Target Server Type    : MYSQL
Target Server Version : 50024
File Encoding         : 65001

Date: 2020-05-16 18:13:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tax_account
-- ----------------------------
DROP TABLE IF EXISTS `tax_account`;
CREATE TABLE `tax_account` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  `role_id` int(11) default NULL,
  `dept_id` int(11) default NULL,
  `gender` int(11) default NULL,
  `email` varchar(255) default NULL,
  `mobile` varchar(255) default NULL,
  `birthday` date default NULL,
  `state` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `head_img` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tax_dept
-- ----------------------------
DROP TABLE IF EXISTS `tax_dept`;
CREATE TABLE `tax_dept` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tax_privilege
-- ----------------------------
DROP TABLE IF EXISTS `tax_privilege`;
CREATE TABLE `tax_privilege` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `code` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tax_role
-- ----------------------------
DROP TABLE IF EXISTS `tax_role`;
CREATE TABLE `tax_role` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `state` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tax_role_privilege
-- ----------------------------
DROP TABLE IF EXISTS `tax_role_privilege`;
CREATE TABLE `tax_role_privilege` (
  `r_id` int(11) NOT NULL,
  `p_id` int(11) NOT NULL,
  PRIMARY KEY  (`r_id`,`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
