USE [master]
GO
/****** Object:  Database [J3.L.P0017]    Script Date: 6/21/2021 2:09:34 PM ******/
CREATE DATABASE [J3.L.P0017]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'J3.L.P0017', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\J3.L.P0017.mdf' , SIZE = 4096KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'J3.L.P0017_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\J3.L.P0017_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [J3.L.P0017] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [J3.L.P0017].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [J3.L.P0017] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [J3.L.P0017] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [J3.L.P0017] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [J3.L.P0017] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [J3.L.P0017] SET ARITHABORT OFF 
GO
ALTER DATABASE [J3.L.P0017] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [J3.L.P0017] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [J3.L.P0017] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [J3.L.P0017] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [J3.L.P0017] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [J3.L.P0017] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [J3.L.P0017] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [J3.L.P0017] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [J3.L.P0017] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [J3.L.P0017] SET  DISABLE_BROKER 
GO
ALTER DATABASE [J3.L.P0017] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [J3.L.P0017] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [J3.L.P0017] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [J3.L.P0017] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [J3.L.P0017] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [J3.L.P0017] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [J3.L.P0017] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [J3.L.P0017] SET RECOVERY FULL 
GO
ALTER DATABASE [J3.L.P0017] SET  MULTI_USER 
GO
ALTER DATABASE [J3.L.P0017] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [J3.L.P0017] SET DB_CHAINING OFF 
GO
ALTER DATABASE [J3.L.P0017] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [J3.L.P0017] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [J3.L.P0017] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'J3.L.P0017', N'ON'
GO
USE [J3.L.P0017]
GO
/****** Object:  Table [dbo].[Contact]    Script Date: 6/21/2021 2:09:34 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Contact](
	[telephone] [nvarchar](50) NULL,
	[email] [nvarchar](50) NULL,
	[fb_url] [nvarchar](50) NULL,
	[tw_url] [nvarchar](50) NULL,
	[gg_url] [nvarchar](50) NULL,
	[about] [nvarchar](300) NULL,
	[address] [nvarchar](100) NULL,
	[city] [nvarchar](50) NULL,
	[country] [nvarchar](50) NULL,
	[map_url] [nvarchar](300) NULL,
	[img_main] [nvarchar](50) NULL,
	[icon_fb] [nvarchar](50) NULL,
	[icon_tw] [nvarchar](50) NULL,
	[icon_gg] [nvarchar](50) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Gallery]    Script Date: 6/21/2021 2:09:34 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Gallery](
	[id] [int] NULL,
	[name] [nvarchar](50) NULL,
	[description] [nvarchar](200) NULL,
	[image] [nvarchar](100) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Image]    Script Date: 6/21/2021 2:09:34 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Image](
	[id] [int] NULL,
	[gallery_id] [int] NULL,
	[image] [nvarchar](100) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Views]    Script Date: 6/21/2021 2:09:34 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Views](
	[ViewsCount] [int] NULL
) ON [PRIMARY]

GO
INSERT [dbo].[Contact] ([telephone], [email], [fb_url], [tw_url], [gg_url], [about], [address], [city], [country], [map_url], [img_main], [icon_fb], [icon_tw], [icon_gg]) VALUES (N'0987654345', N'email@gmail.com', N'https://facebook.com/', N'https://twitter.com/?lang=vi', N'https://www.google.com/', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enimLorem ipsum dolor sit amet, consectetuer adipiscing elit, sed', N'2173 Rose Street', N'Bridgeview', N'USA', N'https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3724.458650859533!2d105.52420231540215!3d21.014326593645716!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31345b465a4e65fb%3A0xaae6040cfabe8fe!2zxJDhuqFpIGjhu41jIEZQVA!5e0!3m2!1svi!2s!4v1585369141317!5m2!1svi!2s', N'c8.jpg', N'facebook.png', N'tw.png', N'gg.png')
INSERT [dbo].[Gallery] ([id], [name], [description], [image]) VALUES (1, N'Gallery 1', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim', N'c1.jpg')
INSERT [dbo].[Gallery] ([id], [name], [description], [image]) VALUES (2, N'Gallery 2', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim', N'c2.jpg')
INSERT [dbo].[Gallery] ([id], [name], [description], [image]) VALUES (3, N'Gallery 3', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim', N'c3.jpg')
INSERT [dbo].[Gallery] ([id], [name], [description], [image]) VALUES (4, N'Gallery 4', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim', N'c4.jpg')
INSERT [dbo].[Gallery] ([id], [name], [description], [image]) VALUES (5, N'Gallery 5', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim', N'c5.jpg')
INSERT [dbo].[Gallery] ([id], [name], [description], [image]) VALUES (6, N'Gallery 6', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim', N'c6.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (1, 1, N'c1.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (2, 1, N'c2.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (3, 1, N'c3.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (4, 1, N'c4.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (5, 1, N'c5.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (6, 1, N'c6.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (7, 1, N'c7.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (8, 1, N'c8.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (9, 1, N'c1.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (10, 1, N'c2.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (11, 2, N'c2.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (12, 2, N'c1.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (13, 2, N'c3.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (14, 2, N'c4.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (15, 2, N'c5.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (16, 2, N'c6.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (17, 2, N'c7.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (18, 2, N'c8.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (19, 2, N'c1.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (20, 2, N'c2.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (21, 3, N'c3.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (22, 3, N'c1.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (23, 3, N'c2.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (24, 3, N'c4.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (25, 3, N'c5.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (26, 3, N'c6.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (27, 3, N'c7.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (28, 3, N'c8.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (29, 3, N'c1.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (30, 3, N'c2.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (31, 4, N'c4.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (32, 4, N'c1.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (33, 4, N'c2.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (34, 4, N'c3.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (35, 4, N'c5.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (36, 4, N'c6.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (37, 4, N'c7.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (38, 4, N'c8.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (39, 4, N'c1.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (40, 4, N'c2.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (41, 5, N'c5.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (42, 5, N'c1.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (43, 5, N'c2.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (44, 5, N'c3.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (45, 5, N'c4.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (46, 5, N'c6.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (47, 5, N'c7.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (48, 5, N'c8.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (49, 5, N'c1.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (50, 5, N'c2.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (51, 6, N'c6.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (52, 6, N'c1.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (53, 6, N'c2.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (54, 6, N'c3.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (55, 6, N'c4.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (56, 6, N'c5.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (57, 6, N'c7.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (58, 6, N'c8.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (59, 6, N'c1.jpg')
INSERT [dbo].[Image] ([id], [gallery_id], [image]) VALUES (60, 6, N'c2.jpg')
INSERT [dbo].[Views] ([ViewsCount]) VALUES (59)
USE [master]
GO
ALTER DATABASE [J3.L.P0017] SET  READ_WRITE 
GO
