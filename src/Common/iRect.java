/*
 * MIT License
 *
 * Copyright (c) 2017
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package Common;

/**
 * Прямоугольник.
 */
public class iRect {

    public int x, y, w, h;

    public iRect(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public iRect(iSize size) {
        this(0, 0, size.w, size.h);
    }

    public iRect(iRect other) {
        this(other.x, other.y, other.w, other.h);
    }

    public void DeflateRect(int Int) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int y2() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public iPoint point() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void plus(iRect other) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void plus(iPoint point) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public iSize size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean PtInRect(iPoint pos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
