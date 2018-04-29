Twin Strings
============

### Problem

Two strings, a and b, are said to be twins only if they can be made equivalent by performing some number of operations on one or both strings. There are two possible operations:

SwapEven: Swap a character at an even-numbered index with a character at another even-numbered index.
SwapOdd: Swap a character at an odd-numbered index with a character at another odd-numbered index.

For example, a = "abcd" and b = "cdab" are twins because we can make them equivalent by performing operations. Alternatively, a = "abcd" and b = "bcda" are not twins (operations do not move characters between odd and even indices), and neither are a = "abc" and b = "ab" (no amount of operations will insert a c into string b).

### Input Format

The first line contains an integer, n, denoting the number of elements in a.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains a string describing _ai_.
The next line contains an integer, n, denoting the number of elements in b.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains a string describing _bi_.

### Output format

For each _ai_ and _bi_ print *Yes* if _ai_ and _bi_ are twins and *No* otherwise.

### Constraints

1 ≤ n ≤ 103
1 ≤ length(ai), length(bi) ≤ 100
_ai_ and _bi_ are not guaranteed to have the same length.
Strings _ai_ and _bi_ contain lowercase letters only (i.e., _a_ through _z_).

### Sample Input

		2
		cdab
		dcba
		2
		abcd
		abcd

### Sample Output

		Yes
		No
