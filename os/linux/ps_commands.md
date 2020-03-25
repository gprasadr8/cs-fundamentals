
To know where is the ps command file user which command **which ps**

**uptime:**

uptime displays how long system up and how long idle as well as load average for 1min 5mins and 15mins

 09:39:22 up 11 days, 22:58,  2 users,  load average: 0.13, 0.04, 0.05
 
uptime command gets the information from /proc/uptime and /proc/loadavg files


### Managing jobs

- to list all the running jobs use **jobs** command

- to move task to back ground use **Ctrl+z**

- to get job to foreground use **fg** last job comes to foreground and to specify job **fg job_num**

- To directly create a job in background use & at the end

	**Example:**
	
			sleep 180 &
			
			sleep 240 & 
			
			jobs
			
			fg 1
			
			bg
			
			
### ps & kill commands:

- ps to display processes 

- kill to send signals

- pgrep, pkill and killall are shortcuts for ps commands

- the default kill signal is -15 which is also written as -term or sigterm. It will send the signal to process to terminate the process, if process is not responding then it won't kill the process

- To forcefully kill it is -9, -kill or sigkill

### ps:

Linux provides us a utility called ps for viewing information related with the processes on a system which stands as abbreviation for “Process Status”.
ps command is used to list the currently running processes and their PIDs along with some other information depends on different options. It reads the process information from the virtual files in /proc file-system. /proc contains virtual files, this is the reason it’s referred as a virtual file system.



- The ps command without arguments lists the running processes in the current shell <br>

The output consists of four columns<br>
PID – This is the unique process ID<br>
TTY – This is the typeof terminal that the user is logged in to<br>
TIME – This is the time in minutes and seconds that the process has been running<br>
CMD – The command that launched the process<br>

- print all processes in different format **ps -e** or **ps -A** <br>
- To perform a full-format listing, add the -f or -F flag, **ps -ef** <br>

- Display all processes in BSD format. **ps au ** or **ps aux** <br>
- the ps command can be used with grep command to search for a particular process **ps -ef | grep java**

#### Display user running processes:

- You can select all processes owned by you (runner of the ps command), type: **ps -x** <br>
- To display a user’s processes by real user ID (RUID) or name, use the -U flag. **ps -Uf {userid}**
**Example:** <br>  ps -Uf app <br> ps -Uf prasadg <br>
- To select a user’s processes by effective user ID (EUID) or name, use the -u option.
**Example:** <br>  ps -fu app <br> ps -fu prasadg <br>

#### need to check real user vs effective user?
???

#### Display group processes

- If you want to list all processes owned by a certain group (real group ID (RGID) or name), type. **ps -fG apache** OR  **ps -fG realgid** <br>
- To list all processes owned by effective group name (or session), type. **ps -fg apache** <br>

#### Display Processes by PID

- You can list processes by PID as follows. **ps -fp 1178** <br>
- Make selection using PID list. ps -fp 2226,1154,1146 <br>

- Find top running processes by highest memory and CPU usage in Linux. 
**ps -eo pid,ppid,cmd,%mem,%cpu --sort=-%mem | head** <br>
		OR<br>
**ps -eo pid,ppid,cmd,%mem,%cpu --sort=-%cpu | head**
























 
 