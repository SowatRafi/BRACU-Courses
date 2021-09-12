from OpenGL.GL import *
from OpenGL.GLUT import *
from MidPoint import Task02


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
    glColor3f(0, 1, 0)
    glPointSize(5)

    # outer border
    Task02.outerBorder_Logic()
    # door
    Task02.door_Logic()
    # hood
    Task02.hood_Logic()

    glutSwapBuffers()


if __name__ == "__main__":
    glutInit()
    glutInitDisplayMode(GLUT_RGBA)
    glutInitWindowSize(500, 500)
    glutInitWindowPosition(0, 0)
    wind = glutCreateWindow(b"18101140")
    glutDisplayFunc(showScreen)
    glutIdleFunc(showScreen)
    glutMainLoop()
