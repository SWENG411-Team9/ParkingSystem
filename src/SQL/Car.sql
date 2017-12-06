CREATE TABLE [dbo].[Car] (
    [plateNum] NCHAR (7) NOT NULL,
    [make]     NCHAR (15)  NOT NULL,
    [model]    NCHAR (15)  NOT NULL,
    [color]    NCHAR (15)  NOT NULL,
    PRIMARY KEY CLUSTERED ([plateNum] ASC)
);

