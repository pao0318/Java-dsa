import java.util.*;

class ZippedIterator {
    int curr;
    int ap;
    int bp;
    int[] a;
    int[] b;
    public ZippedIterator(int[] a, int[] b) {
        this.a = a;
        this.b = b;
        ap = 0;
        bp = 0;
        curr = 1;
    }

    public int next() {
        // if one arrays length is greater than the others, at one point we will have to solely
        // iterate from the remaining longer array.
        if (ap == a.length) {
            bp++;
            return b[bp - 1];
        } else if (bp == b.length) {
            ap++;
            return a[ap - 1];
        }

        // this is the average case.
        curr = 1 - curr;
        if (curr == 0) {
            ap++;
            return a[ap - 1];
        }
        bp++;
        return b[bp - 1];
    }

    public boolean hasnext() {
        return ap != a.length || bp != b.length;
    }
}
