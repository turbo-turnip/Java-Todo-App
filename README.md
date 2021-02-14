# Java-Todo-App
This is a sm0l todo app in java
To see the results of this program, you have to compile it.
To compile it, open command prompt for windows, or terminal for macOS & linux.
Go into the directory where the code is stored and enter these commands:
```
javac Main.java
java Main
```
That will compile the program.
To make this work, you have to hit enter, and then you can run commands to dynamically remove, create, and complete todos.
To create a todo, enter this command: ```add [your todo]``` This will add the text after 'add' as a todo. 
If you want to remove a todo, then you can run this command: ```remove [index of your todo]``` This will remove the todo that you specified of the index. 
For example: if you ran these commands:
```
add Take out the trash
remove 1
``` 
then that would create a todo which is "Take out the trash". Since you declared remove 1, then it will remove the first todo which is "Take out the trash".
If you have completed a todo, then you can enter the following command: ```complete [index of your todo]``` This will complete the todo that you specified of the index.
For example: if you ran these commands:
```
add Take out the trash
complete 1
``` 
then that would create a todo which is "Take out the trash". Since you declared the complete command, then it will set the status of the first todo as complete and move it to the completed ArrayList.
