## WSL2 Basics

/mnt/c is the exact same as C:\. It's just the syntax for getting to it from WSL.

WSL has an special type of filesystem named DrvFS that gives you access to the disks used in windows. You can use DrvFS to mount, not only your windows filesystem, but also network disks and other media types.

In WSL, by default, the C: disk in windows is mounted under /mnt/c
If you have another disk, for instance a D: disk in windows, it will be mounted under /mnt/d
The files you can see in /mnt/c are the same you have in C:. If you modify some file, you will get the changes in the windows too.

