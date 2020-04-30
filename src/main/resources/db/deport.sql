/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : deport

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 24/04/2020 18:35:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for document_master
-- ----------------------------
DROP TABLE IF EXISTS `document_master`;
CREATE TABLE `document_master`  (
  `order_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '单据编号',
  `object` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '进货商还是出货商',
  `generate` datetime(0) NULL DEFAULT NULL COMMENT '单据生成时间',
  `operator` int(255) NULL DEFAULT NULL COMMENT '单据录入人员',
  `deport_id` int(11) NULL DEFAULT NULL COMMENT '仓库编号',
  `state` int(255) NULL DEFAULT NULL COMMENT '单据类别',
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of document_master
-- ----------------------------
INSERT INTO `document_master` VALUES ('20200401113123LK', '入库', '2020-04-01 00:00:00', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200401113442ZM', '入库', '2020-04-01 11:34:42', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200401143727NZ', '入库', '2020-04-01 14:37:27', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200401144133XQ', '入库', '2020-04-01 14:41:33', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200402091318CW', '出库', '2020-04-02 09:13:18', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200402150938BQ', '入库', '2020-04-02 15:09:38', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200402181754XE', '入库', '2020-04-02 18:17:54', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200409111209AT', '入库', '2020-04-09 11:12:09', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200409111513UT', '出库', '2020-04-09 11:15:13', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200409111652WE', '出库', '2020-04-09 11:16:52', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200410161337VI', '入库', '2020-04-10 16:13:37', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200414141804AY', '入库', '2020-04-14 14:18:04', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200414172002DX', '入库', '2020-04-14 17:20:02', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200417091938LF', '入库', '2020-04-17 09:19:38', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200417092005TX', '入库', '2020-04-17 09:20:05', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200417142230VH', '入库', '2020-04-17 14:22:30', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200420112912YJ', '入库', '2020-04-20 11:29:12', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200422101356IG', '入库', '2020-04-22 10:13:57', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200422101756OT', '入库', '2020-04-22 10:17:56', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200422102156GJ', '入库', '2020-04-22 10:21:56', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200422102251LW', '入库', '2020-04-22 10:22:51', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200422155202BH', '入库', '2020-04-22 15:52:02', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200422155724XL', '入库', '2020-04-22 15:57:24', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200422160029ZN', '入库', '2020-04-22 16:00:29', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200422160518JC', '入库', '2020-04-22 16:05:18', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200422161116JG', '入库', '2020-04-22 16:11:16', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200422163407QA', '入库', '2020-04-22 16:34:07', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200422163551FD', '入库', '2020-04-22 16:35:51', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200422164545RJ', '入库', '2020-04-22 16:45:45', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200422164842YX', '入库', '2020-04-22 16:48:42', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200422165222VP', '入库', '2020-04-22 16:52:22', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200422165623SE', '入库', '2020-04-22 16:56:23', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200422165932MD', '入库', '2020-04-22 16:59:32', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200422170113AM', '入库', '2020-04-22 17:01:13', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200423173616BY', '入库', '2020-04-23 17:36:16', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200423183627RJ', '入库', '2020-04-23 18:36:27', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200423184031OC', '入库', '2020-04-23 18:40:31', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200424110451SN', '入库', '2020-04-24 11:05:18', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200424111546HU', '入库', '2020-04-24 11:18:11', 1, 1, NULL);
INSERT INTO `document_master` VALUES ('20200424155142BA', '入库', '2020-04-24 15:51:54', 1, 1, NULL);

-- ----------------------------
-- Table structure for document_slave
-- ----------------------------
DROP TABLE IF EXISTS `document_slave`;
CREATE TABLE `document_slave`  (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT '任务编号',
  `master_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '主表id',
  `product_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品编号',
  `count` int(11) NULL DEFAULT NULL COMMENT '单据上的商品数量',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `master_id`(`master_id`) USING BTREE,
  INDEX `product_id`(`product_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 67 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of document_slave
-- ----------------------------
INSERT INTO `document_slave` VALUES (4, '20200401113123CK', '3C6B5E4A47F54CCBB58BB8C1B0CB4981', 1);
INSERT INTO `document_slave` VALUES (5, '20200401113442FL', '3C6B5E4A47F54CCBB58BB8C1B0CB4981', 3);
INSERT INTO `document_slave` VALUES (6, '20200401143727BU', '0961315717044E24A512A7D4A3286D26', 1);
INSERT INTO `document_slave` VALUES (7, '20200401144133HR', '4C9EAE1F3BDB4CC283DDA80C8BE06AC3', 12);
INSERT INTO `document_slave` VALUES (8, '20200402091318PH', '0961315717044E24A512A7D4A3286D26', 13);
INSERT INTO `document_slave` VALUES (9, '20200402150938EP', '0961315717044E24A512A7D4A3286D26', 111);
INSERT INTO `document_slave` VALUES (10, '20200402181754LY', '0961315717044E24A512A7D4A3286D26', 11);
INSERT INTO `document_slave` VALUES (11, '20200409111209RL', '0961315717044E24A512A7D4A3286D26', 50);
INSERT INTO `document_slave` VALUES (12, '20200409111513FH', '0961315717044E24A512A7D4A3286D26', 50);
INSERT INTO `document_slave` VALUES (13, '20200409111652XY', '0961315717044E24A512A7D4A3286D26', 50);
INSERT INTO `document_slave` VALUES (14, '20200410161337BI', '0961315717044E24A512A7D4A3286D26', 100);
INSERT INTO `document_slave` VALUES (17, '20200414141804AY', '18B41EC838444B9A9B3672AFD5F9CC08', 10);
INSERT INTO `document_slave` VALUES (18, '20200414172002DX', '18B41EC838444B9A9B3672AFD5F9CC08', 100);
INSERT INTO `document_slave` VALUES (19, '20200417092005TX', '18B41EC838444B9A9B3672AFD5F9CC08', 100);
INSERT INTO `document_slave` VALUES (20, '20200417091938LF', '18B41EC838444B9A9B3672AFD5F9CC08', 10);
INSERT INTO `document_slave` VALUES (21, '20200417142230VH', '18B41EC838444B9A9B3672AFD5F9CC08', 10);
INSERT INTO `document_slave` VALUES (22, '20200420112912YJ', '0961315717044E24A512A7D4A3286D26', 11);
INSERT INTO `document_slave` VALUES (23, '20200422101356IG', '0961315717044E24A512A7D4A3286D26', 10);
INSERT INTO `document_slave` VALUES (24, '20200422101756OT', '0961315717044E24A512A7D4A3286D26', 10);
INSERT INTO `document_slave` VALUES (25, '20200422102156GJ', '0961315717044E24A512A7D4A3286D26', 10);
INSERT INTO `document_slave` VALUES (26, '20200422102251LW', '0961315717044E24A512A7D4A3286D26', 10);
INSERT INTO `document_slave` VALUES (27, '20200422155202BH', '0961315717044E24A512A7D4A3286D26', 10);
INSERT INTO `document_slave` VALUES (28, '20200422155724XL', '0961315717044E24A512A7D4A3286D26', 10);
INSERT INTO `document_slave` VALUES (29, '20200422160029ZN', '0961315717044E24A512A7D4A3286D26', 10);
INSERT INTO `document_slave` VALUES (30, '20200422160518JC', '0961315717044E24A512A7D4A3286D26', 10);
INSERT INTO `document_slave` VALUES (31, '20200422161116JG', '0961315717044E24A512A7D4A3286D26', 100);
INSERT INTO `document_slave` VALUES (32, '20200422163407QA', '0961315717044E24A512A7D4A3286D26', 10);
INSERT INTO `document_slave` VALUES (33, '20200422163551FD', '0961315717044E24A512A7D4A3286D26', 10);
INSERT INTO `document_slave` VALUES (34, '20200422164545RJ', '0961315717044E24A512A7D4A3286D26', 10);
INSERT INTO `document_slave` VALUES (35, '20200422164842YX', '0961315717044E24A512A7D4A3286D26', 1);
INSERT INTO `document_slave` VALUES (36, '20200422165222VP', '0961315717044E24A512A7D4A3286D26', 1);
INSERT INTO `document_slave` VALUES (37, '20200422165623SE', '0961315717044E24A512A7D4A3286D26', 1);
INSERT INTO `document_slave` VALUES (38, '20200422165932MD', '0961315717044E24A512A7D4A3286D26', 1);
INSERT INTO `document_slave` VALUES (39, '20200422170113AM', '0961315717044E24A512A7D4A3286D26', 1);
INSERT INTO `document_slave` VALUES (40, '20200423173616BY', '18B41EC838444B9A9B3672AFD5F9CC08', 10);
INSERT INTO `document_slave` VALUES (41, '20200423183627RJ', '18B41EC838444B9A9B3672AFD5F9CC08', 10);
INSERT INTO `document_slave` VALUES (42, '20200423184031OC', '18B41EC838444B9A9B3672AFD5F9CC08', 1);
INSERT INTO `document_slave` VALUES (56, '20200424105730GS', '18B41EC838444B9A9B3672AFD5F9CC08', 100);
INSERT INTO `document_slave` VALUES (57, '20200424105749NX', '0961315717044E24A512A7D4A3286D26', 10);
INSERT INTO `document_slave` VALUES (58, '20200424105819EU', '60707407DE2F4C61B16C530566AE947E', 100);
INSERT INTO `document_slave` VALUES (59, '20200424110051XG', '60707407DE2F4C61B16C530566AE947E', 100);
INSERT INTO `document_slave` VALUES (60, '20200424110106SV', '18B41EC838444B9A9B3672AFD5F9CC08', 100);
INSERT INTO `document_slave` VALUES (61, '20200424110122XR', '0961315717044E24A512A7D4A3286D26', 100);
INSERT INTO `document_slave` VALUES (62, '20200424110451SN', '0961315717044E24A512A7D4A3286D26', 100);
INSERT INTO `document_slave` VALUES (63, '20200424110451SN', '60707407DE2F4C61B16C530566AE947E', 100);
INSERT INTO `document_slave` VALUES (64, '20200424111546HU', '60707407DE2F4C61B16C530566AE947E', 10);
INSERT INTO `document_slave` VALUES (65, '20200424111546HU', '18B41EC838444B9A9B3672AFD5F9CC08', 10);
INSERT INTO `document_slave` VALUES (66, '20200424155142BA', '18B41EC838444B9A9B3672AFD5F9CC08', 10);

-- ----------------------------
-- Table structure for location
-- ----------------------------
DROP TABLE IF EXISTS `location`;
CREATE TABLE `location`  (
  `location_number` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '库位编号',
  PRIMARY KEY (`location_number`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of location
-- ----------------------------
INSERT INTO `location` VALUES ('A111');
INSERT INTO `location` VALUES ('A112');
INSERT INTO `location` VALUES ('A113');
INSERT INTO `location` VALUES ('A121');
INSERT INTO `location` VALUES ('A122');
INSERT INTO `location` VALUES ('A123');
INSERT INTO `location` VALUES ('A211');
INSERT INTO `location` VALUES ('A212');
INSERT INTO `location` VALUES ('A213');
INSERT INTO `location` VALUES ('A221');
INSERT INTO `location` VALUES ('A222');
INSERT INTO `location` VALUES ('A223');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `product_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '商品序列号',
  `product_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `add_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '商品添加时间',
  `update_time` timestamp(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '商品更新时间',
  `category` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '规格型号',
  `message` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '说明信息',
  `count` int(11) NOT NULL COMMENT '商品信息',
  `warehouse_id` int(11) NULL DEFAULT NULL COMMENT '仓库id',
  PRIMARY KEY (`product_id`) USING BTREE,
  INDEX `warehouse_id`(`warehouse_id`) USING BTREE,
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`warehouse_id`) REFERENCES `warehouse` (`warehouse_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('0961315717044E24A512A7D4A3286D26', '莲花清瘟胶囊', '2020-03-30 14:46:30', '2020-04-24 11:05:21', '1-2-13', 'aaaa', 1243, 1);
INSERT INTO `product` VALUES ('18B41EC838444B9A9B3672AFD5F9CC08', '马克杯', '2020-04-02 17:28:48', '2020-04-24 15:51:57', '1', 'xxxxx', 931, 1);
INSERT INTO `product` VALUES ('22AF37DEE8454B70B21EC43269129B02', '阿萨斯', '2020-04-02 18:20:06', NULL, '1', 'dxxx', 100, 1);
INSERT INTO `product` VALUES ('4C9EAE1F3BDB4CC283DDA80C8BE06AC3', '999感冒灵', '2020-04-01 14:40:45', '2020-04-01 14:41:39', 'q1-231', '1weed额', 112, 1);
INSERT INTO `product` VALUES ('60707407DE2F4C61B16C530566AE947E', '鼠标', '2020-04-02 17:31:58', '2020-04-24 11:18:33', '1', 'xxxxx', 410, 1);
INSERT INTO `product` VALUES ('60707407DE2F4C61B16C530566AE947F', '键盘', '2020-04-09 10:59:54', NULL, '1', 'xxxx', 111, 1);

-- ----------------------------
-- Table structure for product_location
-- ----------------------------
DROP TABLE IF EXISTS `product_location`;
CREATE TABLE `product_location`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `location_num` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '库位编号',
  `product_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品编号',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `product_id`(`product_id`) USING BTREE,
  INDEX `location_num`(`location_num`) USING BTREE,
  CONSTRAINT `product_location_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `product_location_ibfk_3` FOREIGN KEY (`location_num`) REFERENCES `location` (`location_number`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product_location
-- ----------------------------
INSERT INTO `product_location` VALUES (1, 'A111', '0961315717044E24A512A7D4A3286D26');
INSERT INTO `product_location` VALUES (2, 'A112', '18B41EC838444B9A9B3672AFD5F9CC08');
INSERT INTO `product_location` VALUES (3, 'A113', '22AF37DEE8454B70B21EC43269129B02');
INSERT INTO `product_location` VALUES (4, 'A121', '4C9EAE1F3BDB4CC283DDA80C8BE06AC3');
INSERT INTO `product_location` VALUES (5, 'A122', '60707407DE2F4C61B16C530566AE947E');
INSERT INTO `product_location` VALUES (6, 'A123', '60707407DE2F4C61B16C530566AE947F');
INSERT INTO `product_location` VALUES (7, 'A211', '60707407DE2F4C61B16C530566AE947F');
INSERT INTO `product_location` VALUES (9, 'A113', '0961315717044E24A512A7D4A3286D26');
INSERT INTO `product_location` VALUES (10, 'A111', '18B41EC838444B9A9B3672AFD5F9CC08');
INSERT INTO `product_location` VALUES (11, 'A111', '18B41EC838444B9A9B3672AFD5F9CC08');
INSERT INTO `product_location` VALUES (12, 'A111', '18B41EC838444B9A9B3672AFD5F9CC08');
INSERT INTO `product_location` VALUES (13, 'A223', '18B41EC838444B9A9B3672AFD5F9CC08');
INSERT INTO `product_location` VALUES (14, 'A222', '18B41EC838444B9A9B3672AFD5F9CC08');
INSERT INTO `product_location` VALUES (15, 'A113', '18B41EC838444B9A9B3672AFD5F9CC08');

-- ----------------------------
-- Table structure for task_master
-- ----------------------------
DROP TABLE IF EXISTS `task_master`;
CREATE TABLE `task_master`  (
  `task_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '任务id',
  `state` int(2) NULL DEFAULT 0 COMMENT '任务状态（1完成/0未完成/2已失效）',
  PRIMARY KEY (`task_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of task_master
-- ----------------------------
INSERT INTO `task_master` VALUES ('1', 0);
INSERT INTO `task_master` VALUES ('2', 0);

-- ----------------------------
-- Table structure for task_slave
-- ----------------------------
DROP TABLE IF EXISTS `task_slave`;
CREATE TABLE `task_slave`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `master_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '主表id',
  `product_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品id',
  `task_count` int(255) NULL DEFAULT NULL COMMENT '任务数量',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `product_id`(`product_id`) USING BTREE,
  INDEX `master_id`(`master_id`) USING BTREE,
  CONSTRAINT `task_slave_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `task_slave_ibfk_3` FOREIGN KEY (`master_id`) REFERENCES `task_master` (`task_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of task_slave
-- ----------------------------
INSERT INTO `task_slave` VALUES (2, '1', '0961315717044E24A512A7D4A3286D26', 10);
INSERT INTO `task_slave` VALUES (3, '1', '4C9EAE1F3BDB4CC283DDA80C8BE06AC3', 1);
INSERT INTO `task_slave` VALUES (4, '2', '4C9EAE1F3BDB4CC283DDA80C8BE06AC3', 20);

-- ----------------------------
-- Table structure for warehouse
-- ----------------------------
DROP TABLE IF EXISTS `warehouse`;
CREATE TABLE `warehouse`  (
  `warehouse_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '仓库编号',
  `warehouse_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '仓库名称',
  PRIMARY KEY (`warehouse_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of warehouse
-- ----------------------------
INSERT INTO `warehouse` VALUES (1, '1号仓库');
INSERT INTO `warehouse` VALUES (2, '2号仓库');
INSERT INTO `warehouse` VALUES (3, '3号仓库');
INSERT INTO `warehouse` VALUES (4, '4号仓库');

SET FOREIGN_KEY_CHECKS = 1;
