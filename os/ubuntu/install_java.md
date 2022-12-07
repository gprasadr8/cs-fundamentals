
## How to install Java on Ubuntu?
Reference: https://phoenixnap.com/kb/how-to-install-java-ubuntu

### Commands used for Java isntallation:
```
sudo apt update
sudo apt install default-jdk // to install os default jdk
sudo apt install default-jre 
sudo apt install openjdk-8-jdk //To install specific version 

```

### How to set Default Java Version?
```shell
sudo update-alternatives --config java  //it will display all installed versions
choose right version
```
### How to Set JAVA_HOME Environment Variable

The JAVA_HOME environment variable determines the location of your Java installation. The variable helps other applications access Java’s installation path easily.

1. To set up the JAVA_HOME variable, you first need to find where Java is installed. Use the following command to locate it:
```
sudo update-alternatives --config java
```

The Path section shows the locations, for example:

/usr/lib/jvm/java-11-openjdk-amd64/bin/java (where OpenJDK 11 is located)
/usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java (where OpenJDK 8 is located)
2. Once you see all the paths, copy one of your preferred Java version.

3. Then, open the file /etc/environment with any text editor. In this example, we use Nano:
```
nano /etc/environment
```


4. At the end of the file, add a line which specifies the location of JAVA_HOME in the following manner:
```
JAVA_HOME="/your/installation/path/"
```
5. Now reload this file to apply the changes to your current session:
```
source /etc/environment
```

Verify that the environment variable is set:
```
echo $JAVA_HOME
```


### How to Uninstall Java on Ubuntu
In case you need to remove any of the Java packages installed, use the apt remove command.

```
sudo apt remove default-jdk //to remove default jdk
sudo apt remove openjdk-8-jdk // to remove specific version
```

Once you run the command, confirm the continuation of the process by pressing y (yes) and the packages will be removed.