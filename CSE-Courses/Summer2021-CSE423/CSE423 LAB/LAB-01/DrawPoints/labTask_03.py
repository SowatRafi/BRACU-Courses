from OpenGL.GL import *


def even():
    glPointSize(5)
    for i in range(100, 301):
        glBegin(GL_POINTS)
        glVertex2f(390, i)
        # glVertex2f(460, 300)
        glEnd()


def dash():
    glBegin(GL_POINTS)
    i = 290
    while i < 491:
        glVertex2f(i, 301)
        i = i + 10

    glEnd()
