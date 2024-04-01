package Homeworks;

public class IntegerToRoman {
    public String intToRoman(double num) {
        String str="";
        double g=num;
        boolean k= false;
        if(num/1000>=1){
            int i;
            for(i=0; i<num/1000-1; i++){
                str+="M";

            };
            k=true;
            g-=1000*i;
        }
        if(g/500>=1){
            int i;
            for(i=0; i<g/500-1; i++){
                str+="D";

            };
            g-=500*i;
        }
        if(num/100>=1){
            int i=0;

            for(i=0; i<g/100-1; i++){
                str+="C";

            };
            g-=100*i;
        }
        if(num/50>=1){
            int i;

            for(i=0; i<g/50-1; i++){
                str+="L";

            };
            g-=50*i;

        }
        if(num/10>=1){
            int i;

            for(i=0; i<g/10-1; i++){
                str+="X";

            };
            g-=10*i;

        }
        if(g/5>=1){
            str+="V";
            g-=5;
        }
        if(g<5){
            int i;

            for(i=0; i<g; i++){
                str+="I";
            };
        }

        return str;
    }

    public static void main(String[] args) {
        IntegerToRoman l= new IntegerToRoman();
        System.out.println(l.intToRoman(1781));
        System.out.println(l.intToRoman(1784));
        System.out.println(l.intToRoman(1788));
        System.out.println(l.intToRoman(1994));

        System.out.println(3000%1000);
    }
}
