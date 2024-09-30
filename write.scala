// Write the DataFrame to a Hive table
telecomDF.write
    .mode("overwrite")
    .saveAsTable("telecom_data_table")

// Confirm the data has been saved
spark.sql("SELECT * FROM telecom_data_table").show()

// spark.sql("SELECT current_database()").show()
// spark.sql("SHOW TABLES IN default").show()


