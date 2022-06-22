# Effective Terminal

## Introduction

What makes you an expert (Warning! A huge simplification! :)) is a blend of knowledge (which allows you to solve complex problems every day) and skills (that let you perform your tasks efficiently when you already know how to achieve your goal). Basically, knowledge is a key which you operate with your skills. Combined, they make up your expertise in a particular area.

This session will be about skills that improve your efficiency in general. I want to show how you can use the Linux terminal for everyday tasks, what tools are at your disposal, and how to start automating "all the small things" with ease. My main goal is to give you an idea of how these tools can serve you and your needs.

## Basic configuration suggestions

* Use zsh instead of bash. You can also use fish, however fish is not posix compliant, therefore you will not be able to copy&paste all snippets from the internet
* Use oh-my-zsh!
* Consider two-line bash style as this will give you possibility to use first line for any information that you need during work (passive skills) and second line for command executions (active skills)
* Do not install everything that you think will be usefull! Its better to find a few good apps that you will use often, therefore you will be able to have some proficiency level with them
* Start with defaults. Do you really have time to reconfigure everything?

## Great CLI Apps

* https://github.com/toolleeo/cli-apps
* https://github.com/agarrharr/awesome-cli-apps

## My choice of "must have"

* Moving around
    * `z` plugin
    * `tree`
    * if `z` is not enough and you need easy way to access directories that you used during session then turn on autopushd and autopopd
    * consider fzf for fuzzy searches
    * If you need regular file manager consider ranger or any altjrnative
    * for tree view & simple file manager with search consider broot
* Inventory
    * Ctrl+R is your way to search through history of executed commands. Consider increasing number of maximum history size (for example to 10 000)
    * Tail, head, cat are your friends. Additionaly consider using bat
    * You need to know at least one text editor (and one is enought) and have some experience with it. vim or emacs should be your choice
    * Think about "passive" solutions: sdk man for managing java environment, ohmyzsh plugins with support for showing you current java version, docker registry, node version, python etc.
    * Choose other tools wisely. You dont need 100 installed tools that you will barerly use. However if you are need something specific for your current challenge then do not hesistate to check if there is something that do what you need (or part of it)
* Fight your own battles
    * Remember about unix philosophy - https://en.wikipedia.org/wiki/Unix_philosophy
    * Ctrl+x,e is a way to create more complex commands directly in terminal.
    * Ctrl+z gives you possibility to move current app into background, then consider mapping ctrl+z to get back previous appliction
    * Learn at least a little bit about linux pipes
    * In case of creating complicated pipes consider Ultimate plumber
    * Consider learing some basic comands that helps with "piping"- uniq, column, sort, wc, watch
    * Consider learning some text-processing tools: awk, sed
    * If you need to work with particular text-file format find tool for that. Examples jq (JSON), yq (YAML).
    * In case you need to create a lot of http request consider using httpie instead of curl or wget
* Crafting
    * Remember that you can use different environment for different scripts
    * You can run your shell script directly in vim if you are using it. Just remember this command: `:w ! sh`
    * If you need to create something more complicated consider some CLI framework like picocli (Java), Click (Python) or bashly (Bash :))
    * Remember that anything that you were able to execute using your terminal emulator- you can put into script
    * If you want to learn bash- use shellcheck!




