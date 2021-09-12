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
    # Lower Line
    midpoint(200, 100, 450, 100)
    # Left Line
    midpoint(200, 100, 200, 300)
    # Right Line
    midpoint(450, 100, 450, 300)


def door_Logic():
    # Left Line
    midpoint(280, 100, 280, 230)
    # Right Line
    midpoint(370, 100, 370, 230)
    # Upper Line
    midpoint(280, 230, 370, 230)


def hood_Logic():
    # Lower Line
    midpoint(150, 300, 500, 300)
    # Left Line
    midpoint(150, 300, 325, 400)
    # For matching the right line
    midpoint_zone7(325, 400, 500, 300)