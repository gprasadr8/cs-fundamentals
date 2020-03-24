
how to redirect an output of one command into a file or input for another command?

Redirection:

action 				symbol													Description

write to a file          >									overwrites command output to a file. if file doesn't exists it will create new file

append to a file         >>									appends command output to an existing file. if file doesn't exists it will create new file

Noclobber 				set -o noclobber 					set bash to not allow files to overwrites file content.

Ignore noclobber		>|									it ignores the noclobber setting

read from file			<									to get the file content as an input to the command


Redirecting Standard Ouput:

Standard output value is 1, By default it writes the standard output to the file so mentioning 1 is optional.

		**Example:**
					ls /etc > file1.txt
					
					ls /etc 1> file1.txt
					
					ls /etc 1>> file1.txt
					
					
Redirecting to Standard Error:

To write Standard Error into a file use value 2

		**Example:**
		
					ls /etc 2> file1.txt
					
					ls /etc 2>>  file1.txt
					

### Shell Options:

To list all the shell options use **set -o** command

To set no clobber use **set -o noclobber** . It won't allow user to overwrite any existing file

To ignore noclobber options you can use **>|**.

**Example:**

		ls /app >file1.txt  if file1 already exists it throws error: cannot overwrite existing file
		
		ls /app >>file1.txt  you can append to the existing file
		
		ls /app >| file1.txt  it ignores the noclobber option and overwrites to the file
		
		




Standard Ouput and Error to the same file:  ls /etc > file1.txt >2&1 (the value 2 says we are redirecting the errors and &1 says same place as 1)


Pipe lines: Send the Ouput of one command to Input of another command, pipe lines joins command


### 1. unnamed pipes(|): 

The vertical bar is the PIPE character for unnamed pipes. The scope of this pipes are current command execution time.

Example:

		ls /etc | less   the output of ls command is sent to less command
		
		ls /etc | wc -l  the output of ls command is sent to word count -lines 
		
#### tee command:

To write standard output to a file as well to display output in the console.

Example:  ls /etc | tee file1.txt   it will same ls command output to file1 as well as  displays on console
		


### 2. named pipes(mkfifo): 

Named pipes are files we create the named pipes by using **mkfifo**

Example:

		mkfifo mypipe
		
		ls /etc > mypipe
		

		
		
		

	
