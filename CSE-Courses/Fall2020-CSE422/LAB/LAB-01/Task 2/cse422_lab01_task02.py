file = open('input_Task2.txt', 'r')
lines = file.readlines() # Read Lines
num_of_nodes = int(lines.pop(0)) # Number of Nodes


import numpy as np
am = np.zeros((num_of_nodes, num_of_nodes), dtype=int)
# Adjacency Matrix

num_of_edge = int(lines.pop(0)) # Number of Edge
xp = int(lines.pop(num_of_edge)) # Lina's Position (Goal Node)
pp = int(lines.pop(num_of_edge)) # Nora's Position
qp = int(lines.pop(num_of_edge)) # Lara's Position

for line in lines:
  line = line.strip()
  node = line.split(' ') # Split all Node
  am[int(node[0]),int(node[1])] = 1
  am[int(node[1]),int(node[0])] = 1
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

al = convert(am) #method call

# BFS Method
from queue import Queue
def bfs(al, position):
  visited = {} # Visited
  lvl = {} # Level
  prnt = {} # Parent
  bfs_out = [] # BFS output
  queue = Queue()

  for node in al.keys():
    visited[node] = False
    prnt[node] = None
    lvl[node] = -1

  s = position
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
        lvl[v] = lvl[u]+1
        queue.put(v)
  return (lvl[xp])

#method call
a = bfs(al, qp)
b = bfs(al, pp)

# Check level
if a<b:
  print ("Lara")
elif b<a:
  print ("Nora")
else:
  print ("Both")