// Import Spark libraries
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types._

// Initialize SparkSession
val spark = SparkSession.builder()
    .appName("HDFS to Spark to Hive")
    .enableHiveSupport()  // Enables Hive support in Spark
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
    .csv("hdfs://namenode:8020/user/hive/warehouse/telecom_data/telecom_data.csv")

// Show the data
telecomDF.show()
