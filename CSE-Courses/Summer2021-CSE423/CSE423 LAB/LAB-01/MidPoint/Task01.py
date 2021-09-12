from OpenGL.GL import *
from OpenGL.GLUT import *

def midpoint(sx, sy, ex, ey):
    glBegin(GL_POINTS)
    dy = ey-sy
    dx = ex-sx

    d_init = (2 * dy) - dx
    d = d_init

    if sx == ex:
        while sy != ey:
            glVertex2f(sx, sy)
            sy += 1
        glVertex2f(sx, sy)
    elif sy == ey:
        while sx != ex:
            glVertex2f(sx, sy)
            sx += 1
        glVertex2f(sx, sy)
    else:
        while sx != ex and sy != ey:
            glVertex2f(sx, sy)
            if d > 0:
                sx += 1
                sy += 1
                d += 2 * (dy - dx)
            else:
                sx += 1
                d += 2*dy
        glVertex2f(sx, sy)
    glEnd()

def Logic4():
    # 4 Line 01 (Long line)
    midpoint(300, 100, 300, 300)
    # 4 Line 02
    midpoint(200, 200, 300, 200)
    # 4 Line 03
    midpoint(200, 200, 300, 300)

def Logic0():
    # 0 Line 1
    midpoint(350, 100, 350, 300)
    # 0 Line 2
    midpoint(350, 300, 450, 300)
    # 0 Line 3
    midpoint(450, 100, 450, 300)
    # 0 Line 4
    midpoint(350, 100, 450, 100)