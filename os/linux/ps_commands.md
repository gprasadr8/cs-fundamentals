
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
			
			
### PS commands:

- ps to display processes 

- kill to send signals

- pgrep, pkill and killall are shortcuts for ps commands

- the default kill signal is -15 which is also written as -term or sigterm. It will send the signal to process to terminate the process, if process is not responding then it won't kill the process

- To forcefully kill it is -9, -kill or sigkill




 
 