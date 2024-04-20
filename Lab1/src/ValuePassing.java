public class ValuePassing {
    public static int changei(int i){
        int[] a = {i};
        ++i;
        return (i+a[0]);
    }

    public static void main(String[] args){
        int i = 2;
        {
            i = i + 3;
            int y = 4;
            y = ++y;
        }
        int return_i = 0;
        return_i = changei(i);
    }
}
