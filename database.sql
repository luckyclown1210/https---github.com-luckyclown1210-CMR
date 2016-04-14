create  database CourseMonitorReport
use CourseMonitorReport


create table Faculty
(
F_Id integer IDENTITY(1,1) primary key,
F_Name varchar(50)
)

insert into Faculty values('Information Technology')
insert into Faculty values('Biology')
insert into Faculty values('English')

SELECT * FROM Faculty

create table Course(
	CourseId varchar(50) primary key,
	CourseName varchar(50),
	AcademicSession varchar(50),
	CourseImg varchar(100),
	Description varchar(200),
)

SELECT * FROM Course

insert into Course values ('C1','Interaction design','Summer','interactiondesign.jpg','Good')
insert into Course values ('C2','Java','Summer','java.png','Excellent')
insert into Course values ('C3','Database','Summer','database.jpg','Bad')
insert into Course values ('C4','Web design','Summer','webdesign.jpg','Normal')



create table Staff(
	ST_Id integer primary key,
	ST_Name varchar(50),
	ST_Email varchar(50),
	ST_Username varchar(50),
	ST_Password varchar(50),
	F_Id integer foreign key references Faculty(F_Id)
)

insert into Staff values (1,'Nghia','nghia@gmail.com','kid','123',1)
insert into Staff values (2,'Nam','nam@gmail.com','nam','123',1)
insert into Staff values (3,'Dung','dung@gmail.com','dung','123',1)
insert into Staff values (4,'Mike','mike@gmail.com','mike','123',2)
insert into Staff values (5,'John','john@gmail.com','john','123',2)
insert into Staff values (6,'Vy','vy@gmail.com','vy','123',3)

SELECT * FROM Staff

create  table AssignCourse
(
CourseId varchar(50) foreign key references Course(CourseId),
StudentCount integer,
Status integer,
Year integer,
CL_Id integer foreign key references Staff(ST_Id),
CM_Id integer foreign key references Staff(ST_Id),
primary key (CourseId,Year),
)

INSERT INTO AssignCourse VALUES('C1',100,0,2015,1,2)

SELECT * FROM AssignCourse

Update AssignCourse set Status = 0 Where CourseId='C2'

create table Report(
	ReportId integer  IDENTITY(1,1) primary key,
	Year integer,
	Description text,
	Status int,
	Comment ntext,
	CourseId varchar(50) foreign key references Course(CourseId),
	CL_Id integer foreign key references Staff(ST_Id),
	CM_Id integer foreign key references Staff(ST_Id)
)

INSERT INTO Report VALUES(2015,'Good',1,'','C1',1,2)
SELECT * FROM Report;

Update Report SEt Description = 'Academic Session :Winter 2016
Course code :C1
Course Leader: Nghia
Course Moderator : Nam
Statistical Data
Grade Distribution data:'  WHERE reportID = 1 


create table ManagementStaff(
	MS_Id integer primary key,
	MS_Name varchar(50),
	MS_Email varchar(50),
	MS_Username varchar(50),
	MS_Password varchar(50),
	MS_Role varchar(10),
    F_Id integer foreign key references Faculty(F_Id)
)

SELECT * FROM ManagementStaff

insert into ManagementStaff values (1,'Steve Job','steve@gmail.com','steve','123','PVC',1)
insert into ManagementStaff values (2,'Bill Gate','gate@gmail.com','gate','123','DLT',1)
insert into ManagementStaff values (3,'Lionel Messi','messi@gmail.com','messi','123','DLT',2)

create table Guest(
	G_Id integer primary key,
	G_Name varchar(50),
	G_Email varchar(50),
	G_Username varchar(50),
	G_Password varchar(50)
)

insert into Guest values (1,'Tung','tung@gmail.com','tung','123')
select * from guest

create table AssignFaculty(
	idAF int primary key,
	CourseId varchar(50) foreign key references Course(CourseId),
	FacultyId integer  foreign key references Faculty(F_Id),
	PVC_Id integer foreign key references ManagementStaff(MS_Id),
	DLT_Id integer foreign key references ManagementStaff(MS_Id)
)

Insert into AssignFaculty Values (1,'C1',1,1,2)
Insert into AssignFaculty Values (2,'C1',2,3,1)
Insert into AssignFaculty Values (3,'C2',3,1,3)
select * from AssignFaculty


