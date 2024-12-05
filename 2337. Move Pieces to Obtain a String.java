// t.c = O(n) and  s.c = O(1)
class Solution {
  public boolean canChange(String start, String target) {
    int lRemaining = 0, rRemaining = 0;
    int n = start.length();
    for (int i = 0; i < n; i++) {
      char ti = target.charAt(i);
      char si = start.charAt(i);

      if (ti == 'L') {
        if (rRemaining > 0) {
          return false;
        }
        lRemaining++;
      }

      if (si == 'L') {
        if (lRemaining < 1) {
          return false;
        }
        lRemaining--;
      }

      if (si == 'R') {
        if (lRemaining > 0) {
          return false;
        }
        rRemaining++;
      }
      
      if (ti == 'R') {
        if (rRemaining < 1) {
          return false;
        }
        rRemaining--;
      }
    }
    return lRemaining == 0 && rRemaining == 0;
  }
}
