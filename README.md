# TeamF222.3New
**release 0.3** 
Dungeons and Dragons Character Creator
created by Aron Patterson, Christo Staszewski, and Chris Kellum
## Updates for release 0.3
+ PDF creation
+ UI filling in all feilds
+ takes user enterd Stats
+ takes entered spells
+ some refactoring to the Code
### Bug fixes from 0.2
+ no longer NullPointer Errors
+ no longer dead end Buttons
+ no longer stat population errors
#### Bugs in 0.3
+ the array population only will populate stats if you switch from the Character Sheet to the spell sheet and back to the Character Sheet
## Build Instructions
Pull this project into intellij and assign sdk 10.0.2 to the project.
Next a popup should show in the bottom right corner asking you to import maven dependencies, do so.
Next build and run the program (if you have issues continue reading)

If you have issues, the first step in troubleshooting should be to delete the .idea folder that you pulled, and restart intellij. This will allow Intellij to recreate consistent xml files and will automatically find what libraries you need to run the program.
Next, reset the sdk.
Finally attempt to build and run the program again.
If you have more problems look below.

Next try to run our automated tests. You should be able to right click the tests directory in src, mark the directory as a test directory.
Then you right click again and hit "Run All Tests."
If any tests fail, please let us know. All release versions should have working tests
