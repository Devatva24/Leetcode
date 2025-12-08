class Solution {
    public int countTriples(int n) {
        int count = 0;

        for (int m = 2; m * m <= n; m++) {
            for (int nn = 1; nn < m; nn++) {
                // check coprime and opposite parity
                if ((m - nn) % 2 == 1 && gcd(m, nn) == 1) {
                    int a = m * m - nn * nn;
                    int b = 2 * m * nn;
                    int c = m * m + nn * nn;

                    int k = 1;
                    while (k * c <= n) {
                        count++;
                        k++;
                    }
                }
            }
        }

        return count * 2;
    }

    private int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
