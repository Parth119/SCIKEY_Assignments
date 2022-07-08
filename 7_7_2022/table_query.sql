USE [SpringBoot-DTO-Example]
GO

/****** Object:  Table [dbo].[Users]    Script Date: 08-07-2022 03:22:29 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Users](
	[id] [nchar](10) NOT NULL,
	[firstName] [nchar](20) NOT NULL,
	[lastName] [nchar](20) NOT NULL,
	[password] [nchar](20) NOT NULL,
	[email] [nchar](30) NOT NULL,
 CONSTRAINT [PK_Users] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO


