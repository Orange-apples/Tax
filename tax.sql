/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50024
Source Host           : localhost:3306
Source Database       : tax

Target Server Type    : MYSQL
Target Server Version : 50024
File Encoding         : 65001

Date: 2020-05-28 07:40:06
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
-- Records of tax_account
-- ----------------------------
INSERT INTO `tax_account` VALUES ('19', '唐国荣', '12345678', '1', '1', '1', '1104888697@qq.com', '17613738131', '2020-04-26', '正常', 'asd', 'upload/accountImg/159011325790179388418.jpg');
INSERT INTO `tax_account` VALUES ('21', '桑文豪', '12345678', '6', '1', '1', '84956226@qq.com', '17613738131', '2020-05-06', '冻结', '1231', '131313');

-- ----------------------------
-- Table structure for tax_complaint
-- ----------------------------
DROP TABLE IF EXISTS `tax_complaint`;
CREATE TABLE `tax_complaint` (
  `id` int(11) NOT NULL auto_increment,
  `title` varchar(255) default NULL,
  `state` varchar(255) default '0',
  `account_id` int(255) default NULL,
  `create_time` datetime default NULL,
  `dept_id` int(11) default NULL,
  `use_name` varchar(255) default NULL,
  `deal_info` varchar(255) default NULL,
  `content` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tax_complaint
-- ----------------------------
INSERT INTO `tax_complaint` VALUES ('1', '火热促销中', '0', '19', '2020-05-27 15:03:21', '1', '1', null, '啊实打实的');
INSERT INTO `tax_complaint` VALUES ('2', '火热促销中', '0', '19', '2020-05-27 15:04:26', '1', '1', null, '啊实打实的');
INSERT INTO `tax_complaint` VALUES ('3', '桑文豪有女朋友了', '0', '19', '2020-05-27 15:19:26', '1', '0', null, '三位根号');

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
-- Records of tax_dept
-- ----------------------------
INSERT INTO `tax_dept` VALUES ('1', '开发部');

-- ----------------------------
-- Table structure for tax_info
-- ----------------------------
DROP TABLE IF EXISTS `tax_info`;
CREATE TABLE `tax_info` (
  `id` int(11) NOT NULL auto_increment,
  `refer` varchar(255) default NULL,
  `category_id` int(11) default NULL,
  `title` varchar(255) default NULL,
  `content` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `account_id` int(11) default NULL,
  `create_time` datetime default NULL,
  `state` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tax_info
-- ----------------------------
INSERT INTO `tax_info` VALUES ('1', '桑文豪', '2', '桑文豪有女朋友了', '今日晚上惊现桑文豪和神秘女子约会', '666', '19', '2020-05-26 07:31:22', '1');
INSERT INTO `tax_info` VALUES ('2', '新浪网', '2', '关于两会的工作通知', '两会期间，习近平主席...', '认真学习，做好笔记', '19', '2020-05-25 17:08:38', '1');
INSERT INTO `tax_info` VALUES ('3', '网易', '1', '第五人格公测开始', '第五人个与今日开始了公测', '首次登录送限定皮肤', '19', '2020-05-25 17:45:02', '1');
INSERT INTO `tax_info` VALUES ('6', '腾讯网', '2', '马化腾破产', '万亿集团腾讯公司于今日宣布破产', '666', '19', '2020-05-25 17:48:43', '1');

-- ----------------------------
-- Table structure for tax_info_category
-- ----------------------------
DROP TABLE IF EXISTS `tax_info_category`;
CREATE TABLE `tax_info_category` (
  `id` int(11) NOT NULL,
  `name` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tax_info_category
-- ----------------------------
INSERT INTO `tax_info_category` VALUES ('1', '投诉');
INSERT INTO `tax_info_category` VALUES ('2', '通知');
INSERT INTO `tax_info_category` VALUES ('3', '会议');

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
-- Records of tax_privilege
-- ----------------------------
INSERT INTO `tax_privilege` VALUES ('1', '个人工作台', '1');
INSERT INTO `tax_privilege` VALUES ('2', '纳税服务', '1');
INSERT INTO `tax_privilege` VALUES ('3', '学习空间', '1');
INSERT INTO `tax_privilege` VALUES ('4', '后勤服务', null);
INSERT INTO `tax_privilege` VALUES ('5', '行政管理', null);

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
-- Records of tax_role
-- ----------------------------
INSERT INTO `tax_role` VALUES ('1', '管理员', '有效');
INSERT INTO `tax_role` VALUES ('6', '普通用户', '有效');

-- ----------------------------
-- Table structure for tax_role_privilege
-- ----------------------------
DROP TABLE IF EXISTS `tax_role_privilege`;
CREATE TABLE `tax_role_privilege` (
  `r_id` int(11) NOT NULL,
  `p_id` int(11) NOT NULL,
  PRIMARY KEY  (`r_id`,`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tax_role_privilege
-- ----------------------------
INSERT INTO `tax_role_privilege` VALUES ('1', '1');
INSERT INTO `tax_role_privilege` VALUES ('1', '2');
INSERT INTO `tax_role_privilege` VALUES ('1', '3');
INSERT INTO `tax_role_privilege` VALUES ('1', '4');
INSERT INTO `tax_role_privilege` VALUES ('1', '5');
INSERT INTO `tax_role_privilege` VALUES ('6', '1');
