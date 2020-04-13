use Investment;
go

INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (1 ,96);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (2 ,93);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (3 ,90);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (4 ,86);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (5 ,83);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (6 ,80);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (7 ,76);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (8 ,73);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (9 ,70);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (10 ,66);
									 
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (11 ,63);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (12 ,60);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (13 ,56);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (14 ,53);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (15 ,50);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (16 ,46);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (17 ,43);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (18 ,40);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (19 ,36);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (20 ,33);
									 
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (21 ,30);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (22 ,26);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (23 ,23);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (24 ,20);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (25 ,16);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (26 ,13);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (27 ,10);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (28 ,6);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (29 ,3);
INSERT INTO DBO.IofRference (NrDay, PercentFee) VALUES (30 ,0);



INSERT INTO DBO.IRReference(StartDay, FinishDay, PercentFee) VALUES (0,180,22.5);
INSERT INTO DBO.IRReference(StartDay, FinishDay, PercentFee) VALUES (181,360,20);
INSERT INTO DBO.IRReference(StartDay, FinishDay, PercentFee) VALUES (361,720,17.5);
INSERT INTO DBO.IRReference(StartDay, FinishDay, PercentFee) VALUES (721,999999,15);

INSERT INTO DBO.RiskLevel(Id,Description) values (1,'Baixo');
INSERT INTO DBO.RiskLevel(Id,Description) values (2,'Médio');
INSERT INTO DBO.RiskLevel(Id,Description) values (3,'Alto');

INSERT INTO [dbo].[Customer]([Document],[Name],[Phone]) VALUES ('222.601.548-59' ,'Helton Hideharu Higute' ,'+1647562-3047');
INSERT INTO [dbo].[Customer]([Document],[Name],[Phone]) VALUES ('222.283.568-24' ,'Humberto Hiroyuki Higute' ,'+551198195-0893');

INSERT INTO [DBO].[BANK]([CODE],[NAME],[CONTACTNAME],[CONTACTPHONE])VALUES('341','Itau','Contact Name','+551150111012');
INSERT INTO [DBO].[BANK]([CODE],[NAME],[CONTACTNAME],[CONTACTPHONE])VALUES('237','Bradesco','Contact Name','+551150111012');


INSERT INTO [dbo].[CustomerBank]([CustomerDoc],[CodeBank],[BranchCode],[AccountNumber]) VALUES ('222.601.548-59','341','9644','75929-3')
INSERT INTO [dbo].[CustomerBank]([CustomerDoc],[CodeBank],[BranchCode],[AccountNumber]) VALUES ('222.601.548-59','237','0644','05929-3')
INSERT INTO [dbo].[CustomerBank]([CustomerDoc],[CodeBank],[BranchCode],[AccountNumber]) VALUES ('222.283.568-24','237','0644','05929-3')



