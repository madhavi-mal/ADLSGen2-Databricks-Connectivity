

# ADLSGen2-Databricks-Connectivity

This repo will address how to use Azure Data Lake Store (ADLS) Gen2 as external storage with Azure Databricks and contains automation scripts. 

There are currently four options for connecting from Databricks to ADLS Gen2:

1. Using the ADLS Gen2 storage account access key directly
2. Using a service principal directly (OAuth 2.0)
3. Mounting an ADLS Gen2 filesystem to DBFS using a service principal (OAuth 2.0)
4. Azure Active Directory (AAD) credential passthrough
