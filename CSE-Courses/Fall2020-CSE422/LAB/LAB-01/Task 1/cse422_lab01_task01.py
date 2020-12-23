file = open('input_Task1.txt', 'r')
lines = file.readlines()  # Read lines
num_of_nodes = int(lines.pop(0))  # Number of Nodes

import numpy as np

am = np.zeros((num_of_nodes, num_of_nodes), dtype=int)
# Adjacency Matrix

num_of_edge = int(lines.pop(0))  # Number of edge
goal_node = int(lines.pop(num_of_edge))

for line in lines:
    line = line.strip()
    node = line.split(' ')  # split all node
    am[int(node[0]), int(node[1])] = 1
    am[int(node[1]), int(node[0])] = 1
# Adjacency Matrix

# Adjacency (Matrix to List) conversion
from collections import defaultdict


def convert(a_m):
    adjList = defaultdict(list)
    for i in range(len(a_m)):
        for j in range(len(a_m[i])):
            if a_m[i][j] == 1:
                adjList[i].append(j)
    return adjList


al = convert(am)  # method call

from queue import Queue

visited = {}  # visited
lvl = {}  # level
prnt = {}  # parent
bfs_out = []  # bfs output
queue = Queue()

for node in al.keys():
    visited[node] = False
    prnt[node] = None
    lvl[node] = -1

s = 0
visited[s] = True
lvl[s] = 0
queue.put(s)

while not queue.empty():
    u = queue.get()
    bfs_out.append(u)

    for v in al[u]:
        if not visited[v]:
            visited[v] = True
            prnt[v] = u
            lvl[v] = lvl[u] + 1
            queue.put(v)

print("Minimum number of moves Nora needs:", lvl[goal_node])
