from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *


class Drawings:

    def drawPoints(self):
        glPointSize(5)
        glBegin(GL_POINTS)
        glVertex2f(200, 250)
        glVertex2f(250, 250)
        glVertex2f(300, 250)
        glEnd()

    def drawLine(self):
        glBegin(GL_LINES)
        glVertex2f(200, 250)
        glVertex2f(250, 250)
        glVertex2f(250, 250)
        glVertex2f(250, 300)
        glVertex2f(250, 300)
        glVertex2f(200, 250)
        glEnd()

    def drawTriangle(self):
        glBegin(GL_TRIANGLES)
        glVertex2f(200, 250)
        glVertex2f(250, 250)
        glVertex2f(250, 300)
        glEnd()

    def drawQuads(self):
        glBegin(GL_QUADS)
        glVertex2f(200, 250)
        glVertex2f(250, 250)
        glVertex2f(250, 300)
        glVertex2f(200, 300)
        glEnd()

    # -1 < n < 1
    def DDA(self, x1, y1, x2, y2):
        n = (y1 - y2) / (x1 - x2)
        glBegin(GL_POINTS)
        glVertex2f(x1, y1)
        while x1 < x2:
            x1 += 1
            y1 += n
            glVertex2f(x1, round(y1))
        glEnd()


# def iterate():
#     glViewport(0, 0, 500, 500)
#     glMatrixMode(GL_PROJECTION)
#     glLoadIdentity()
#     glOrtho(0.0, 500, 0.0, 500, 0.0, 1.0)
#     glMatrixMode(GL_MODELVIEW)
#     glLoadIdentity()
#
#
# def showScreen():
#     glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)
#     glLoadIdentity()
#     iterate()
#     glColor3f(0.0, 1.0, 0.0)
#
#     # call the draw methods here
#     DDA(100, 100, 200, 150)
#
#     glutSwapBuffers()


if __name__ == "__main__":
    glutInit()
    glutInitDisplayMode(GLUT_RGBA)
    glutInitWindowSize(1000, 500)
    glutInitWindowPosition(0, 0)
    wind = glutCreateWindow(b"OpenGL Coding Practice")
    # glutDisplayFunc(showScreen)
    # glutIdleFunc(showScreen)
    glutMainLoop()
