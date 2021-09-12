from OpenGL.GL import *


def midpoint(sx, sy, ex, ey):
    glBegin(GL_POINTS)
    dy = ey - sy
    dx = ex - sx

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
                d += 2 * dy
        glVertex2f(sx, sy)
    glEnd()


def convertToZone0(x, y):
    rx = x
    ry = (-1) * y
    return rx, ry


def convertToOriginal(x, y):
    rx = x
    ry = (-1) * y
    return rx, ry


def midpoint_zone7(sx, sy, ex, ey):
    glBegin(GL_POINTS)
    sx, sy = convertToZone0(sx, sy)
    ex, ey = convertToZone0(ex, ey)
    dy = ey - sy
    dx = ex - sx

    d_init = (2 * dy) - dx
    d = d_init

    while sx != ex and sy != ey:
        x0, y0 = convertToOriginal(sx, sy)
        glVertex2f(x0, y0)
        if d > 0:
            sx += 1
            sy += 1
            d += 2 * (dy - dx)
        else:
            sx += 1
            d += 2 * dy
        glVertex2f(x0, y0)
    glEnd()


def outerBorder_Logic():
    midpoint(200, 100, 450, 100)
    midpoint(200, 100, 200, 400)
    midpoint(450, 100, 450, 400)


def door_Logic():
    midpoint(280, 100, 280, 250)
    midpoint(370, 100, 370, 250)
    midpoint(280, 250, 370, 250)


def hood_Logic():
    midpoint(150, 400, 500, 400)
    midpoint(150, 400, 325, 500)
    midpoint_zone7(325, 500, 500, 400)
