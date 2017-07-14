#!/bin/sh

DATABASE_USERNAME=bucket_list_user
DATABASE_HOSTNAME=127.0.0.1
DATABASE_NAME=bucket_list

cat << EOF | mysql -u $DATABASE_USERNAME -p$PASSWORD -h $DATABASE_HOSTNAME
create database if not exists $DATABASE_NAME ;
use $DATABASE_NAME;
CREATE TABLE activity (
        id INT(11) NOT NULL AUTO_INCREMENT,
        activity_item VARCHAR(50) NOT NULL,
        done TINYINT(1) UNSIGNED ZEROFILL NULL DEFAULT '0',
        PRIMARY KEY (id)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB;
EOF

