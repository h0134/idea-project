public class Arrays {
    public static void main(String[] args) {
        int[][] num = {{1, 2, 3}, {4, 5, 6}, {4, 2, 3}};

        for (int i = 0; i < num.length; ++i) {
            for (int j = 0; j < num[i].length; ++j) {
                System.out.println(num[i][j]);
            }
        }

    }
}
