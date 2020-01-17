

## ADLSGen2-Databricks-Connectivity

This repo will address how to use Azure Data Lake Store (ADLS) Gen2 as external storage with Azure Databricks and contains automation scripts. 

There are currently four options for connecting from Databricks to ADLS Gen2:

1. Using the ADLS Gen2 storage account access key directly
2. Using a service principal directly (OAuth 2.0)
3. Mounting an ADLS Gen2 filesystem to DBFS using a service principal (OAuth 2.0)
4. Azure Active Directory (AAD) credential passthrough


We will focus on authenticating to ADLS Gen 2 storage from Azure databricks clusters

## Requirements

[Create and initialize ADLS gen 2 file system, enabling the hierarchical namespaces. ](https://docs.microsoft.com/en-us/azure/databricks/data/data-sources/azure/azure-datalake-gen2#create-adls-account)
> Important

> 1. When the hierarchical namespace is enabled for an Azure Data Lake Storage Gen2 account, you do not need to create any Blob containers through the Azure portal.
> 2. When the hierarchical namespace is enabled, Azure Blob storage APIs are not available. See this Known issue description. For example, you cannot use the wasb or wasbs scheme to access the blob.core.windows.net endpoint.
> 3. If you enable the hierarchical namespace there is no interoperability of data or operations between Azure Blob storage and Azure Data Lake Storage Gen2 REST APIs.
> 

[Security Requirements](https://docs.microsoft.com/en-us/azure/databricks/data/data-sources/azure/adls-passthrough#security-requirements)

[Cluster requirements](https://docs.microsoft.com/en-us/azure/databricks/data/data-sources/azure/adls-passthrough#cluster-requirements)

![](https://github.com/madhavi-mal/ADLSGen2-Databricks-Connectivity/blob/master/adls-credential-passthrough.png)

[Enable Azure Data Lake Storage credential passthrough for a high-concurrency cluster](https://docs.microsoft.com/en-us/azure/databricks/data/data-sources/azure/adls-passthrough#enable-azure-data-lake-storage-credential-passthrough-for-a-high-concurrency-cluster)

spark.read.csv("abfss://<my-file-system-name>@<my-storage-account-name>.dfs.core.windows.net/MyData.csv").collect()

Enable Azure Data Lake Storage credential passthrough for a standard cluster

![](https://github.com/madhavi-mal/ADLSGen2-Databricks-Connectivity/blob/master/credential-passthrough-single.png)






