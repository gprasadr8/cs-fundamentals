

1. **who** or **w** will display all logged in users with username,  terminal type(tty),  time and ip address of the client.
   
   **Example:** 
   
				USER     TTY      FROM             LOGIN@   IDLE   JCPU   PCPU WHAT
	
				user1    pts/0    10.000.000.002   07:33    0.00s  0.03s  0.01s w
				
				user2	 pts/1    10.000.000.004   07:44    6:12   0.02s  0.02s -bash


2. **logout** or **Ctrl+D** or **exit** to logout from the terminal

3. If we are connecting to remote server by usng **SSH** then connecting **port: 22** and for **Telnet prot: 23**

4. **clear** or **Ctrl+L** to clear the bash screen

5.  To get SSH connection details use **echo $SSH_**  prefix avaialble options are $SSH_CLIENT, $SSH_CONNECTION and $SSH_TTY 

6. **echo $SSH_CONNECTION** you can see the client IP address,port and Server IP,port


7. **BASH** is not the only shell avaialble. To list avaialble use **chsh -l** or **cat /etc/shells**

8. **pwd** to print present working directory

9. **cat filename** to display the content of the file 

9. **ls** to list files and dirs. to display hidden files use **ls -a** command


### Bash History Commands

- bash history will be maintained under **~/.bash_history** file for each user. it will be retained even after reboot

- **history** will display the previously executed commands

- **!c** will run last command starting with **c**
	
	**Example:**
	
				cat /etc/shells
			  
			  **!c** and enter then  **cat /etc/shells**  cmd will be executed
			  
			  or 
			  
			  **!cat** and Enter then also **cat /etc/shells** cmd will be executed
			  
			  after ! char it will be considered as prefix
			  
- **!$** represents the last argument of the previous command
	
	**Example:**
	
				**mkdir cmd_practies**
	
				**cd !$** and Enter it will change the directory to cmd_practies
				
- **!?etc** executes the last command that contains etc anywhere in the command

	**Example:**
		
			cat /etc/shells
			
			!?etc and Enter it will executes cat /etc/shells command
			
			
- **Ctrl+r** reverse searches for history commands, click **Esc to edit or click on Enter to execute** the command


- history -a append the history, history -c to clear, history -w to write

- **HISTCONTROL = erasedups**  it removes the duplicate commands from history.

### Text file Analysis

1. **cat** to display the content of the file. the word cat came from concatenate. To display hidden chars use **-vet** option 

	**Example:**
	
			cat file1.txt
			
			cat file1.txt file2.txt
			
			cat -vet file3.txt
			
2. **tac** will display the content from bottom of the file

	**Example:**	
				
			tac file1.txt
			
			
3. 
