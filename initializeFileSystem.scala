spark.conf.set("fs.azure.createRemoteFileSystemDuringInitialization", "true")
dbutils.fs.ls("abfss://<file-system-name>@<storage-account-name>.dfs.core.windows.net/")
spark.conf.set("fs.azure.createRemoteFileSystemDuringInitialization", "false")

# with ADB runtime version 5.1 or above you can also use OAuth 2 to authenticate the filesystem to initialize

spark.conf.set(
  "fs.azure.account.key.<storage-account-name>.dfs.core.windows.net",
  dbutils.secrets.get(scope = "<scope-name>", key = "<key-name-for-service-credential>"))
