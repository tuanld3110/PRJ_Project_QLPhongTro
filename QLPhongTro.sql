USE [QLPhongTro]
GO
/****** Object:  Table [dbo].[chuNha]    Script Date: 03/20/2022 21:05:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[chuNha](
	[username] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_chuNha] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[chuNha] ([username], [password]) VALUES (N'tuan3110', N'3110')
/****** Object:  Table [dbo].[khachHang]    Script Date: 03/20/2022 21:05:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[khachHang](
	[idKH] [int] IDENTITY(1,1) NOT NULL,
	[tenKH] [nvarchar](50) NOT NULL,
	[SDT] [nchar](15) NOT NULL,
	[CMND] [nchar](15) NOT NULL,
	[gioiTinh] [int] NOT NULL,
	[trangThai] [int] NOT NULL,
 CONSTRAINT [PK_khachHang] PRIMARY KEY CLUSTERED 
(
	[idKH] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[khachHang] ON
INSERT [dbo].[khachHang] ([idKH], [tenKH], [SDT], [CMND], [gioiTinh], [trangThai]) VALUES (11, N'Lê Tuấn', N'0789123456     ', N'092200006400   ', 1, 0)
INSERT [dbo].[khachHang] ([idKH], [tenKH], [SDT], [CMND], [gioiTinh], [trangThai]) VALUES (12, N'Huy Minh', N'0915994525     ', N'098200005500   ', 1, 1)
INSERT [dbo].[khachHang] ([idKH], [tenKH], [SDT], [CMND], [gioiTinh], [trangThai]) VALUES (13, N'Minh A', N'0789123123     ', N'092200004450   ', 2, 1)
INSERT [dbo].[khachHang] ([idKH], [tenKH], [SDT], [CMND], [gioiTinh], [trangThai]) VALUES (14, N'Ðình Ðing', N'0789124561     ', N'092201110600   ', 1, 1)
INSERT [dbo].[khachHang] ([idKH], [tenKH], [SDT], [CMND], [gioiTinh], [trangThai]) VALUES (15, N'Lê Minh', N'123            ', N'121312         ', 1, 0)
INSERT [dbo].[khachHang] ([idKH], [tenKH], [SDT], [CMND], [gioiTinh], [trangThai]) VALUES (16, N'Lê Minh', N'0915994123     ', N'092200789123   ', 1, 1)
INSERT [dbo].[khachHang] ([idKH], [tenKH], [SDT], [CMND], [gioiTinh], [trangThai]) VALUES (17, N'Hoài Lâm', N'0915789321     ', N'092211116400   ', 1, 1)
INSERT [dbo].[khachHang] ([idKH], [tenKH], [SDT], [CMND], [gioiTinh], [trangThai]) VALUES (18, N'Min', N'0913022123     ', N'092200001210   ', 2, 1)
INSERT [dbo].[khachHang] ([idKH], [tenKH], [SDT], [CMND], [gioiTinh], [trangThai]) VALUES (19, N'Loan My', N'0915444222     ', N'091122006400   ', 2, 1)
INSERT [dbo].[khachHang] ([idKH], [tenKH], [SDT], [CMND], [gioiTinh], [trangThai]) VALUES (20, N'Son Tùng MTP', N'0913022010     ', N'082208880600   ', 1, 1)
INSERT [dbo].[khachHang] ([idKH], [tenKH], [SDT], [CMND], [gioiTinh], [trangThai]) VALUES (21, N'Hoàng Anh', N'0789123741     ', N'092201110666   ', 1, 1)
INSERT [dbo].[khachHang] ([idKH], [tenKH], [SDT], [CMND], [gioiTinh], [trangThai]) VALUES (22, N'Hoàng Anh', N'0789123741     ', N'092201110666   ', 1, 0)
INSERT [dbo].[khachHang] ([idKH], [tenKH], [SDT], [CMND], [gioiTinh], [trangThai]) VALUES (23, N'Minh Tú', N'0912366947     ', N'052201235600   ', 2, 0)
INSERT [dbo].[khachHang] ([idKH], [tenKH], [SDT], [CMND], [gioiTinh], [trangThai]) VALUES (24, N'Hoài Thương', N'0913022909     ', N'078901235678   ', 2, 0)
INSERT [dbo].[khachHang] ([idKH], [tenKH], [SDT], [CMND], [gioiTinh], [trangThai]) VALUES (25, N'Diễm My', N'0789123259     ', N'072201133440   ', 2, 1)
INSERT [dbo].[khachHang] ([idKH], [tenKH], [SDT], [CMND], [gioiTinh], [trangThai]) VALUES (26, N'Trung Chân', N'0912325456     ', N'062211123567   ', 1, 1)
SET IDENTITY_INSERT [dbo].[khachHang] OFF
/****** Object:  Table [dbo].[phongTro]    Script Date: 03/20/2022 21:05:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[phongTro](
	[idPhong] [int] IDENTITY(1,1) NOT NULL,
	[idKH] [int] NULL,
	[thangThue] [int] NOT NULL,
	[giaThue] [float] NOT NULL,
	[trangThai] [int] NOT NULL,
 CONSTRAINT [PK_phongTro] PRIMARY KEY CLUSTERED 
(
	[idPhong] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[phongTro] ON
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (31, 12, 1, 1000000, 1)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (32, 13, 3, 1000000, 1)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (33, 14, 3, 1100000, 1)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (34, 16, 1, 1100000, 1)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (35, 17, 1, 1000000, 1)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (36, 20, 1, 1000000, 1)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (37, 18, 2, 1000000, 1)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (38, 19, 1, 1100000, 0)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (39, 20, 1, 1000000, 1)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (40, 26, 1, 1100000, 1)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (41, 19, 3, 1100000, 1)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (42, NULL, 1, 1, 0)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (43, NULL, 0, 1000000, 2)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (44, NULL, 0, 0, 0)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (45, NULL, 0, 0, 0)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (46, NULL, 0, 0, 0)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (47, NULL, 0, 0, 0)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (48, NULL, 0, 0, 0)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (49, NULL, 0, 0, 0)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (50, NULL, 0, 0, 0)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (51, NULL, 0, 0, 0)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (52, NULL, 0, 0, 2)
INSERT [dbo].[phongTro] ([idPhong], [idKH], [thangThue], [giaThue], [trangThai]) VALUES (53, 25, 1, 1000000, 1)
SET IDENTITY_INSERT [dbo].[phongTro] OFF
/****** Object:  Table [dbo].[thuTien]    Script Date: 03/20/2022 21:05:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[thuTien](
	[idThuTien] [int] IDENTITY(1,1) NOT NULL,
	[idPhong] [int] NOT NULL,
	[tongTien] [float] NOT NULL,
	[soDien] [int] NOT NULL,
	[soNuoc] [int] NOT NULL,
	[trangThai] [int] NOT NULL,
 CONSTRAINT [PK_thuTien] PRIMARY KEY CLUSTERED 
(
	[idThuTien] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[thuTien] ON
INSERT [dbo].[thuTien] ([idThuTien], [idPhong], [tongTien], [soDien], [soNuoc], [trangThai]) VALUES (13, 32, 2024000, 3, 4, 1)
INSERT [dbo].[thuTien] ([idThuTien], [idPhong], [tongTien], [soDien], [soNuoc], [trangThai]) VALUES (15, 31, 19996, 4, 5, 0)
INSERT [dbo].[thuTien] ([idThuTien], [idPhong], [tongTien], [soDien], [soNuoc], [trangThai]) VALUES (17, 33, 1125000, 5, 5, 1)
INSERT [dbo].[thuTien] ([idThuTien], [idPhong], [tongTien], [soDien], [soNuoc], [trangThai]) VALUES (18, 32, 0, 1, 1, 0)
INSERT [dbo].[thuTien] ([idThuTien], [idPhong], [tongTien], [soDien], [soNuoc], [trangThai]) VALUES (19, 41, 1120000, 5, 5, 1)
SET IDENTITY_INSERT [dbo].[thuTien] OFF
/****** Object:  Table [dbo].[dichVu]    Script Date: 03/20/2022 21:05:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[dichVu](
	[idDV] [int] IDENTITY(1,1) NOT NULL,
	[idThuTien] [int] NOT NULL,
	[tenDV] [nvarchar](50) NOT NULL,
	[giaDV] [float] NOT NULL,
	[trangThai] [int] NOT NULL,
 CONSTRAINT [PK_dichVu] PRIMARY KEY CLUSTERED 
(
	[idDV] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[dichVu] ON
INSERT [dbo].[dichVu] ([idDV], [idThuTien], [tenDV], [giaDV], [trangThai]) VALUES (18, 13, N'Nước', 3000, 1)
INSERT [dbo].[dichVu] ([idDV], [idThuTien], [tenDV], [giaDV], [trangThai]) VALUES (19, 13, N'Nước', 3000, 0)
INSERT [dbo].[dichVu] ([idDV], [idThuTien], [tenDV], [giaDV], [trangThai]) VALUES (20, 13, N'Điện', 4000, 1)
INSERT [dbo].[dichVu] ([idDV], [idThuTien], [tenDV], [giaDV], [trangThai]) VALUES (21, 15, N'Nước', 3000, 0)
INSERT [dbo].[dichVu] ([idDV], [idThuTien], [tenDV], [giaDV], [trangThai]) VALUES (22, 15, N'Nước', 4000, 1)
INSERT [dbo].[dichVu] ([idDV], [idThuTien], [tenDV], [giaDV], [trangThai]) VALUES (23, 17, N'Nước', 3000, 1)
INSERT [dbo].[dichVu] ([idDV], [idThuTien], [tenDV], [giaDV], [trangThai]) VALUES (24, 17, N'Ði?n', 5000, 1)
INSERT [dbo].[dichVu] ([idDV], [idThuTien], [tenDV], [giaDV], [trangThai]) VALUES (25, 19, N'Điện', 4000, 1)
INSERT [dbo].[dichVu] ([idDV], [idThuTien], [tenDV], [giaDV], [trangThai]) VALUES (26, 13, N'Nước', 3000, 1)
SET IDENTITY_INSERT [dbo].[dichVu] OFF
/****** Object:  ForeignKey [FK_dichVu_thuTien]    Script Date: 03/20/2022 21:05:30 ******/
ALTER TABLE [dbo].[dichVu]  WITH CHECK ADD  CONSTRAINT [FK_dichVu_thuTien] FOREIGN KEY([idThuTien])
REFERENCES [dbo].[thuTien] ([idThuTien])
GO
ALTER TABLE [dbo].[dichVu] CHECK CONSTRAINT [FK_dichVu_thuTien]
GO
/****** Object:  ForeignKey [FK_phongTro_khachHang]    Script Date: 03/20/2022 21:05:30 ******/
ALTER TABLE [dbo].[phongTro]  WITH CHECK ADD  CONSTRAINT [FK_phongTro_khachHang] FOREIGN KEY([idKH])
REFERENCES [dbo].[khachHang] ([idKH])
GO
ALTER TABLE [dbo].[phongTro] CHECK CONSTRAINT [FK_phongTro_khachHang]
GO
/****** Object:  ForeignKey [FK_thuTien_phongTro]    Script Date: 03/20/2022 21:05:30 ******/
ALTER TABLE [dbo].[thuTien]  WITH CHECK ADD  CONSTRAINT [FK_thuTien_phongTro] FOREIGN KEY([idPhong])
REFERENCES [dbo].[phongTro] ([idPhong])
GO
ALTER TABLE [dbo].[thuTien] CHECK CONSTRAINT [FK_thuTien_phongTro]
GO
