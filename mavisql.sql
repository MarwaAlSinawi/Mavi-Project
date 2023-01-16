create database API ;
use API ;
create table SoloProject(
id integer PRIMARY KEY IDENTITY(1,1),
web_pages varchar(1000),
state_province varchar(100),
alpha_two_code varchar(100),
name varchar(100),
country varchar(100),
domains varchar(100)
)
Select * from SoloProject;