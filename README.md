LevenshteinDistance
===================

Calculates the Levenshtein distance between two strings

What is Levenshtein Distance?
In information theory and computer science, the Levenshtein distance is a string metric for 
measuring the difference between two sequences. Informally, the Levenshtein distance between 
two words is the minimum number of single-character edits (i.e. insertions, deletions or substitutions) 
required to change one word into the other. It is named after Vladimir Levenshtein, who considered this 
distance in 1965. 

Source:http://en.wikipedia.org/wiki/Levenshtein_distance

Points to note:

1. It is always at least the difference of the sizes of the two strings.
2. It is at most the length of the longer string.
3. It is zero if and only if the strings are equal.
4. If the strings are the same size, the Hamming distance is an upper bound on the Levenshtein distance.
5. The Levenshtein distance between two strings is no greater than the sum of their Levenshtein distances from a third string (triangle inequality).
