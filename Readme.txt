Tools Installed:

1  Hadoop
 	/opt/hadoop/
 to start hadoop service run below commands:
      cd /opt/hadoop/sbin
         ./start-all.sh

Hadoop jar files path=/opt/hadoop/share/hadoop/hdfs/lib
Hive jar files path=/usr/local/hive/lib

2 spark
    to start spark run below commands:
  cd /opt/spark-3.2.3-bin-hadoop3.2/sbin
   ./start-all.sh

         URL:- http://localhost:8080/

3 Apache Airflow:
     URl : http://localhost:8089/login/
      username : admin
      password : admin

3 intellij
4 sbt 
5 Jupyter Notebook 
   to run jupyter notebook run the below command in the terminal 
     then access the desktop shortcut
   command : jupyter notebook
		Spark kernel is present (spylon-kernel)
6 Foxit Reader
7 Libre office
8 Kafka 
     path of kafka : /opt/kafka_2.12-3.3.1
9 Mysql with Workbench
   command to connect MySql : mysql -u root -p
   	username : root
   	password : Root123$
10 Pycharm community Edition
11 Scala
12 Hive
	/usr/local/hive/
  to access the hive run below command:
      hive

Note : if while starting if you get any hadoop service error or hive starting error please run below command:
          sudo -H -u labuser bash -c '/opt/hadoop/bin/hdfs namenode -format'
       after running above command please stop and start the hadoop services
13 Pig 0.17
14) VScode
15)maven
16)python 
17)Cucumber
18) Mockito
19)TestNG
20)Phantom JS
21) Jenkins :-
           url :- http://localhost:8080/
For jenkins username/password : admin/d4b0ffd117ca4d1c95020116e34f03a7
If facing issue in jenkins switch java to java 11 using the command 
sudo update-alternatives --config java
and select 1  

22)Github Desktop
23)Docker and docker compose
24) Filezilla
25) Hudi path : /opt/hudi





