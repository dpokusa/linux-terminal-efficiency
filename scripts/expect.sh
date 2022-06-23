#!/usr/bin/expect

set timeout -1
spawn ./reverse-numbers.sh
expect "Enter the number to reverse:"
send -- "314159265359\r"
expect eof
