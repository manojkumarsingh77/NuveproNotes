/ Import Spark libraries
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types.{StructType, IntegerType, StringType, DoubleType}
 
// Initialize SparkSession with adjusted config
val spark = SparkSession.builder()
    .appName("HDFS to Spark to Hive")
    .config("spark.network.timeout", "10000000")  // Adjust network timeout
    .config("spark.rpc.message.maxSize", "1024")  // Increase RPC max message size to 1GB
    .config("spark.driver.memory", "4g")  // Increase driver memory if needed
    .enableHiveSupport()  
    .getOrCreate()
 
// Define the schema for your CSV data
val schema = new StructType()
    .add("customer_id", IntegerType, true)
    .add("name", StringType, true)
    .add("plan", StringType, true)
    .add("usage", DoubleType, true)
 
// Read data from HDFS into a Spark DataFrame
val telecomDF = spark.read
    .option("header", "true")
    .schema(schema)
    .csv("hdfs://localhost:8020/user/hive/warehouse/telecom_data/telecom_data.csv")
 
// Show the data
telecomDF.show()
