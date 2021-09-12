from OpenGL.GL import *
import numpy as np

x = np.random.randint(0, 500, 50)
y = np.random.randint(0, 500, 50)

def Task01():
    glPointSize(5)
    glBegin(GL_POINTS)
    for i in range(0, 50):
        glVertex2f(x[i], y[i])
    glEnd()

