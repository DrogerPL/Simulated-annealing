# Simulated-annealing
Problem Definition

The Traveling Salesman Problem (TSP) can be defined as a problem in which, starting from one vertex, one must visit every other vertex exactly once in such a way that the total distance traveled is minimized. In other words, the goal is to find the shortest route that connects all vertices of the graph, returning to the starting point at the end.

Algorithm Description

Simulated Annealing (SA) algorithm is a heuristic optimization method inspired by the physical process of annealing metals. It begins by selecting an initial solution and setting an initial temperature, which gradually decreases over time. In each iteration, the algorithm generates a neighbor of the current solution, accepting it with a probability dependent on the difference in the objective function value and the temperature. SA allows avoiding local minima traps while still exploring the solution space. As the temperature decreases, the algorithm focuses more on intensive exploitation, leading to the improvement of solution quality. The final solution obtained by SA represents an approximate global optimum of the objective function.

Computational Experiment

Test Data

    a280.tsp
    bier127.tsp
    eil51.tsp
    fl417.tsp
    kroB100.tsp

Results Obtained (including average relative error compared to the optimal or best-known solution)

Version 1:

Test Data:
![obraz](https://github.com/DrogerPL/Simulated-annealing/assets/117290041/577e5d87-90be-4931-b805-6a8d17f2b372)

Version 2:

Test Data:

![obraz](https://github.com/DrogerPL/Simulated-annealing/assets/117290041/e92fe97e-a7d9-4a69-af11-a3e8e58a3946)


Conclusions and Additional Remarks

In the first version of the algorithm, the neighborhood operates by swapping two randomly selected elements, excluding the end cities (first and last). In the second version, to improve the quality of solutions, we changed the neighborhood operation to randomly swap two selected elements including the end ones, i.e., all of them.

For data containing a large number of cities, the relative error is significantly higher.
