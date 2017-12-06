CREATE TABLE [dbo].[Users]
(
	[employeeID] NUMERIC(9) NOT NULL PRIMARY KEY, 
    [username] NCHAR(10) NOT NULL, 
    [password] NCHAR(20) NOT NULL, 
    [uType] INT NOT NULL, 
    [badgeNum] NUMERIC(10) NULL
)
