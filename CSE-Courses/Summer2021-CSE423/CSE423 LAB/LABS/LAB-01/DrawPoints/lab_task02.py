from OpenGL.GL import *


def drawLines():
    glPointSize(5)
    glBegin(GL_LINES)

    # Line 01
    glVertex2f(200, 250)
    glVertex2f(320, 380)
    # Line 02
    glVertex2f(200, 250)
    glVertex2f(420, 250)
    # Line 03
    glVertex2f(420, 250)
    glVertex2f(430, 250)
    # Line 04
    glVertex2f(320, 380)
    glVertex2f(430, 250)
    # Line 05
    glVertex2f(200, 250)
    glVertex2f(200, 100)
    # Line 06
    glVertex2f(200, 100)
    glVertex2f(200, 50)
    # Line 07
    glVertex2f(200, 50)
    glVertex2f(320, 50)
    # Line 08
    glVertex2f(320, 50)
    glVertex2f(430, 50)
    # Line 09
    glVertex2f(430, 50)
    glVertex2f(430, 250)

    # Door
    # Line 10
    glVertex2f(360, 50)
    glVertex2f(360, 160)
    # Line 11
    glVertex2f(360, 160)
    glVertex2f(280, 160)
    # Line 12
    glVertex2f(280, 160)
    glVertex2f(280, 50)

    # Window 01
    # Line 13
    glVertex2f(410, 180)
    glVertex2f(360, 180)
    # Line 12
    glVertex2f(360, 180)
    glVertex2f(360, 220)
    # Line 13
    glVertex2f(360, 220)
    glVertex2f(410, 220)
    # Line 14
    glVertex2f(410, 220)
    glVertex2f(410, 180)

    # Window 02
    # Line 15
    glVertex2f(220, 180)
    glVertex2f(270, 180)
    # Line 16
    glVertex2f(270, 180)
    glVertex2f(270, 220)
    # Line 17
    glVertex2f(270, 220)
    glVertex2f(220, 220)
    # Line 18
    glVertex2f(220, 220)
    glVertex2f(220, 180)

    # glBegin(GL_POINT)
    # glVertex2f(0, 1)
    # glEnd()

    glEnd()
