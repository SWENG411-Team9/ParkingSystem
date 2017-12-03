CREATE TABLE [dbo].[Ticket] (
    [ticketID]  NUMERIC (7)    NOT NULL,
    [badgeNum]  NUMERIC (10)    NOT NULL,
    [price]     NUMERIC (5, 2) NOT NULL,
    [issueDate] DATE           NOT NULL,
    [reason]    NCHAR (140)    NOT NULL,
    [lot]       NCHAR (15)     NOT NULL,
    PRIMARY KEY CLUSTERED ([ticketID] ASC),
    FOREIGN KEY ([plateNum]) REFERENCES [dbo].[Car] ([plateNum])
);

