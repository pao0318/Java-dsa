import java.util.*;

class TwoDimensionalIterator {
    int i, j;
    int[][] lists;
    public TwoDimensionalIterator(int[][] lists) {
        i = 0;
        j = 0;
        this.lists = lists;
    }

    public int next() {
        while(i<lists.length &&j>=lists[i].length){
            j=0;
            i++;
        }
        j++;

        return lists[i][j-1];
    }

    public boolean hasnext() {
        while (i < lists.length && j >= lists[i].length) {
            i++;
            j = 0;
        }

        if (i >= lists.length || j >= lists[i].length) {
            return false;
        } else {
            return true;
        }
    }
}
