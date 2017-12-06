CREATE TABLE [dbo].[ParkingPass] (
    [permitNum]      NUMERIC (12) NOT NULL,
    [permitType]     INT          NOT NULL,
    [experationDate] DATE         NOT NULL,
    [parkerID]       NUMERIC (9)  NOT NULL,
    [carPlateNum]    NCHAR (7)  NOT NULL,
    PRIMARY KEY CLUSTERED ([permitNum] ASC),
    FOREIGN KEY ([carPlateNum]) REFERENCES [dbo].[Car] ([plateNum]),
    FOREIGN KEY ([parkerID]) REFERENCES [dbo].[Parker] ([parkerID])
);

