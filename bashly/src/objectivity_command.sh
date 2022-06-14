inspect_args

name=${args[--name]}


if [[ $name ]]; then
	echo "Hello $(blue_bold Objectivity) -- $name"
else 
	echo "Hello $(red_bold Objectivity)"
fi


