Series
=======

### Problem
We use the integers _a_, _b_, and _n_ to create the following series:

		(a + 2^0 * b), (a + 2^0 * b + 2^1 * b), (a + 2^0 * b + 2^1 * b + ... + 2^(n-1) * b)

You are given q queries in the form of _a_, _b_, and _n_. For each query, print the series corresponding to the given _a_, _b_ and _n_ values as a single line of _n_ space-separated integers.

### Input Format

The first line contains an integer, _q_, denoting the number of queries. 
Each line _i_ of the _q_ subsequent lines contains three space-separated integers describing the respective _ai_, _bi_, and _ni_ values for that query.

### Constraints

0 <= q <= 500
0 <= a,b <= 50
1 <= n <= 15

### Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of _n_ space-separated integers.

### Sample Input

		2
		0 2 10
		5 3 5

### Sample Output

		2 6 14 30 62 126 254 510 1022 2046
		8 14 26 50 98
