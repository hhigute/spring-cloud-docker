#!/bin/bash
database=Investment
wait_time=60s
password=Password@123

# wait for SQL Server to come up
echo importing data will start in $wait_time...
sleep $wait_time
echo importing data...

# run the init script to create the DB and the tables in /table
/opt/mssql-tools/bin/sqlcmd -S 0.0.0.0 -U sa -P $password -i ./init.sql

for ddl_entry in "DDL/*.sql"
do
  echo executing $ddl_entry
  /opt/mssql-tools/bin/sqlcmd -S 0.0.0.0 -U sa -P $password -i $ddl_entry
done

#import the data from the csv files
for dml_entry in "DML/*.sql"
do
  echo executing $dml_entry
  /opt/mssql-tools/bin/sqlcmd -S 0.0.0.0 -U sa -P $password -i $dml_entry  
done