package p1;
public class Main {
    public static void main(String[] args) {
        String a[]={"wow", "samp", "masina"};
        String b[]={"test", "wow", "samp"};

        for(int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                if(a[i].equals(b[j]))
                    System.out.println(a[i]);
            }
        }
    }
}