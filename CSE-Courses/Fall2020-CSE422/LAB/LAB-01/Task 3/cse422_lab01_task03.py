file = open('input_Task3.txt','r')
lines = file.readlines() # Read Lines
num_of_nodes = int(lines.pop(0)) # Number of Nodes

import numpy as np
am = np.zeros((num_of_nodes, num_of_nodes), dtype=int)

num_of_edge = int(lines.pop(0)) # Number of edge
xp = int(lines.pop(num_of_edge)) # Lina's Position (Goal Node)
kp = int(lines.pop(num_of_edge)) # Number of participant

#Participant Array
P = []
for i in range(0,kp):
  P.append(int(lines.pop(num_of_edge)))

for line in lines:
  line = line.strip()
  node = line.split(' ') # Split all node
  am[int(node[1]),int(node[0])] = 1

# Adjacency (Matrix to List) conversion
from collections import defaultdict 

def convert(am): 
    al = defaultdict(list) 
    for i in range(len(am)): 
        for j in range(len(am[i])): 
                       if am[i][j]== 1: 
                           al[i].append(j) 
    return al

al = convert(am) #method call

# BFS method
from queue import Queue
def bfs(al, position): 
  visited = {} # visited
  lvl = {} # level
  prnt = {} # parent
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
  return (lvl)
a = bfs(al, 0)

b = bfs(al, xp)
md = []
for i in range(0, kp):
  md.append(b[P[i]])
print("Minimum number of moves the winner:", min(md))