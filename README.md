# The facility location problem with maximum distance constraint - FLP_MD 

In the FLP-MD, we are given a set of facilities F and a set of customers D.
The distance between facility i and customer j is dij, for any i ∈ F , j ∈ D.

In other words, the distances between facilities and customers are nonnegative, symmetric, and satisfy the triangle inequality.

Distance from each customer to the open facilities must not exceed a certain value, 
a positive integer L is given as the threshold value. 
We must select some facilities to be open such that the distance between customers and the open facilities is no more than L while minimising
the sum of the facility opening costs.
