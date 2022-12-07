import javax.sql.rowset.spi.SyncResolver;

    public class DP_PaintFence {
        public static void main(String[] args) {
        int n = 8;
        int k = 3;

        int same = k*1;
        int differents = k*(k-1);
        int total = same + differents;

        for(int i = 3; i <=n; i++){
            same = differents * 1;
            differents = total * (k - 1);
            total = same + differents;
        }

        System.out.println(total);
    }

}
