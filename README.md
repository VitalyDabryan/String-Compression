# String-Compression
        Run-length encoding is a string compression method that works by replacing consecutive
        identical characters (repeated 2 or more times) with the concatenation of the character
        and the number marking the count of the characters (length of the run).
        For example, to compress the string "aabccc" we replace "aa" by "a2" and replace "ccc" by "c3".
        This the compressed string becomes "a2bc3".

        Notice that in this problem, we are not adding '1' after single characters.

        Find the minimum length of the run-length encoded version of s.
