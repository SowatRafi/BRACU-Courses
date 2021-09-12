from OpenGL.GL import *


def Draw_Circle():
    Draw_MidPoint_Circle(120, 120, 100)
    Draw_MidPoint_Circle(170, 120, 50)
    Draw_MidPoint_Circle(120, 170, 50)
    Draw_MidPoint_Circle(70, 120, 50)
    Draw_MidPoint_Circle(120, 70, 50)


def draw_Points(x, y):
    glPointSize(3)
    glBegin(GL_POINTS)
    glVertex2f(x, y)
    glEnd()


def Draw_MidPoint_Circle(x_, y_, r):
    x = r
    y = 0
    draw_Points(x + x_, y + y_)
    if r > 0:
        draw_Points(x + x_, -y + y_)
        draw_Points(y + x_, x + y_)
        draw_Points(-y + x_, x + y_)
    xp = 1 - r
    while x > y:
        y += 1
        if xp <= 0:
            xp = xp + 2 * y + 1
        else:
            x -= 1
            xp = xp + 2 * y - 2 * x + 1

        draw_Points(x + x_, y + y_)
        draw_Points(-x + x_, y + y_)
        draw_Points(x + x_, -y + y_)
        draw_Points(-x + x_, -y + y_)
        draw_Points(y + x_, x + y_)
        draw_Points(-y + x_, x + y_)
        draw_Points(y + x_, -x + y_)
        draw_Points(-y + x_, -x + y_)
