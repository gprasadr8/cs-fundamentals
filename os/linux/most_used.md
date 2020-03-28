`systemctl list-unit-files | grep enabled`  will list all enabled ones.<br>
or <br>
`systemctl list-unit-files --state=enabled`<br>


`systemctl | grep running` If you want which ones are currently running

`systemctl stop [servicename]` stops the service
`systemctl disable [servicename]` disables it.

