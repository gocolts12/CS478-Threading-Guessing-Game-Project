# 478Proj4

This is an app that contains a "game" using multi-threading. The first to guess the position of the gopher hiding
in the grid wins. There are 2 modes: 

1. Random-guessing thread vs sequential guessing thread: This mode doesn't work exactly correctly. 
   The threads are meant to post job a job to the other thread after executing, but due to time constraints, I wasn't able 
   to get that functionalty working. 

2. Player vs Player: The project spec ordered this to function exactly the same as mode 1, but instead using 
   a button for the players to execute the threads' actions. 

Notes/Specs:
1. Both modes use HandlerThreads rather than asyncTasks because of the nature of the project requirements. 
2. Another requirement was that if a thread guesses within 1 cell away from the gopher, a specific message is displayed. 
   If a guess is within 2 cells away, a different message is displayed. Lastly, if you don't get within 2 cells, a miss
   message is displayed. 
3. Because of time constraints, I had to prioritize basic functionality over elegance, and therefore had to hard-code the 
   game board. Also because I just love to see the world burn.  
   
