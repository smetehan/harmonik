

public class project {


    public static void main(String[] args) {

      double[] num={1,2,3,4,5,6};
        double sum=0.0;
        double hm=0.0;
        double gn = 0.0;


        for(int i=0; i<num.length; i++){
            gn+=(1/num[i]);
            hm=num.length/gn;
            System.out.println(num[i]);
        }
        System.out.println("---------------");
        System.out.println(num.length);
        System.out.println(gn);
        System.out.println(hm);

    }


}



