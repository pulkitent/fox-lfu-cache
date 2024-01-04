### Problem statement

Design and implement a data structure for a Least Frequently Used (LFU) cache.

1. Implement the LFUCache class:

2. LFUCache(int capacity) Initializes the object with the capacity of the data structure.

3. int get(int key) Gets the value of the key if the key exists in the cache. Otherwise, returns -1.

4. void put(int key, int value) Update the value of the key if present, or inserts the key if not already present. 
When the cache reaches its capacity, it should invalidate and remove the y used key before inserting a new item. 
For this problem, when there is a tie (i.e., two or more keys with the same frequency), the least recently used key would be invalidated.


Input: 

["LFUCache", "put", "put", "get", "put", "get", "get", "put", "get", "get", "get"]

[[2], [1, 1], [2, 2], [1], [3, 3], [2], [3], [4, 4], [1], [3], [4]]

Output: 

[null, null, null, 1, null, -1, 3, null, -1, 3, 4]
