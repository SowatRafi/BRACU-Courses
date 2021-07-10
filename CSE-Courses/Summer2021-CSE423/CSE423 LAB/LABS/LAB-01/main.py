from OpenGL.GL import *
from OpenGL.GLUT import *
# from OpenGL.GLU import *
# from DrawPoints import BasicDrawings
# from DrawPoints import labTask_01
from DrawPoints import lab_task02

# draw = BasicDrawings.Drawings()


def iterate():
    glViewport(0, 0, 500, 500)
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(0.0, 500, 0.0, 500, 0.0, 1.0)
    glMatrixMode(GL_MODELVIEW)
    glLoadIdentity()


def showScreen():
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)
    glLoadIdentity()
    iterate()

    glColor3f(0.0, 1.0, 0.0)

    # call the draw methods here
    # labTask_01.something()
    lab_task02.drawLines()
    lab_task02.Point()

    glutSwapBuffers()


if __name__ == "__main__":
    glutInit()
    glutInitDisplayMode(GLUT_RGBA)
    glutInitWindowSize(1000, 500)
    glutInitWindowPosition(0, 0)
    wind = glutCreateWindow(b"OpenGL Coding Practice")
    glutDisplayFunc(showScreen)
    glutIdleFunc(showScreen)
    glutMainLoop()
