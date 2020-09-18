-- 创建用户
CREATE USER 'blog'@'localhost' IDENTIFIED BY 'pass1234';
-- 授权
GRANT ALL ON  'blog'.* TO 'blog'@'localhost';
-- 刷新权限
flush privileges;
