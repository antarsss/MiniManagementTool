create database qlLV
use qlLV

create table SINHVIEN(
	maSV varchar(10) primary key,
	tenSV nvarchar(50) not null,
	mail varchar(50),
	soDT varchar(15),
)

create table DETAI(
	maDT numeric(5) primary key,
	linkBC varchar(200),
	tenDT nvarchar(200) not null,
	loaiDT nvarchar(20),
	ngayBD varchar(15),
	ngayKT varchar(15),
	tinhTrang nvarchar(20),
	diemTong varchar(5),
)

create table NHOM(
	maNhom numeric(5),
	maSV varchar(10),
	maDT numeric(5),
	truongNhom bit not null,
	PRIMARY KEY (maDT, maSV),
	CONSTRAINT fk_maSV FOREIGN KEY (maSV) references SINHVIEN(maSV),
	CONSTRAINT fk_maDT FOREIGN KEY (maDT) references DETAI(maDT),
)

create table CANBO(
	maCB varchar(10) primary key,
	tenCB nvarchar(50) not null,
	mail varchar(50),
	soDT varchar(15),
)


create table DIEM(
	maDT numeric(5),
	maCB varchar(10),
	chucVu nvarchar(20), 
	diem float,
	hocKi varchar(3),
	namHoc varchar(9),
	primary key (maDT, maCB),
	CONSTRAINT fk_maDeTai FOREIGN KEY(maDT) references DETAI(maDT), 
	CONSTRAINT fk_maCB FOREIGN KEY(maCB) references CANBO(maCB), 	
)

create table DANGNHAP(
	id varchar(20) primary key,
	pw varchar(max),	
)


